import java.util.*;
public class Fact {

	public static void main(String[] args) {
     int num;
    // int factorial = 1 ;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter  a number");
     num = sc.nextInt();
     int i = 0;
     while(  i < num)
     {
         int factorial = 1;
    	factorial = factorial * i;
    	i--;
   	 System.out.println("Factorial:" +factorial);

     }
     
	}

}
