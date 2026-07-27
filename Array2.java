package clg.dkte;

import java.util.*;

public class Array2 {

	public static void main(String[] args) {
     
		//double[][] arr = new double[][] {{1.1, 1.2, 1.3}, {3.2, 3.4, 4.5}};
		
		/*for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}*/
		
		
		
		int[][] rarr = new int[4][];
		rarr[0] = new int[1];
		rarr[1] = new int[2];
		rarr[2] = new int[3];
		rarr[3] = new int[4];
		
		for(int i = 0; i < rarr.length; i++)
		{
			for(int j = 0; j < rarr[i].length; j++)
			{
				System.out.print(rarr[i][j] + " ");
			}
			System.out.println();

		}
		
		int num =0 ;
		
		for(int i = 0; i < rarr.length; i++)
		{
			for(int j = 0; j < rarr[i].length; j++)
			{
              rarr[i][j] = ++num;
			}
		}

		
		for(int i = 0; i < rarr.length; i++)
		{
			for(int j = 0; j < rarr[i].length; j++)
			{
				System.out.print(rarr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
