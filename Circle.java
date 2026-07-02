package clg.dkte;

public class Circle implements Shape{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calAreas() {
		return pi * this.radius * this.radius;
	}
	
	

}
