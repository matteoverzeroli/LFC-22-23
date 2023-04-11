package compiler;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import static compiler.util.ERROR.*;
import compiler.util.ERROR;


public class Handler {

	List<String> listWindowsOptions = Arrays.asList("invisibile", "center", "left", "right", "top",
			"bottom", "vcenter", "vleft", "vright", "vtop", "vbottom");
	List<String> listIOPinAttr = Arrays.asList("in", "out", "bidir");
	List<String> listSymbolType = Arrays.asList("res", "res2", "cap", "ind", "ind2", "diode", "schottky",
			"zener", "varactor", "LED", "tvsdiode", "pnp", "pnp2", "pnp4" ,"npn", "npn2", "npn3", "npn4",
			"voltage", "current", "nmos", "pmos", "polcap");
	List<String> listMirrorType = Arrays.asList("m0", "m90", "m180", "m270");
	List<String> listRotType = Arrays.asList("r0", "r90", "r180", "r270");
	List<String> listSymAttr = Arrays.asList("instname", "description", "type", "value", "spiceline");
	List<String> listDescAttr = Arrays.asList("diode", "capacitor");
	List<String> listCapAttribute = Arrays.asList("v", "irms", "lser", "mfg", "pn", "type");
	List<String> listIndAttribute = Arrays.asList("ipk");
	List<String> listParAttribute = Arrays.asList("Rser", "Rpar","Cpar");
	List<String> listRAttribute = Arrays.asList("tol", "pwr");
	
	TokenStream input;
	List<String> errorList;
	
	public Handler (TokenStream input) {
		System.out.println("------ Handler Init ------");
		
		this.input = input;
		errorList = new ArrayList<String>();
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
			case SPICELINEVALUE_ERROR:
				errMsg += "SpiceLine value '" + tk.getText() + "' is not valid";
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
			if(listWindowsOptions.contains(wOption.toLowerCase()))
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
			if(listIOPinAttr.contains(ioPinAttr.toLowerCase()))
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
			if(listSymbolType.contains(symbolType.toLowerCase()))
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
				if(listRotType.contains(rotType.toLowerCase()))
					System.out.println("Rotation type is correct");
				else {
					System.out.println("Rotation type is not correct");
					myErrorHandler(ROTATIONTYPE_ERROR, token);
				}
			}
			else if(rotType.startsWith("m") || rotType.startsWith("M")) {
				if(listMirrorType.contains(rotType.toLowerCase()))
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
			if(listSymAttr.contains(symAttr.toLowerCase()))
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
	
	public void checkSymMattrAttrValue(Token tokenSymAttr, Object tokenSymAttrValue) {
		if(tokenSymAttr != null && tokenSymAttrValue != null) {
			String symAttr = tokenSymAttr.getText();
			String symAttrValue;
			if(tokenSymAttrValue instanceof Token)
				symAttrValue = ((Token)tokenSymAttrValue).getText();
			else
				symAttrValue = tokenSymAttrValue.toString();
			
			if(symAttr.compareToIgnoreCase("description") == 0){
				if(listDescAttr.contains(symAttrValue.toLowerCase())) {
					System.out.println("Description type is correct");
				}
				else {
					System.out.println("Description type is not correct");
					myErrorHandler(DESCRIPTION_ERROR, (Token)tokenSymAttrValue);
				}
			}
			else if(symAttr.compareToIgnoreCase("type") == 0){
				if(listSymbolType.contains(symAttrValue.toLowerCase())) {
					System.out.println("Type value is correct");
				}
				else {
					System.out.println("Type value is not correct");
					myErrorHandler(TYPE_ERROR, (Token)tokenSymAttrValue);
				}
			}
			else if(symAttr.compareToIgnoreCase("spiceline") == 0){
				if(listCapAttribute.contains(symAttrValue.toLowerCase()) ||
						listParAttribute.contains(symAttrValue.toLowerCase()) ||
						listRAttribute.contains(symAttrValue.toLowerCase()) ||
						listIndAttribute.contains(symAttrValue.toLowerCase())) {
					System.out.println("SpiceLine value is correct");
				}
				else {
					System.out.println("SpiceLine value is not correct");
					myErrorHandler(SPICELINEVALUE_ERROR, (Token)tokenSymAttrValue);
				}
			}
		}
		else {
			System.err.println("SYMATTR type/value null!!");
		}
	}
}
