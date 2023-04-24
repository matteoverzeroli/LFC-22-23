package compiler.util;

public class Component {

	
	private String name;
	private String value;
	private String type;
	private int x;
	private int y;
	private int rotationAngle;
	private String rotationType;
	
	/* ingloba il token qua dentro così lo puoi ritornare */
	
	public Component(String type) {
		super();
		this.type = type;
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
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
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
	
	public String toString() {
		return "Name: " + getName() + " Value: " + getValue()
				+ " x: " + getX() + " y: " + getY();
	}
	
}
