package com.sunbeam;
/* final field can be initialized using field initializer, obj initializer, or constructor.
 * Once initialized, it cannot be modified again.
 * However, final fields must be initialized (in any of the above options). If not, compiler raise error.
 */ 

class Circle{
	public double radius; 
	public final double PI = 3.14; // field init 
	{
		//PI = 3.14; //already init in field init  
	}
	public Circle() {
		//PI = 3.14; //already init in field init
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getPI() {
		return PI;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double calcArea( ) {
		return PI * this.radius * this.radius; 
	}
	public double calcPeri( ) {
		return 2 * PI * this.radius; 
	}
}
public class Program {

	public static void main(String[] args) {
		final int a; // final variable 
		a = 10; // OK 
		//a = 11; // NOT OK 
		
		Circle c1 = new Circle(5.1); 
		//System.out.println("Area : " + c1.calcArea());
		//System.out.println("Peri : "  + c1.calcPeri());
		double rad = 6.1; 
		final Circle c2 = new Circle(6.1); // reference is final ( reference cannot modified) 
		//c2 = null; 
		c2.setRadius(rad); // final 
		//final int b = 10;  // OK 
		//int final c = 20; // NOT OK  
	}

}






