package compiler.util;

public class Wire {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	
	public Wire(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public int getMinX() {
		return Math.min(x1, x2);
	}
	
	public int getMaxY() {
		return Math.max(y1, y2);
	}
	
	public int getMaxX() {
		return Math.max(x1, x2);
	}
	
	public int getMinY() {
		return Math.min(y1, y2);
	}

	public int getX1() {
		return x1;
	}


	public int getX2() {
		return x2;
	}


	public int getY1() {
		return y1;
	}


	public int getY2() {
		return y2;
	}	
	
	public String toString() {
		return "WIRE " + x1 + " " + y1 + " " + x2 + " " + y2; 
	}
}
