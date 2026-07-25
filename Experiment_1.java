import java.util.Scanner;

public class Experiment_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch;
		int a,b;
		System.out.println("Enter a First Number:");
		a = sc.nextInt();
		System.out.println("Enter a Second Number");
		b = sc.nextInt();
		
		do {
			
			
			System.out.println("-----------------Arithmethic Operations---------");
			System.out.println("0.Exit");
			System.out.println("1.+");
			System.out.println("2.-");
			System.out.println("3.*");
			System.out.println("4./");
			System.out.println("------------------------------------------------");
			
			
			System.out.println("Enter a choice:");
			ch = sc.next();
			
			switch(ch) {
			
			case "+":
				int res = a + b;
				System.out.println("Addition:"+res);
				break;
				
			case "-":
				int res1 = a - b;
				System.out.println("Substraction:"+res1);
				break;
				
			case "*":
				 res = a * b;
				System.out.println("Multification:"+res);
				break;
			
			case "/":
			    res = a / b;
				System.out.println("Division:"+res);
				break;
			
			case "0":
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice..!!!");
				continue;
			}
				
			
			

		}while(ch != "0" );
	}
	
}
