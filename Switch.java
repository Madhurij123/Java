import java.util.*;
public class Switch {

	public static void main(String[] args) {
      //java allow a string return in case
		Scanner sc  = new Scanner(System.in);

		String op;
		int a,b, res;
		do
		{
			System.out.println("Enter two number");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Enter + , - , * or . exit");
			System.out.println("Enter a choice");
			op = sc.next();
			
			switch(op)
			{
			case "+" : res = a + b;
			System.out.println(res);
			break;
			
			case "-" : res = a - b;
			System.out.println(res);
			break;
			
			case "*" : res = a * b;
			System.out.println(res);
			break;
			
			default:
				System.out.println("Inavalid choice");
			     continue;
			
			}
		}while(!op.equals("."));
	}

}
