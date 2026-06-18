import java.util.*;
public class Program1 {

	public static void main(String[] args) {
   
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a Number:");
		num = sc.nextInt();
		
		System.out.println("Given Number:" +num);
		
		Integer i = num;
		
		String a = Integer.toBinaryString(i);
		System.out.println("Binary Equivalent:"+a);
		
		String b = Integer.toOctalString(i);
		System.out.println("Octal Equivalent:" +b);
		
		String c = Integer.toHexString(i);
		System.out.println("Hexadecimal Equivalent:" +c);
		
	}

}
