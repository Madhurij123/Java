package clg.dkte;
import java.util.*;

public class Array3 {

	public static void acceptRecord(int[][] arr)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ArraY Element:");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
                    arr[i][j] = sc.nextInt();
			}
		}
	}
		
	
	public static void printRecord(int[][] arr)
	{
		System.out.println("Enter a ArraY Element:");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
              System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
	}
		
	
	public static void main(String[] args)
	{
		int[][] arr = new int[3][3];
		Array3.acceptRecord(arr);
		Array3.printRecord(arr);
		
	}
}
