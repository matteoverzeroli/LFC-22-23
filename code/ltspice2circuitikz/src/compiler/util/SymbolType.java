package compiler.util;
/*
 * SYMBOLTYPE:	'res' 
		| 'res2'
		| 'cap'
		| 'ind' 
		| 'ind2'
		| 'diode'	
		| 'schottky'
		| 'zener'
		| 'varactor'
		| 'LED'
		| 'TVSdiode'
		| 'pnp'
		| 'pnp2'
		| 'pnp4'
		| 'npn'
		| 'npn2'
		| 'npn3'
		| 'npn4'
		| 'voltage'
		| 'current'
		| 'nmos'
		| 'pmos'
		| 'polcap';
 */
public enum SymbolType {
	RES("res"),
	RES2("res2"),
	CAP("cap"),
	IND("ind"),
	IND2("ind2"),
	DIODE("diode"),
	SCHOTTKY("schottky"),
	ZENER("zener"),
	VARACTOR("varactor"),
	LED("LED"),
	TVSDIODE("TVSDiode"),
	PNP("pnp"),
	PNP2("pnp2"),
	PNP4("pnp4"),
	NPN("npn"),
	NPN2("npn2"),
	NPN3("npn3"),
	NPN4("npn4"),
	VOLTAGE("voltage"),
	CURRENT("current"),
	NMOS("nmos"),
	PMOS("pmos"),
	POLCAP("polcap");
	
	private String symbolType;
	
	private SymbolType(String symbolType) {
		this.symbolType = symbolType;
	}
	
	public String getSymbolType() {
		return symbolType;
	}
}


