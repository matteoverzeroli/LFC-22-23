package com.omega.compiler.util;

public class Flag {
	private int x;
	private int y;
	private String label;

	public Flag(int x, int y, String label) {
		this.x = x;
		this.y = y;
		this.label = label;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	@Override
	public String toString() {
		return "Flag: x: " + getX() + " y: " + getY() + " label: " + getLabel(); 
	}
}
