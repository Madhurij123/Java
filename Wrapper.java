public class Wrapper {

	public static void main1(String[] args) {
    
		float a = 2.0f;  //Primitive
		
		//Wrapper class
		//Float b = new Float(a);  //Deperected
		
		
		//int k = 10;
		//Integer i = new Integer(k);
		
		Float b = a;
		System.out.println(b);
		
		
		//Float ---> int
		int c = b.intValue();
		//int c = b.hashCode();   //hashing code
		System.out.println(c);   
		
		//Float ---->String
		String d = b.toString();
		System.out.println(d);
		
		//Float ----> boolean
		boolean e = b.isNaN(); //float->number ->false otherwise true
		System.out.println(e);
		
		//Float -----> short
		short s = b.shortValue();
		System.out.println(s);
		
		//Float ------> long
		long l = b.longValue();
		System.out.println(l);
		
		//Float ------->double
		double n = b.doubleValue();
		System.out.println(n);

	}
	
	//Helper Method;
	
	public static void main3(String[] args)
	
	{
		float a = 20.5f;
	    float b = 30.5f;
	    float maxValue = Float.max(a, b);
	    System.out.println("Maximum Value :" +maxValue);
	}
	
public static void main4(String[] args)
	{
		float a = 20.5f;
	    float b = 30.5f;
	    float minValue = Float.min(a, b);
	    System.out.println("Maximum Value :" +minValue);
	}
public static void main(String[] args)
{
	float a = 20.0f;
    float b = 30.0f;
    float sum = Float.sum(a, b);
    System.out.println("Maximum Value :" +sum);
}
}
