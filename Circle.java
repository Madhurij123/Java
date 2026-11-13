import java.util.*;
class Circle1 {
	private double myX;
	private double myY;
	private double diameter;
	
	//Default Constructor
	public Circle1()
	{
		this.myX = 0.0;
		this.myY = 0.0;
		this.diameter = 0.0;
	}
	
	public Circle1(double myX, double myY, double diameter) {
		this.myX = myX;
		this.myY = myY;
		this.diameter = diameter;
	}
	public double getMyX() {
		return myX;
	}
	public void setMyX(double myX) {
		this.myX = myX;
	}
	public double getMyY() {
		return myY;
	}
	public void setMyY(double myY) {
		this.myY = myY;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) throws NegativeDiameterException{
		if(diameter < 0)
			throw new NegativeDiameterException("Diameter",diameter);
		this.diameter = diameter;
	}
	void accept() throws NegativeDiameterException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x & y Coordinators:");
		setMyX(sc.nextDouble());
		setMyY(sc.nextDouble());
		
		System.out.println("Enter a Diameter:");
		setDiameter(sc.nextDouble());
		
	}
	void display()
	{
		System.out.println("X & Y Coordinates of Circle:"+myX+","+myY);
		System.out.println("Diameter:"+diameter);
	}
	
}
public class Circle
{
	public static void main(String[] args)
	{
		Circle1 c = new Circle1();
		
		try {
			c.accept();
			c.display();
		}catch(NegativeDiameterException e)
		{
			System.out.println("Invalid Field:"+e.getInvalidField());
			System.out.println("Invalid Value:"+e.getInvalidValue());
			System.out.println("Message:"+e.getMessage());
		}
	}
}
