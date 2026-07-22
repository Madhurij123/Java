
public class Literals {
	public static void main(String[] args)
	{
		int num = 10_00_00_00;  //it hels the prorammner to count number of zeros
		System.out.println(num);
		
		//boolean b = 1;  //give comiple erro
		
		//we also increment Character
		char c = 'a';
		c++;
		System.out.println(c);
		
		//type conversion
		
		int a = 257;  //NARROWING------need explicit casting-
		byte b = (byte) a;  // 257 % 256 = 1
		System.out.println(b);
		
	}
}
