package compiler;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import static compiler.util.ERROR.*;
import compiler.util.ERROR;


public class Handler {

	List<String> listWindowsOptions = Arrays.asList("Invisibile", "Center", "Left", "Right", "Top",
			"Bottom", "VCenter", "VLeft", "VRight", "VTop", "VBottom");
	List<String> listIOPinAttr = Arrays.asList("In", "Out", "BiDir");
	List<String> listSymbolType = Arrays.asList("res", "res2", "cap", "ind", "ind2", "diode", "schottky",
			"zener", "varactor", "LED", "TVSdiode", "pnp", "pnp2", "pnp4" ,"npn", "npn2", "npn3", "npn4",
			"voltage", "current", "nmos", "pmos", "polcap");
	List<String> listMirrorType = Arrays.asList("M0", "M90", "M180", "M270");
	List<String> listRotType = Arrays.asList("R0", "R90", "R180", "R270");
	List<String> listSymAttr = Arrays.asList("InstName", "Description", "Type", "Value", "SpiceLine");
	List<String> listDescAttr = Arrays.asList("Diode", "Capacitor");
	List<String> listCapAttribute = Arrays.asList("V", "Irms", "Lser", "mfg", "pn", "type");
	List<String> listIndAttribute = Arrays.asList("Ipk", "mfg", "pn");
	List<String> listParAttribute = Arrays.asList("Rser", "Rpar","Cpar");
	List<String> listRAttribute = Arrays.asList("tol", "pwr");
	
	private String lastSymbol;
	
	TokenStream input;
	List<String> errorList;
	
	public Handler (TokenStream input) {
		System.out.println("------ Handler Init ------");
		
		this.input = input;
		errorList = new ArrayList<String>();
		
		lastSymbol = null;
	}
	
	public List<String> getErrorList(){
		return  errorList;
	}

	public void handleError(Token tk, String hdr, String msg) {
		String errMsg;
		if (tk == null)
			tk = input.LT(-1);

		if (tk.getType() == Ltspice2circuitikzLexer.ERROR_TK)
			errMsg = "Lexical Error " + LEXICAL_ERROR;
		else 
			errMsg = "Syntax Error " + SYNTAX_ERROR;

		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]: " +
				" on token '" + tk.getText() + "'";

