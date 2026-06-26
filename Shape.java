package clg.dkte2;

import java.util.*;

abstract class Shape1
{
	protected float area;
	
	abstract void acceptRecord();
	abstract void calculateRecord();


	public final void show()
	{
		System.out.println("Area:"+area);
	}


	
}

final class Rectangle extends Shape1
{
	private int length;
	private int breadth;
	
	@Override
	public void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a length:");
	   length = sc.nextInt();
	   System.out.println("Enter a Breadth:");
	   breadth = sc.nextInt();
	}
	@Override
	public void calculateRecord()
	{
		area = this.length * this.breadth;
	}
}
class Circle extends Shape1
{
	private int radius;
	@Override
	public void acceptRecord()
	{
		Scanner sc = new Scanner(System.in );
		System.out.println("Enter a Radius:");
		radius = sc.nextInt();
	}
	public void calculateRecord()
	{
		area = (float) (Math.PI * radius *radius);
		//System.out.println("Area:"+area);

	}
}
public class Shape
{
	public static int menuList()
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Shape");

		System.out.println("Enter a choice:");
		 ch = sc.nextInt();
		 return ch;
	}
	public static void main(String[] args)
	{
		int ch;
		
		while((ch = menuList())!= 0)
		{
			Shape1 shape = null;
			switch(ch)
			{
			case 1:
				shape = new Rectangle();//upcasting
				break;
			case 2:
				shape = new Circle(); //upcasting
				break;
				
			default:
				System.out.println("Inavlid Choice...!!!");
				continue;
			}
		//Process of calling Sub-Class method by using refernce of super class 
		//that called dynamic method dispatch
		if(shape != null)
		{
			shape.acceptRecord();
			shape.calculateRecord();
			shape.show();
		}
		}
	}
	
}

