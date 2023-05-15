package compiler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import static compiler.util.ERROR.*;

import compiler.util.Component;
import compiler.util.ERROR;
import compiler.util.Flag;
import compiler.util.Wire;

public class Handler {

	List<String> listWindowsOptions = Arrays.asList("Invisibile", "Center", "Left", "Right", "Top", "Bottom", "VCenter",
			"VLeft", "VRight", "VTop", "VBottom");
	List<String> listIOPinAttr = Arrays.asList("In", "Out", "BiDir");
	List<String> listSymbolType = Arrays.asList("res", "res2", "cap", "ind", "ind2", "diode", "schottky", "zener",
			"varactor", "LED", "TVSdiode", "pnp", "pnp2", "pnp4", "npn", "npn2", "npn3", "npn4", "voltage", "current",
			"nmos", "nmos4", "pmos", "polcap");
	List<String> listMirrorType = Arrays.asList("M0", "M90", "M180", "M270");
	List<String> listRotType = Arrays.asList("R0", "R90", "R180", "R270");
	List<String> listSymAttr = Arrays.asList("InstName", "Description", "Type", "Value", "SpiceLine");
	List<String> listDescAttr = Arrays.asList("Diode", "Capacitor", "Polarized");
	List<String> listCapAttribute = Arrays.asList("V", "Irms", "Lser", "mfg", "pn", "type");
	List<String> listIndAttribute = Arrays.asList("Ipk", "mfg", "pn");
	List<String> listParAttribute = Arrays.asList("Rser", "Rpar", "Cpar");
	List<String> listRAttribute = Arrays.asList("tol", "pwr");

	private boolean typeAttributePresent;
	private boolean descAttributePresent;

	private boolean polarizedPresent; // to handle Polarized Capacitor description
	private boolean capacitorPresent; // to handle Polarized Capacitor description

	private OutputStreamWriter fileOut;

	TokenStream input;
	Component lastComponent;
	List<String> errorList;

	List<Component> components;
	List<Wire> wires;
	List<Flag> flags;

