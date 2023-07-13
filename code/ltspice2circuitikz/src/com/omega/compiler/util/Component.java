package com.omega.compiler.util;

import org.antlr.runtime.Token;

public class Component {

	private Token token;
	private String name;
	private String value;
	private String type;
	private int x1;// upper node
	private int y1;
	private int x2;// lower node
	private int y2;
	private int rotationAngle;
	private String rotationType;

	public Component(Token token) {
		super();
		this.token = token;
	}

	public Token getToken() {
		return token;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/* return latex symbol type */
	public String getType() {
		switch (type) {
		case "res":
		case "res2":
			return "R";
		case "cap":
			return "C";
		case "polcap":
			return "eC";
		case "ind":
		case "ind2":
			return "L";
		case "diode":
			return "Do";
		case "LED":
			return "leDo";
		case "schottky":
			return "sDo";
		case "zener":
			return "zzDo";
		case "varactor":
			return "VCo";
		case "voltage":
			return "vsource";
		default:
			return type;
		}
	}

	public void setType(String type) {
		this.type = type;
	}

	private void applyRotationDipole(int x, int y) {
		int x1_offset, x2_offset, y1_offset, y2_offset;
		
		// apply offset to calculate the connection points of the components
		switch (type) {
		case "res":
		case "res2":
		case "ind":
		case "ind2":
			x1_offset = 16;
			y1_offset = 16;
			x2_offset = 16;
			y2_offset = 96;
			break;
		case "cap":
		case "polcap":
		case "diode":
		case "zener":
		case "schottky":
		case "varactor":
		case "LED":
			x1_offset = 16;
			y1_offset = 0;
			x2_offset = 16;
			y2_offset = 64;
			break;
		case "voltage":
			x1_offset = 0;
			y1_offset = 96;
			x2_offset = 0;
			y2_offset = 16;
			break;
		default:
			x1_offset = x2_offset = y1_offset = y2_offset = 0;
		}
		
		// apply rotation and mirror transformation
		if (rotationType.equals("R")) {
			if (rotationAngle == 0) {
				this.x1 = x + x1_offset;
				this.y1 = y + y1_offset;
				this.x2 = x + x2_offset;
				this.y2 = y + y2_offset;
			} else if (rotationAngle == 90) {
				this.x1 = x - y1_offset;
				this.y1 = y + x1_offset;
				this.x2 = x - y2_offset;
				this.y2 = y + x2_offset;
			} else if (rotationAngle == 180) {
				this.x1 = x - x1_offset;
				this.y1 = y - y1_offset;
				this.x2 = x - x2_offset;
				this.y2 = y - y2_offset;
			} else if (rotationAngle == 270) {
				this.x1 = x + y1_offset;
				this.y1 = y - x1_offset;
				this.x2 = x + y2_offset;
				this.y2 = y - x2_offset;
			}
		} else {
			if (rotationAngle == 0) {
				this.x1 = x - x1_offset;
				this.y1 = y + y1_offset;
				this.x2 = x - x2_offset;
				this.y2 = y + y2_offset;
			} else if (rotationAngle == 90) {
				this.x2 = x + y2_offset;
				this.y2 = y + x1_offset;
				this.x1 = x + y1_offset;
				this.y1 = y + x2_offset;
			} else if (rotationAngle == 180) {
				this.x1 = x + x1_offset;
				this.y1 = y - y1_offset;
				this.x2 = x + x2_offset;
				this.y2 = y - y2_offset;
			} else if (rotationAngle == 270) {
				this.x2 = x - y2_offset;
				this.y2 = y - x1_offset;
				this.x1 = x - y1_offset;
				this.y1 = y - x2_offset;
			}
		}

	}

	public void setPosition(int x, int y) {
		switch (this.type) {
		default: // needed to add for tripoles
			applyRotationDipole(x, y);
		}
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
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

	public void setRotation(String rotationString) {
		rotationType = rotationString.substring(0, 1);
		rotationAngle = Integer.parseInt(rotationString.substring(1));
	}

	public int getRotationAngle() {
		return rotationAngle;
	}

	public String getRotationType() {
		return rotationType;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + " Type:" + getType() + " Value: " + getValue() + " x1: " + getX1() + " y1: "
				+ getY1() + " x2: " + getX2() + " y2: " + getY2() + " Rotation type: " + getRotationType()
				+ " Rotation angle: " + getRotationAngle();
	}

}
