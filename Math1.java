package com.dkte;


class Math{
	public static int pow(int base , int index)
	{
		int res = 1;
		for(int i = 0; i < index; i++ )
		{
		 res = res * base;
		}
		return res;
	}
}
public class Math1 {

	public static void main(String[] args) 
	{
   int res = Math.pow(2, 3);
   System.out.println("Result:" +res);
	}

}
