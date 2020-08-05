package entities;

import entities.enums.Color;

public class Circle extends Shape{
	
	// Attributes
	private Double radius;
	private final double Pi = 3.1415;
	
	// Builders
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	// Accessor Methods
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	// Methods
	@Override
	public Double area() {
		return Pi * Math.pow(radius, 2.0);
	}
	
	
}
