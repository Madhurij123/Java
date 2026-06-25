package com.dkte;

class Circle
{
	public double radius;
	
	public final double PI = 3.14; //Field Initialization
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void calArea()
	{
		double area = PI * radius * radius;
		System.out.println("Area Of Circle:" +area);

	}
	
	public void calPeri()
	{
		double area = 2 * PI * radius;
		System.out.println("Peripheral Of Circle:" +area);
	}
}

public class Area {

	public static void main(String[] args) {
		
		final int a = 10;
		  
		
  System.out.println(a);
		Circle c = new Circle(3.2); 
		c.calArea();
		c.calPeri();
		
		double rad = 5.3;
		
		final Circle c2 = new Circle(rad);
		c2.setRadius(rad);
	}

}
