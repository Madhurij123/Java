package clg.dkte;

import java.util.*;

public class Array1 {

	public static void main(String[] args) {
     
		//int[] arr  = new int[] {10,20,30};
		
		
		int[] arr = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a Array Elemnt");
		{
			for(int i = 0; i < arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
		}
		
		System.out.println("Array Elements are:");
		{
			for(int i = 0; i < arr.length ; i++)
			{
				System.out.println(arr[i]);
			}
		}
		int total = Array1.arraySum(arr);
		System.out.print("Sum of  Array Elemments:" +total);
		
	}
	
	public static int arraySum(int[] arr)
	{
		int sum =0;
		for(int i = 0 ; i < 3; i++)
		{
		   sum += arr[i];
		}
		return sum;
	}

}
