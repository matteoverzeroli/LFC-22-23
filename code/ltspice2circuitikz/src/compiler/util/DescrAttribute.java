package compiler.util;
/*
 * DESCRIPTIONATTR:	'Diode'
		| 'Capacitor'; // TODO: N.B. controlli semantici da vedere
 */
public enum DescrAttribute {
	DIODE("Diode"),
	CAPACITOR("Capacitor");
	
	private String descrAttr;
	
	private DescrAttribute(String descrAttr) {
		this.descrAttr = descrAttr;
	}
	
	public String getDescrAttribute() {
		return descrAttr;
	}	
}


