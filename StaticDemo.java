package day1;
import java.lang.constant.*;
public class StaticDemo {
	private static int num1 = 10;
	public static int num2 = 30;
	
	public static void main(String[] args) {
		//Inside static method we cannot accesss a non static members
		//System.out.println("Num1:"+num1); 
		
		System.out.println(num2);
		
		/*
		 * if we want to access static members of another class frequently, there is
		 * need to use "import static" without classneme we can access
		 * 
		 *  
		 *  directly
		 */
	}

}
