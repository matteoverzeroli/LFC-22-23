package compiler.util;
/*
 * CAPATTRIBUTE:	'V' // + PARATTRIBUTE
		| 'Irms'
		| 'Lser'
		| 'mfg'
		| 'pn'
		| 'type';
 */
public enum CapAttribute {
	V("V"),
	IRMS("Irms"),
	LSER("Lser"),
	MFG("mfg"),
	PN("pn"),
	TYPE("type");
	
	private String capAttr;
	
	private CapAttribute(String capAttr) {
		this.capAttr = capAttr;
	}
	
	public String getCapAttribute() {
		return capAttr;
	}	
}


