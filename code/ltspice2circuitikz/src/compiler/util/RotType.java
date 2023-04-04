package compiler.util;
/*
 * ROTTYPE	:	'R0' 
		| 'R90' 
		| 'R180' 
		| 'R270';
 */
public enum RotType {
	R0("R0"),
	R90("R90"),
	R180("R180"),
	R270("R270");
	
	private String rotType;
	
	private RotType(String rotType) {
		this.rotType = rotType;
	}
	
	public String getRotType() {
		return rotType;
	}
}