	public Handler(TokenStream input) {
		System.out.println("------ Handler Init ------");

		this.input = input;
		errorList = new ArrayList<String>();
		components = new ArrayList<Component>();
		wires = new ArrayList<Wire>();
		flags = new ArrayList<Flag>();

		lastComponent = null;

		try {
			Files.createDirectories(Paths.get("./circuit_output/")); // create folder for circuit output
			fileOut = new OutputStreamWriter(new FileOutputStream("./circuit_output/formatted_circuit.asc", false),
					StandardCharsets.ISO_8859_1);
			fileOut.write("");
			fileOut.close();
			fileOut = new OutputStreamWriter(new FileOutputStream("./circuit_output/formatted_circuit.asc", true),
					StandardCharsets.ISO_8859_1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<String> getErrorList() {
		return errorList;
	}

	public void handleError(Token tk, String hdr, String msg) {
		String errMsg;
		if (tk == null)
			tk = input.LT(-1);

		if (tk.getType() == Ltspice2circuitikzLexer.ERROR_TK)
			errMsg = "Lexical Error (" + LEXICAL_ERROR + ")";
		else
			errMsg = "Syntax Error (" + SYNTAX_ERROR + ")";

		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "] " + " on token '" + tk.getText()
				+ "'";

		errorList.add(errMsg);
	}

	void myErrorHandler(ERROR code, Token tk) {
		String errMsg;

		if (code == LEXICAL_ERROR)// it should never happen
			errMsg = "Fake Lexical Error " + code;
		else if (code == SYNTAX_ERROR)// it should never happen
			errMsg = "Fake Syntax Error " + code;
		else
			errMsg = "Semantic Error (" + code + ")";

		if (tk == null)
			tk = input.LT(-1);

		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "]: ";

		switch (code) {
		case VERSION_ERROR:
			errMsg += "Expected version number '4' but found version number equal to '" + tk.getText() + "'";
			break;
		case ATTRIBUTE_ERROR:
			errMsg += "ID '" + tk.getText() + "' is not an attribute";
			break;
		case WINDOWOPTION_ERROR:
			errMsg += "Windows Option '" + tk.getText() + "' is not valid";
			break;
		case IOPINATTR_ERROR:
			errMsg += "IO Pin Attribute '" + tk.getText() + "' is not valid";
			break;
		case SYMBOLTYPE_ERROR:
			errMsg += "Symbol Type '" + tk.getText() + "' is not valid";
			break;
		case ROTATIONTYPE_ERROR:
			errMsg += "Rotation Type '" + tk.getText() + "' is not valid";
			break;
		case MIRRORTYPE_ERROR:
			errMsg += "Mirror Type '" + tk.getText() + "' is not valid";
			break;
		case ROTMIRR_ERROR:
			errMsg += "Rotation/Mirror Type '" + tk.getText() + "' is not valid";
			break;
		case SYMATTRTYPE_ERROR:
			errMsg += "SYMATTR Type '" + tk.getText() + "' is not valid";
			break;
		case DESCRIPTION_ERROR:
			errMsg += "Description Type '" + tk.getText() + "' is not valid";
			break;
		case DESCRIPTION_NOT_ALLOWED:
			errMsg += "Description Type '" + tk.getText() + "' not allowed for this symbol";
			break;
		case DESCRIPTION_POLARIZED_ERROR:
			errMsg += "Description Type '" + tk.getText() + "' is not valid: expected Polarized Capacitor";
			break;
		case DESCRIPTION_POLARIZED_NOCAPACITOR_ERROR:
			errMsg += "Description Type of '" + tk.getText() + "' is not valid: expected also Capacitor";
			break;
		case TYPE_ERROR:
			errMsg += "Type value '" + tk.getText() + "' is not valid";
			break;
		case SPICELINEVALUE_ERROR:
			errMsg += "SpiceLine value '" + tk.getText() + "' is not valid";
			break;
		case SYMBOLTYPENULL_ERROR:
			errMsg += "The SpiceLine value '" + tk.getText() + "' has no symbol reference";
			break;
		case MISS_TYPEATTR_ERROR:
			errMsg += "Missing type attribute for previous symbol '" + tk.getText() + "' ";
			break;
		case MISS_DESCATTR_ERROR:
			errMsg += "Missing desc attribute for previous symbol '" + tk.getText() + "' ";
			break;
		default:
			errMsg += "Message error not defined, please contact support";

		}
		errorList.add(errMsg);
	}

	public void checkVersion(Token v, Token ver) {
		if (ver != null) {
			String version = ver.getText();
			if (version.compareTo("4") == 0)
				System.out.println("Version number is correct");
			else {
				System.out.println("Version number is not correct");
				myErrorHandler(VERSION_ERROR, ver);
			}

			appendRuleToStream(false, true, true, v, ver);
		} else {
			System.err.println("Version null!!");
		}
	}

	public void checkWindowsOptions(Token id, Token w, Token i1, Token i2, Token i3, Token i4) {
		if (id != null) {
			String wOption = id.getText();
			if (listWindowsOptions.contains(wOption))
				System.out.println("Windows option is correct");
			else {
				System.out.println("Windows option is not correct");
				myErrorHandler(WINDOWOPTION_ERROR, id);
			}

			appendRuleToStream(false, true, true, w, i1, i2, i3, id, i4);
		} else {
			System.err.println("Windows Options null!!");
		}
	}

	public void checkIOPinAttr(Token id, Token i, Token i1, Token i2) {
		if (id != null) {
			String ioPinAttr = id.getText();
			if (listIOPinAttr.contains(ioPinAttr))
				System.out.println("IO Pin Attribute is correct");
			else {
				System.out.println("IO Pin Attribute is not correct");
				myErrorHandler(IOPINATTR_ERROR, id);
			}

			appendRuleToStream(false, true, true, i, i1, i2, id);
		} else {
			System.err.println("IO Pin Attribute null!!");
		}
	}

	public void checkSymbolType(Token token) {
		if (token != null && !token.getText().contains("missing")) {

			checkMandatoryAttribute();

			String symbolType = token.getText();
			if (listSymbolType.contains(symbolType)) {
				System.out.println("Symbol type is correct");

				typeAttributePresent = false;
				descAttributePresent = false;
				polarizedPresent = false;
				capacitorPresent = false;

				if (lastComponent != null)
					components.add(lastComponent);

				lastComponent = new Component(token);
				lastComponent.setType(symbolType);

			} else {
				System.out.println("Symbol type is not correct");
				myErrorHandler(SYMBOLTYPE_ERROR, token);
			}
		} else {
			System.err.println("Symbol type null!!");
		}
	}

	public void checkRotType(Token rotToken, Token s, Token symbolType, Token i1, Token i2) {
		if (rotToken != null) {
			if (tryParseInt(i1.getText()) && tryParseInt(i2.getText())) {
				String rotType = rotToken.getText();
				if (rotType.startsWith("R") || rotType.startsWith("r")) {
					if (listRotType.contains(rotType)) {
						System.out.println("Rotation type is correct");
						if (lastComponent != null) {
							int x = Integer.parseInt(i1.getText());
							int y = Integer.parseInt(i2.getText());

							lastComponent.setRotation(rotType);
							lastComponent.setPosition(x, y);
						}
						appendRuleToStream(false, true, true, s, symbolType, i1, i2, rotToken);
					} else {
						System.out.println("Rotation type is not correct");
						myErrorHandler(ROTATIONTYPE_ERROR, rotToken);
					}
				} else if (rotType.startsWith("m") || rotType.startsWith("M")) {
					if (listMirrorType.contains(rotType)) {
						System.out.println("Mirror type is correct");

						if (lastComponent != null) {
							int x = Integer.parseInt(i1.getText());
							int y = Integer.parseInt(i2.getText());

							lastComponent.setRotation(rotType);
							lastComponent.setPosition(x, y);
						}
						appendRuleToStream(false, true, true, s, symbolType, i1, i2, rotToken);
					} else {
						System.out.println("Mirror type is not correct");
						myErrorHandler(MIRRORTYPE_ERROR, rotToken);
						
					}
				} else {
					System.out.println("Rotation/Mirror type not recognised");
					myErrorHandler(ROTMIRR_ERROR, rotToken);
				}
			} else {
				System.out.println("Try parse int failed!!!");
			}
		} else {
			System.out.println("Rotation type null!!");
		}
	}

	public void checkSymMattrAttr(Token id1, Token s) {
		if (id1 != null) {
			String symAttr = id1.getText();
			if (listSymAttr.contains(symAttr))
				System.out.println("SYMATTR type is correct");
			else {
				System.out.println("SYMATTR type is not correct");
				myErrorHandler(SYMATTRTYPE_ERROR, id1);
			}

			appendRuleToStream(false, true, false, s, id1);
		} else {
			System.err.println("SYMATTR type null!!");
		}
	}

	public void checkSymMattrAttrValue(Token tokenSymAttr, Object tokenSymAttrValue, Token value) {
		if (tokenSymAttr != null && tokenSymAttrValue != null) {
			String symAttr = tokenSymAttr.getText();
			String symAttrValue;
			if (tokenSymAttrValue instanceof Token)
				symAttrValue = ((Token) tokenSymAttrValue).getText();
			else
				symAttrValue = tokenSymAttrValue.toString();

			if (symAttr.compareTo("Description") == 0) {
				if (listDescAttr.contains(symAttrValue)) {

					if (lastComponent != null) {

						descAttributePresent = true;
						if (lastComponent.getToken().getText().equals("schottky")
								|| lastComponent.getToken().getText().equals("zener")
								|| lastComponent.getToken().getText().equals("LED")) {
							if (symAttrValue.compareTo("Diode") == 0)
								System.out.println("Description type for diode is correct");
							else {
								System.out.println("Description type for diode is not correct");
								myErrorHandler(DESCRIPTION_ERROR, (Token) tokenSymAttrValue);
							}
						}

						else if (lastComponent.getToken().getText().equals("polcap")) {
							if (symAttrValue.compareTo("Capacitor") == 0)
								System.out.println("Description type for polcap is correct");
							else {
								System.out.println("Description type for polcap is not correct");
								myErrorHandler(DESCRIPTION_ERROR, (Token) tokenSymAttrValue);
							}
						} else if (lastComponent.getToken().getText().equals("cap")) {
							if (symAttrValue.equals("Polarized")) {
								System.out.println("Description type for cap is correct");
								polarizedPresent = true;
							} else {
								System.out.println("Description type for cap is not correct");
								myErrorHandler(DESCRIPTION_ERROR, (Token) tokenSymAttrValue);
							}
						}

					} else {
						System.out.println("No symbol to refer Description value");
						myErrorHandler(SYMBOLTYPENULL_ERROR, (Token) tokenSymAttrValue);
					}
				} else {
					System.out.println("Description type is not correct ");
					if (tokenSymAttrValue instanceof Token)
						myErrorHandler(DESCRIPTION_ERROR, (Token) tokenSymAttrValue);
					else
						myErrorHandler(DESCRIPTION_ERROR, value);
				}
			}

			else if (symAttr.compareTo("Type") == 0) {

				if (lastComponent != null) {

					typeAttributePresent = true;
					if (lastComponent.getToken().getText().equals("schottky")
							|| lastComponent.getToken().getText().equals("zener")
							|| lastComponent.getToken().getText().equals("varactor")
							|| lastComponent.getToken().getText().equals("LED")) {
						if (symAttrValue.compareTo("diode") == 0)
							System.out.println("Type for diode is correct");
						else {
							System.out.println("Type for diode is not correct");
							myErrorHandler(TYPE_ERROR, (Token) tokenSymAttrValue);
						}
					}

					if (lastComponent.getToken().getText().equals("polcap")) {
						if (symAttrValue.compareTo("cap") == 0)
							System.out.println("Type for cap is correct");
						else {
							System.out.println("Type for cap is not correct");
							myErrorHandler(TYPE_ERROR, (Token) tokenSymAttrValue);
						}
					}
				} else {
					System.out.println("No symbol to refer Type value");
					myErrorHandler(SYMBOLTYPENULL_ERROR, (Token) tokenSymAttrValue);
				}
			} else if (symAttr.compareTo("SpiceLine") == 0) {
				if (lastComponent != null) {
					switch (lastComponent.getToken().getText()) {
					case "res":
					case "res2":
						checkResAttribute(tokenSymAttrValue);
						break;
					case "cap":
					case "polcap":
						checkCapAttribute(tokenSymAttrValue);
						break;
					case "ind":
					case "ind2":
						checkIndAttribute(tokenSymAttrValue);
						break;
					case "voltage":
						checkVoltageAttribute(tokenSymAttrValue);
						break;
					default:
						System.err.println("Symbol attribute " + lastComponent.getToken().getText()
								+ " not already taken in consideration");
						break;
					}
				} else {
					System.out.println("No symbol to refer SpiceLine value");
					myErrorHandler(SYMBOLTYPENULL_ERROR, (Token) tokenSymAttrValue);
				}
			} else if (symAttr.compareTo("Value") == 0) {
				if (lastComponent != null) {
					if (value == null) {
						lastComponent.setValue(((Token) tokenSymAttrValue).getText());
					} else {
						lastComponent.setValue(value.getText());
					}
				}
			} else if (symAttr.compareTo("InstName") == 0) {
				if (lastComponent != null) {
					if (value == null) {
						lastComponent.setName(((Token) tokenSymAttrValue).getText());
					} else {
						lastComponent.setName(value.getText());
					}
				}
			}

			if (!symAttrValue.equals("reserved")) { // reservedWorldRule append the string
				if (value == null) {
					appendRuleToStream(true, false, false, (Token) tokenSymAttrValue);
				} else {
					appendRuleToStream(true, false, false, value);
				}
			}
		} else {
			System.err.println("SYMATTR type/value null!!");
		}
	}

	public void checkPolarizedCapacitor(Token id1, Token id2, Token id3) {
		if (lastComponent.getToken().getText().equals("cap")) {
			if (id2.getText().compareTo("Polarized") == 0) {
				System.out.println("Description type for cap is correct: Polarized");
				if (id3.getText().equals("Capacitor")) {
					System.out.println("Description type for cap is correct: Capacitor");
					capacitorPresent = true;
				} else {
					System.out.println("Description type for cap is correct: expected Capacitor");
					myErrorHandler(DESCRIPTION_POLARIZED_ERROR, id3);
				}
			} else {
				System.out.println("Description type for cap is correct: expected Polarized");
				myErrorHandler(DESCRIPTION_POLARIZED_ERROR, id2);
			}

		} else {
			System.out.println("Description type for this symbol is not allowed");
			myErrorHandler(DESCRIPTION_NOT_ALLOWED, lastComponent.getToken());
		}
		appendRuleToStream(true, false, false, id3);

	}

	public void checkMandatoryAttribute() {

		if (lastComponent != null) {
			if (lastComponent.getToken().getText().equals("varactor")
					|| lastComponent.getToken().getText().equals("schottky")
					|| lastComponent.getToken().getText().equals("zener")
					|| lastComponent.getToken().getText().equals("LED")) {

				if (!typeAttributePresent) {
					System.out.println("Missing Type attribute for SYMBOL");
					myErrorHandler(MISS_TYPEATTR_ERROR, lastComponent.getToken());
				}

				if (!lastComponent.getToken().getText().equals("varactor") && !descAttributePresent) {
					System.out.println("Missing Desc attribute for SYMBOL");
					myErrorHandler(MISS_DESCATTR_ERROR, lastComponent.getToken());
				}
			} else if (lastComponent.getToken().getText().equals("cap") && descAttributePresent) {
				if (polarizedPresent && !capacitorPresent) {
					System.out.println("Missing capacitor for in description");
					myErrorHandler(DESCRIPTION_POLARIZED_NOCAPACITOR_ERROR, lastComponent.getToken());
				}
			}
		}
	}

	private void checkResAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token) tokenSymAttrValue).getText();
		if (listRAttribute.contains(symAttrValue)) {
			System.out.println("SpiceLine res value is correct");
		} else {
			System.out.println("SpiceLine res value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token) tokenSymAttrValue);
		}
	}

	private void checkCapAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token) tokenSymAttrValue).getText();
		if (listCapAttribute.contains(symAttrValue) || listParAttribute.contains(symAttrValue)) {
			System.out.println("SpiceLine cap value is correct");
		} else {
			System.out.println("SpiceLine cap value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token) tokenSymAttrValue);
		}
	}

	private void checkIndAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token) tokenSymAttrValue).getText();
		if (listIndAttribute.contains(symAttrValue) || listParAttribute.contains(symAttrValue)) {
			System.out.println("SpiceLine ind value is correct");
		} else {
			System.out.println("SpiceLine ind value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token) tokenSymAttrValue);
		}
	}

	private void checkVoltageAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token) tokenSymAttrValue).getText();
		if (symAttrValue.equals("Rser")) {
			System.out.println("SpiceLine voltage value is correct");
		} else {
			System.out.println("SpiceLine voltage value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token) tokenSymAttrValue);
		}
	}

	public void createWire(boolean addBeforeWS, boolean addAfterWS, boolean addEndLine, Token... tokens) {
		if (tryParseInt(tokens[1].getText()) && tryParseInt(tokens[2].getText()) && tryParseInt(tokens[3].getText())
				&& tryParseInt(tokens[4].getText())) {
			appendRuleToStream(addBeforeWS, addAfterWS, addEndLine, tokens);

			Wire wire = new Wire(Integer.parseInt(tokens[1].getText()), Integer.parseInt(tokens[2].getText()),
					Integer.parseInt(tokens[3].getText()), Integer.parseInt(tokens[4].getText()));

			wires.add(wire);
		}
	}

	public void handleFlag(boolean addBeforeWS, boolean addAfterWS, boolean addEndLine, Token... tokens) {
		if (tryParseInt(tokens[1].getText()) && tryParseInt(tokens[2].getText())) {
			flags.add(new Flag(Integer.parseInt(tokens[1].getText()), Integer.parseInt(tokens[2].getText()),
					tokens[3].getText()));
			appendRuleToStream(addBeforeWS, addAfterWS, addEndLine, tokens);
		} else {
			System.out.println("Try parse int failed!!!");
		}

	}

	public void appendRuleToStream(boolean addBeforeWS, boolean addAfterWS, boolean addEndLine, Token... tokens) {
		try {
			int i = 0;
			while (i < tokens.length - 1) {
				fileOut.append((addBeforeWS ? " " : "") + tokens[i].getText() + (addAfterWS ? " " : ""));
				i++;
			}
			if (tokens.length != 0)
				fileOut.append((addBeforeWS ? " " : "") + tokens[i].getText());
			if (addEndLine)
				fileOut.append("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void closeFileOut() {
		try {
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// la toglierei, non ci serve più
	public void printComponents() {

		if (lastComponent != null)
			components.add(lastComponent);

		for (Component c : components) {
			System.out.println(c);
		}

		for (Wire w : wires) {
			System.out.println(w);
		}
		for (Flag f : flags) {
			System.out.println(f);
		}
	}

	public void endOfFileChecks() {

		checkMandatoryAttribute();
		printComponents();
		closeFileOut();
		try {
			if (errorList.isEmpty())
				LatexConverter.convertToLatex(components, wires, flags);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean tryParseInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
