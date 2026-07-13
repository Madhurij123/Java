import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
    
	   String  c;
	    int i;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter a Character:");
		c = sc.next();
		
		System.out.println("Enter a Number:");
		i = sc.nextInt();
		
		int j =0;
		
		while(j <= i)
		{
			System.out.print(c);
			j++;
		}
		
	}

}
