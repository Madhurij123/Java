package clg.dkte;

public class Squre implements Shape {
	
	private double side;

	
	public Squre(double side) {
		super();
		this.side = side;
	}


	public double getSide() {
		return side;
	}


	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calAreas() {
		return this.side * this.side;
	}

}
