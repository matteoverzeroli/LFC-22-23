package com.omega.compiler;

import static com.omega.compiler.util.error.Error.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import com.omega.compiler.util.AttributeList;
import com.omega.compiler.util.Component;
import com.omega.compiler.util.Flag;
import com.omega.compiler.util.Wire;
import com.omega.compiler.util.error.Error;
import com.omega.compiler.util.error.ErrorMessage;

public class Handler {

	private boolean typeAttributePresent;
	private boolean descAttributePresent;

	private boolean polarizedPresent; // to handle Polarized Capacitor description
	private boolean capacitorPresent; // to handle Polarized Capacitor description

	private TokenStream input; // input token stream
	private Component lastComponent; // last read component

	private OutputStreamWriter fileFormattedOut; // stream used to create formatted version of the circuit file

	private List<String> errorList; // list of lexical, syntax and semantic errors

	private List<Component> components; // list of read components
	private List<Wire> wires; // list of read wires
	private List<Flag> flags; // list of read flags components

	public Handler(TokenStream input) {
		System.out.println("------ Handler Init ------");

		this.input = input;

		errorList = new ArrayList<String>();

		components = new ArrayList<Component>();
		wires = new ArrayList<Wire>();
		flags = new ArrayList<Flag>();

		lastComponent = null;

		// create a file which contains correctly formatted .asc file
		try {
			Files.createDirectories(Paths.get("./circuit_output/")); // create folder for circuit output
			fileFormattedOut = new OutputStreamWriter(
					new FileOutputStream("./circuit_output/formatted_circuit.asc", false), StandardCharsets.ISO_8859_1);
			fileFormattedOut.write("");
			fileFormattedOut.close();
			fileFormattedOut = new OutputStreamWriter(
					new FileOutputStream("./circuit_output/formatted_circuit.asc", true), StandardCharsets.ISO_8859_1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Handles lexical and syntax errors
	 */
	public void handleError(Token tk, String hdr, String msg) {
		String errMsg;

		if (tk.getType() == Ltspice2circuitikzLexer.ERROR_TK)
			errMsg = "Lexical Error (" + LEXICAL_ERROR + ")";
		else
			errMsg = "Syntax Error (" + SYNTAX_ERROR + ")";

		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "] " + " on token '" + tk.getText()
				+ "'" + msg;

		errorList.add(errMsg);
	}

	/**
	 * Handles semantic errors
	 */
	public void myErrorHandler(Error code, Token tk) {
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

		errMsg = ErrorMessage.getErrorMessageFromCode(errMsg, code, tk);

		errorList.add(errMsg);
	}

	/**
	 * Checks if the version of the .ASC file is 4
	 */
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

	/**
	 * Checks if the WINDOW option is valid
	 */
	public void checkWindowsOptions(Token id, Token w, Token i1, Token i2, Token i3, Token i4) {
		if (id != null) {
			String wOption = id.getText();

			if (AttributeList.getListWindowsOptions().contains(wOption))
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

	/**
	 * Checks if IOPin attrubute is valid
	 */
	public void checkIOPinAttr(Token id, Token i, Token i1, Token i2) {
		if (id != null) {
			String ioPinAttr = id.getText();
			if (AttributeList.getListIOPinAttr().contains(ioPinAttr))
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

	/**
	 * Checks if the symbol type is correct
	 */
	public void checkSymbolType(Token token) {
		if (token != null && !token.getText().contains("missing")) {
			checkMandatoryAttribute();

			String symbolType = token.getText();

			if (AttributeList.getListSymbolType().contains(symbolType)) {
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

	/**
	 * Checks if the rotation type is correct
	 */
	public void checkRotType(Token rotToken, Token s, Token symbolType, Token i1, Token i2) {
		if (rotToken != null) {
			if (tryParseInt(i1.getText()) && tryParseInt(i2.getText())) {
				String rotType = rotToken.getText();

				if (rotType.startsWith("R") || rotType.startsWith("r")) {
					if (AttributeList.getListRotType().contains(rotType)) {
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
					if (AttributeList.getListMirrorType().contains(rotType)) {
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

	/**
	 * Checks the SYMATTR attribute
	 */
	public void checkSymMattrAttr(Token id1, Token s) {
		if (id1 != null) {
			String symAttr = id1.getText();

			if (AttributeList.getListSymAttr().contains(symAttr))
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

	/**
	 * Checks SYMATTR attribute values: Description, Type, SpiceLine, Value,
	 * Instname
	 */
	public void checkSymMattrAttrValue(Token tokenSymAttr, Object tokenSymAttrValue, Token value) {
		if (tokenSymAttr != null && tokenSymAttrValue != null) {
			String symAttr = tokenSymAttr.getText();
			String symAttrValue;
			if (tokenSymAttrValue instanceof Token)
				symAttrValue = ((Token) tokenSymAttrValue).getText();
			else
				symAttrValue = tokenSymAttrValue.toString();

			if (symAttr.compareTo("Description") == 0) {
				if (AttributeList.getListDescAttr().contains(symAttrValue)) {

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
			} else if (symAttr.compareTo("Type") == 0) {

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

	/**
	 * Checks polarized capacitor description
	 */
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

	/**
	 * Adds a wire to wires list
	 */
	public void handleWire(Token... tokens) {
		if (tryParseInt(tokens[1].getText()) && tryParseInt(tokens[2].getText()) && tryParseInt(tokens[3].getText())
				&& tryParseInt(tokens[4].getText())) {
			appendRuleToStream(false, true, true, tokens);

			Wire wire = new Wire(Integer.parseInt(tokens[1].getText()), Integer.parseInt(tokens[2].getText()),
					Integer.parseInt(tokens[3].getText()), Integer.parseInt(tokens[4].getText()));

			wires.add(wire);
		}
	}

	/**
	 * Adds a flag to flag list
	 */
	public void handleFlag(Token... tokens) {
		if (tryParseInt(tokens[1].getText()) && tryParseInt(tokens[2].getText())) {

			flags.add(new Flag(Integer.parseInt(tokens[1].getText()), Integer.parseInt(tokens[2].getText()),
					tokens[3].getText()));
			appendRuleToStream(false, true, true, tokens);

		} else {
			System.out.println("Try parse int failed!!!");
		}
	}

	/**
	 * Writes in fileFormattedOut a correctly formatted line from the input file
	 */
	public void appendRuleToStream(boolean addBeforeWS, boolean addAfterWS, boolean addEndLine, Token... tokens) {
		try {
			int i = 0;
			while (i < tokens.length - 1) {
				fileFormattedOut.append((addBeforeWS ? " " : "") + tokens[i].getText() + (addAfterWS ? " " : ""));
				i++;
			}
			if (tokens.length != 0)
				fileFormattedOut.append((addBeforeWS ? " " : "") + tokens[i].getText());
			if (addEndLine)
				fileFormattedOut.append("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Performs checks on the last read symbol before closing fileFormattedOut
	 */
	public void endOfFileChecks() {
		
		if (lastComponent != null)
			components.add(lastComponent);

		checkMandatoryAttribute();
		closeFileFormattedOut();

		try {
			if (errorList.isEmpty())
				LatexConverter.convertToLatex(components, wires, flags);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns error list
	 */
	public List<String> getErrorList() {
		return errorList;
	}

	/**
	 * Tries to parse an Integer value from a String
	 */
	private boolean tryParseInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * Checks if the mandatory attributes of a symbol are present
	 */
	private void checkMandatoryAttribute() {

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

	/**
	 * Checks if the attribute passed is allowed for a resistor
	 */
	private void checkResAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token) tokenSymAttrValue).getText();
		if (AttributeList.getListRAttribute().contains(symAttrValue)) {
			System.out.println("SpiceLine res value is correct");
		} else {
			System.out.println("SpiceLine res value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token) tokenSymAttrValue);
		}
	}

	/**
	 * Checks if the attribute passed is allowed for a capacitor
	 */
	private void checkCapAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token) tokenSymAttrValue).getText();
		if (AttributeList.getListCapAttribute().contains(symAttrValue)
				|| AttributeList.getListParAttribute().contains(symAttrValue)) {
			System.out.println("SpiceLine cap value is correct");
		} else {
			System.out.println("SpiceLine cap value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token) tokenSymAttrValue);
		}
	}

	/**
	 * Checks if the attribute passed is allowed for a inductance
	 */
	private void checkIndAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token) tokenSymAttrValue).getText();
		if (AttributeList.getListIndAttribute().contains(symAttrValue)
				|| AttributeList.getListParAttribute().contains(symAttrValue)) {
			System.out.println("SpiceLine ind value is correct");
		} else {
			System.out.println("SpiceLine ind value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token) tokenSymAttrValue);
		}
	}

	/**
	 * Checks if the attribute passed is allowed for a voltage source
	 */
	private void checkVoltageAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token) tokenSymAttrValue).getText();
		if (symAttrValue.equals("Rser")) {
			System.out.println("SpiceLine voltage value is correct");
		} else {
			System.out.println("SpiceLine voltage value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token) tokenSymAttrValue);
		}
	}

	/**
	 * Closes file fileFormattedOut
	 */
	private void closeFileFormattedOut() {
		try {
			fileFormattedOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
