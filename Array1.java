package com.dkte;

public class Array1 {
	
	
	//-----------------Variable Arity Method------------------
	public static void  arraySum(Object... arr) //Intenally this is array of double, all type of data type support
	{
		double sum = 0.0;
		
		for(int i = 0; i < arr.length; i++)
		{
          System.out.println(arr[i]);
		}
	}

	public static void main(String[] args)
	{
     Array1.arraySum(1.1, 1.2, 1.3, 5,"fgsdaf",12.f); //Variable Arity Method ..there is no need to create array..passing referenence
	}
	
/*	public static double arraySum(double[] arr)
	{
		double sum = 0.0;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
    double[] arr =  {1.1, 1.2, 1.3};
    double r1 = Array1.arraySum(arr);
    System.out.println("Result:" +r1);
    
	}*/
	
	
	
	
	/*public static double arraySum(double... arr) //Intenally this is array of double
	{
		double sum = 0.0;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args)
	{
    double r1 = Array1.arraySum(1.1, 1.2, 1.3, 5); //Variable Arity Method ..there is no need to create array..passing referenence
    System.out.println("Result:" +r1);
}*/
	
}