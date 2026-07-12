package clg.dkte;

public class GCD {

	public static void main(String[] args) {

		int a = 8;
		int b = 12;
		
		while(b != 0)
		{
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println(a);
	}

}
