package clg.dkte;

public class Reactangle implements Shape{

	private double length;
	private double breadth;
	
	
	public Reactangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
   
	

	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getBreadth() {
		return breadth;
	}



	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double calAreas() {
		return this.length * this.breadth;
	}
	

}
