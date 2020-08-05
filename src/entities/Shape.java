package entities;

import entities.enums.Color;

public abstract class Shape {

	// Attributes
	private Color color;

	// Builders
	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	// Accessor Methods
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// Methods
	public abstract Double area();

}
