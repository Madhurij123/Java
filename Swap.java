package com.dkte;

public class Swap {
	
	/*public static void swap(int x, int y)
	{
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Swapping Inside the swap() function: x:" + x + "\ty:" +y );
	}
public static void main(String[] args)
{
	int a = 10;
	int b = 20;
	
	System.out.println("Before Swapping:  a: "+ a + "\tb: "+b );
	
	Swap.swap(a, b);
	
	System.out.println("Before Swapping:  a:"+ a +   "\tb: " +b );

}*/
	public static void swap(int[] arr)
	{
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		System.out.println("Swapping inside swap(): a[0]: "+ arr[0] + "\ta[1]: "+arr[1] );

	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {10 , 20};
		
		System.out.println("Before Swapping:  arr[0]: "+ arr[0] + "\ta[1]: "+arr[1] );
		
		Swap.swap(arr);
		
		System.out.println("After Swapping:  arr[0]: "+ arr[0] + "\ta[1]: "+arr[1] );

		
		

	}
}
