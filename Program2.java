import java.util.*;
public class Program2
{
	public static void main(String[] args)
	{
		double a;
		double b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a First Number:");
		if(!sc.hasNextDouble()) {
			System.out.println("First Number is Not Double");
		}
		a = sc.nextDouble();
		
		System.out.println("Enter a Second Number:");
		if(!sc.hasNextDouble()) {
			System.out.println("Second Number is Not Double");
		}
		b = sc.nextDouble();
		
		double avarage = (a + b) / 2;
		System.out.println("Avarage :" +avarage);
		
	}
}