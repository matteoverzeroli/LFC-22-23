package compiler.util;
/*
 * PARATTRIBUTE:	'Rser' //un voltage può avere un Rser
		| 'Rpar'
		| 'Cpar';
 */
public enum ParAttribute {
	RSER("Rser"),
	RPAR("Rpar"),
	CPAR("Cpar");
	
	private String parAttr;
	
	private ParAttribute(String parAttr) {
		this.parAttr = parAttr;
	}
	
	public String getParAttribute() {
		return parAttr;
	}	
}


