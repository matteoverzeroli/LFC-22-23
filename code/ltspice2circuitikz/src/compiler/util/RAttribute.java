package compiler.util;
/*
 * RATTRIBUTE:	'tol'
		|'pwr';
 */
public enum RAttribute {
	TOL("tol"),
	PWR("pwr");
	
	private String rAttr;
	
	private RAttribute(String rAttr) {
		this.rAttr = rAttr;
	}
	
	public String getRAttribute() {
		return rAttr;
	}	
}


