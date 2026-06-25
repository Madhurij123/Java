package com.dkte;


//Why the return type is not considered in mEthod overloading
public class Program {
	
	public static int add(int a, int b)
	{
		int res = a + b;
		return res;
	}
	public static double add(int a, int b)
	{
		double res = (double) a + b;
		return res;
	}
	
	public static void main(String[] args)
	{
		int obj = Program.add(10, 200);
		System.out.println(obj);
		
		double r = Program.add(10, 20);
		System.out.println(r);
		
		
		Program.add(10, 40);  //Not return output...occurs ambiguity.
	}
	
	
	

}
