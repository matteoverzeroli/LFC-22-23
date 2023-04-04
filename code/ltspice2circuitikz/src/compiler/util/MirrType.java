package compiler.util;
/*
 * MIRRORTYPE	: 'M0' 
		| 'M90' 
		| 'M180' 
		| 'M270';
 */
public enum MirrType {
	M0("M0"),
	M90("M90"),
	M180("M180"),
	M270("M270");
	
	private String mirrType;
	
	private MirrType(String mirrType) {
		this.mirrType = mirrType;
	}
	
	public String getMirrType() {
		return mirrType;
	}	
}


