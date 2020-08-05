package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	// Attributes
	private Double width;
	private Double height;

	// Builders
	public Rectangle() {
		super();
	}

	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	// Accessor Methods
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	// Methods
	@Override
	public Double area() {
		return width * height;
	}

}
