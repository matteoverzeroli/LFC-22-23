package compiler.util;
/*
 * WINDOWOPTION:	'Invisibile' //label invisible
		| 'Center' //label justification
		| 'Left'
		| 'Right'
		| 'Top'
		| 'Bottom'
		| 'VCenter' //vertical label justification
		| 'VLeft'
		| 'VRight'
		| 'VTop'
		| 'VBottom';
 */

public enum WindowsOptions {
	INVISIBILE("Invisibile"),
	CENTER("Center"),
	LEFT("Left"),
	RIGHT("Right"),
	TOP("Top"),
	BOTTOM("Bottom"),
	VCENTER("VCenter"),
	VLEFT("VLeft"),
	VRIGHT("VRight"),
	VTOP("VTop"),
	VBOTTOM("VBottom");
	
	private String wOpt;
	
	private WindowsOptions(String wOpt) {
		this.wOpt = wOpt;
	}
	
	public String getWOpt() {
		return wOpt;
	}
}


