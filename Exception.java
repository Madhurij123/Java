package clg.dkte;
import java.rmi.AccessException;
import java.util.*;
public class Exception {

	/*public static int divide(int num, int den)
	{
		if(den == 0)
			throw new RuntimeException("Divide by zero");
		int divide = num/den;
		return divide;
	}
	public static void main(String[] args)
	{
		int num, den;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Numerator:");
		num = sc.nextInt();
		
		System.out.println("Enter a Denomitor:");
		den= sc.nextInt();
		
		try
		{
			int res = divide(num, den);
			System.out.println(res);
		}
		catch(RuntimeException e )
		{
			System.out.println("Divide by zero");
		}
		
		finally
		{
			sc.close();
		}
		
	}*/
	public static int divide(int num, int den) throws Exception
	{
		//if(den == 0)
			//throw new RuntimeException("Divide by zero");
		int divide = num/den;
		return divide;
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
		catch(ArithmeticException  | InputMismatchException e)
		{
			System.out.println("Divide by zero");
		}
		
		
	}
}
