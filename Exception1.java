package clg.dkte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public static int divide(int num, int den) {
		int result = num / den;
		return result;
	}

	public static void main(String[] args)
	{
		int num, den;
	
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Numerator:");
			num = sc.nextInt();
			
			System.out.println("Enter a Denomitor:");
			den= sc.nextInt();
			int res = divide(num, den);
			System.out.println(res);
		}
		catch(Throwable e)
		{
			//System.out.println("Invalid Input");
			//e.printStackTrace();
			//System.out.println(null);
			System.out.println("Message:"+e.getMessage());
		}
		
		
	}
}
