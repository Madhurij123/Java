package clg.dkte;

public class Palin_String {

	public static void main(String[] args) {

		String str = "madaghm";
		
		String sb = new StringBuilder(str).reverse().toString();
		
		
		if(str.equals(sb))
			System.out.println("palindromw");
		else
			System.out.println("not palindromw");

	}

}
