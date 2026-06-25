package com.dkte;


class MyClass
{
	private int num1 = 10;  //Field Initiization
	private int num2 ;
	private int num3;
	
	//Object/Instance Initializer
	
	{
		this.num1 = 100;
		System.out.println("---------Initializer Block 1--------");
	}
	{
		this.num2 = 200;
		System.out.println("---------Initializer Block 1--------");
	}
	
	public MyClass()
	{
		System.out.println("Constructor");
		num1 = 110;
		num2 = 50;
		num3 = 70;
	}
	public void display()
	{
		System.out.println("num1:" +num1+ "\nnum2:" +num2+ "\nnum3:" +num3);
	}
}
public class Object {
	public static void main(String[] args)
	{
		MyClass c1 = new MyClass();
		c1.display();
		
	}

}
