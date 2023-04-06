package compiler;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;


public class Handler {

	/* TODO: questi li possiamo mettere in un enum certamente*/
	public static int LEXICAL_ERROR = 0;
	public static int SYNTAX_ERROR = 1;
	public static int ATTRIBUTE_ERROR = 2;
	
	/* list of all available attributes */
	List<String> listAttributes = Arrays.asList("V", "Irms", "Lser", "mfg", "pn", "type", 
			"Diode", "Caapacitor", "Ipk", "In", "Out", "BiDir", "Rser", "Rpar", "Cpar", 
			"tol", "pwr");

	
	
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
	
	void myErrorHandler(int code, Token tk) {
		String errMsg;
		// i primi due casi non dovrebbero mai avvenire... ma giusto in caso... commento di fosci
		if (code == LEXICAL_ERROR)
			errMsg = "Fake Lexical Error " + code;
		else if (code == SYNTAX_ERROR)
			errMsg = "Fake Syntax Error " + code;
		else
			errMsg = "Semantic Error " + code; 
	
		if (tk == null)
			tk = input.LT(-1);
		
		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]: ";
		
		if (code == ATTRIBUTE_ERROR)
			errMsg += "The ID '" + tk.getText() + "' is not an attribute";


		errorList.add(errMsg);
	}

	public void checkAttribute(Token token) {
		if (token != null) {

			String attributeName = token.getText();
			if (listAttributes.contains(attributeName)) {
				System.out.println("Ho trovato un attribute ed e' corretto!");
			} else {
				System.out.println("We ciccio guarda che qui ci andava un attribute!");
				myErrorHandler(ATTRIBUTE_ERROR, token);
			}

		} else {
			// bo ma può capitare che sia nullo? Non credo..
		}
	}
}
