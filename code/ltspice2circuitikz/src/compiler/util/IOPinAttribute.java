package compiler.util;
/*
 * IOPINATT:	'In'
		| 'Out'
		| 'BiDir';
 */
public enum IOPinAttribute {
	IN("In"),
	OUT("Out"),
	BIDIR("BiDir");
	
	private String ioPinAttr;
	
	private IOPinAttribute(String ioPinAttr) {
		this.ioPinAttr = ioPinAttr;
	}
	
	public String getIOPinAttribute() {
		return ioPinAttr;
	}	
}


