package compiler.util;
/*
 * 
	INDATTRIBUTE:	'Ipk'; //+ PARATTRIBUTE
 */
public enum IndAttribute {
	IPK("Ipk");
	
	private String indAttr;
	
	private IndAttribute(String indAttr) {
		this.indAttr = indAttr;
	}
	
	public String getIndAttribute() {
		return indAttr;
	}	
}


