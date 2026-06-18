
public class Box_unbox {
	public static void main1(String[] args)
	{
		//Converting primitive to appropriate wrapper class
		int a = 20;
	// Integer i = new Integer(a); //boxing
		Integer b = a; //Auto - boxing
		System.out.println(b);
		
	}
	public static void main(String[] args)
	{
		//converting wrapper class to int
	// Integer i = new Integer(a); //boxing
		Integer b = 100; //Auto - boxing
		int c = b.intValue();
		System.out.println(c);
		
	}
}
