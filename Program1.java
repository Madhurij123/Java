package clg.dkte;
import java.util.*;

class Shape2
{
	protected float area;
	
	public Shape2()
	{
		System.out.println("public Shape()");
	}
	
	public void setArea(float area)
	{
		this.area = area;
	}
	public float getArea() {
		return area;
	}
	public void calculateRecord()
	{
		
	}
	
}

class Rectangle2 extends Shape2
{
	private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calculateRecord()
	{
		this.area = this.length * this.breadth;
	}
}
class Circle2 extends Shape2
{
	private int radius;
	
	public void calculateRecord()
	{
		area = (float) (Math.PI * radius *radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
public class Program1
{
	public static Scanner sc = new Scanner(System.in);

	public static int menuList()
	{
		int ch;
		
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Shape");

		System.out.println("Enter a choice:");
		 ch = sc.nextInt();
		 return ch;
	}
	
	public static void acceptRecord(Shape2 shape)
	{
		if(shape instanceof Rectangle2)
		{
			Rectangle2 rect = (Rectangle2) shape;  //Downcasting
			
			//int length, bredth;
			
			System.out.println("Length:");
			int lenght = sc.nextInt();  //Callling a class Method need to have 
		                                    //reference of that class
			rect.setLength(lenght);
			
			System.out.println("Breadth:");
			int breadth = sc.nextInt();
			rect.setLength(breadth);
		}
		else if(shape instanceof Circle2)
		{
			Circle2 cr = (Circle2) shape;
			
			System.out.println("Radius");
			int radius = sc.nextInt();
			cr.setRadius(radius);
		}
		else
		{
			System.out.println("Invalid choice..!!");
		}
	}
	public static void printRecord(Shape2 shape)
	{
		System.out.println("Area:"+shape.getArea());
	}
	public static void main(String[] args)
	{
		int ch;
		
		while((ch = menuList())!= 0)
		{
			Shape2 shape = null;
			switch(ch)
			{
			case 1:
				shape = new Rectangle2();//upcasting
				break;
			case 2:
				shape = new Circle2(); //upcasting
				break;
				
			default:
				System.out.println("Inavlid Choice...!!!");
				continue;
			}
		
		if(shape != null)
		{
			Program1.acceptRecord(shape);
			shape.calculateRecord();
			Program1.printRecord(shape);
		}
		}
	}
	
}
