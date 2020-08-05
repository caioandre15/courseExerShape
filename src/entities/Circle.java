package entities;

import entities.enums.Color;

public class Circle extends Shape{
	
	// Attributes
	private Double radius;
	
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
		return Math.PI * Math.pow(radius, 2.0);
	}
	
	
}
