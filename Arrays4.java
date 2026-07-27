package clg.dkte;

import java.util.Arrays;

public class Arrays4 {

	public static void main(String[] args)
	{
		int arr[] = new int[] {34,28,2,4 ,67};
		
		System.out.println("Array Elements are:");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);   //METHOD of arrays class .it is static method
		
		System.out.println("After Sorting Array Elements are:");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//Binary Search
		int key = 4;
		int n = Arrays.binarySearch(arr, key);
		System.out.println("Element is found at=" +n);
	}
}