		errorList.add(errMsg);
	}
	
	void myErrorHandler(ERROR code, Token tk) {
		String errMsg;
		
		if (code == LEXICAL_ERROR)//it should never happen
			errMsg = "Fake Lexical Error " + code;
		else if (code == SYNTAX_ERROR)//it should never happen
			errMsg = "Fake Syntax Error " + code;
		else
			errMsg = "Semantic Error " + code; 
	
		if (tk == null)
			tk = input.LT(-1);
		
		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]: ";
		
		
		switch(code) {
			case VERSION_ERROR:
				errMsg += "Version number '" + tk.getText() + "' is not equal to 4";
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
			case TYPE_ERROR:
				errMsg += "Type value '" + tk.getText() + "' is not valid";
				break;	
			case SPICELINEVALUE_ERROR: //TODO usato?
				errMsg += "SpiceLine value '" + tk.getText() + "' is not valid";
				break;
			case SYMBOLTYPENULL_ERROR:
				errMsg += "The SpiceLine value '" + tk.getText() + "' has no symbol reference";
				break;
			default:
				errMsg += "Message error not defined";
				
		}
		errorList.add(errMsg);
	}
	
	public void checkVersion(Token token) {
		if(token != null) {
			String version = token.getText();
			if(version.compareTo("4") == 0)
				System.out.println("Version number is correct");
			else {
				System.out.println("Version number is not correct");
				myErrorHandler(VERSION_ERROR, token);
			}
		}
		else {
			System.err.println("Version null!!");
		}
	}
	
	public void checkWindowsOptions(Token token) {
		if(token != null) {
			String wOption = token.getText();
			if(listWindowsOptions.contains(wOption))
				System.out.println("Windows option is correct");
			else {
				System.out.println("Windows option is not correct");
				myErrorHandler(WINDOWOPTION_ERROR, token);
			}
		}
		else {
			System.err.println("Windows Options null!!");
		}
	}

	public void checkIOPinAttr(Token token) {
		if(token != null) {
			String ioPinAttr = token.getText();
			if(listIOPinAttr.contains(ioPinAttr))
				System.out.println("IO Pin Attribute is correct");
			else {
				System.out.println("IO Pin Attribute is not correct");
				myErrorHandler(IOPINATTR_ERROR, token);
			}
		}
		else {
			System.err.println("IO Pin Attribute null!!");
		}
	}
	public void checkSymbolType(Token token) {
		if(token != null) {
			String symbolType = token.getText();
			if(listSymbolType.contains(symbolType))
				System.out.println("Symbol type is correct");
			else {
				System.out.println("Symbol type is not correct");
				myErrorHandler(SYMBOLTYPE_ERROR, token);
			}
		}
		else {
			System.err.println("Symbol type null!!");
		}
	}
	public void checkRotType(Token token) {
		if(token != null) {
			String rotType = token.getText();
			if(rotType.startsWith("R") || rotType.startsWith("r")) {
				if(listRotType.contains(rotType))
					System.out.println("Rotation type is correct");
				else {
					System.out.println("Rotation type is not correct");
					myErrorHandler(ROTATIONTYPE_ERROR, token);
				}
			}
			else if(rotType.startsWith("m") || rotType.startsWith("M")) {
				if(listMirrorType.contains(rotType))
					System.out.println("Mirror type is correct");
				else {
					System.out.println("Mirror type is not correct");
					myErrorHandler(MIRRORTYPE_ERROR, token);
				}
			} else {
				System.out.println("Rotation/Mirror type not recognised");
				myErrorHandler(ROTMIRR_ERROR, token);
			}
		}
		else {
			System.err.println("Rotation type null!!");
		}
	}
	
	public void checkSymMattrAttr(Token token) {
		if(token != null) {
			String symAttr = token.getText();
			if(listSymAttr.contains(symAttr))
				System.out.println("SYMATTR type is correct");
			else {
				System.out.println("SYMATTR type is not correct");
				myErrorHandler(SYMATTRTYPE_ERROR, token);
			}
		}
		else {
			System.err.println("SYMATTR type null!!");
		}
	}
	
	/*
	 * da completare per tutti i simboli
	 * 
	 */
	public void checkSymMattrAttrValue(Token tokenSymAttr, Object tokenSymAttrValue) {
		if(tokenSymAttr != null && tokenSymAttrValue != null) {
			String symAttr = tokenSymAttr.getText();
			String symAttrValue;
			if(tokenSymAttrValue instanceof Token)
				symAttrValue = ((Token)tokenSymAttrValue).getText();
			else
				symAttrValue = tokenSymAttrValue.toString();
			
			if(symAttr.compareTo("Description") == 0){
				if(listDescAttr.contains(symAttrValue)) {
					System.out.println("Description type is correct");
				}
				else {
					System.out.println("Description type is not correct");
					myErrorHandler(DESCRIPTION_ERROR, (Token)tokenSymAttrValue);
				}
			}
			else if(symAttr.compareTo("Type") == 0){
				if(listSymbolType.contains(symAttrValue)) {
					System.out.println("Type value is correct");
				}
				else {
					System.out.println("Type value is not correct");
					myErrorHandler(TYPE_ERROR, (Token)tokenSymAttrValue);
				}
			}
			else if(symAttr.compareTo("SpiceLine") == 0){
				if(lastSymbol != null) {
					switch(lastSymbol) {
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
							System.err.println("Symbol attribute " + lastSymbol + " not already taken in consideration");
							break;
					}
				} else {
					System.out.println("No symbol to refer SpiceLine value");
					myErrorHandler(SYMBOLTYPENULL_ERROR, (Token)tokenSymAttrValue);
				}
			}
		}
		else {
			System.err.println("SYMATTR type/value null!!");
		}
	}
	
	public void setLastSymbol(Token token) {
		if(token != null) {
			lastSymbol = token.getText();
		}
		else {
			System.out.println("Last symbol is null");
		}
	}

	private void checkResAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token)tokenSymAttrValue).getText();
		if(listRAttribute.contains(symAttrValue)) {
			System.out.println("SpiceLine res value is correct");
		}
		else {
			System.out.println("SpiceLine res value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token)tokenSymAttrValue);
		}
	}
	private void checkCapAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token)tokenSymAttrValue).getText();
		if(listCapAttribute.contains(symAttrValue) || listParAttribute.contains(symAttrValue)) {
			System.out.println("SpiceLine cap value is correct");
		}
		else {
			System.out.println("SpiceLine cap value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token)tokenSymAttrValue);
		}
	}
	private void checkIndAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token)tokenSymAttrValue).getText();
		if(listIndAttribute.contains(symAttrValue) || listParAttribute.contains(symAttrValue)) {
			System.out.println("SpiceLine ind value is correct");
		}
		else {
			System.out.println("SpiceLine ind value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token)tokenSymAttrValue);
		}
	}
	private void checkVoltageAttribute(Object tokenSymAttrValue) {
		String symAttrValue = ((Token)tokenSymAttrValue).getText();
		if(symAttrValue.equals("Rser")) {
			System.out.println("SpiceLine voltage value is correct");
		}
		else {
			System.out.println("SpiceLine voltage value is not correct");
			myErrorHandler(SPICELINEVALUE_ERROR, (Token)tokenSymAttrValue);
		}
	}
	
}
