ublic class Program {
	public static void main(String[] args) {
		// treat primitive type as Objects 
		int a = 10;  // primitive 
		//The Integer class wraps a value of the primitive type int in an object
		Integer b = new Integer(a); 
		//type conversion 
		double d = b.doubleValue(); //Integer -> double 
		float f = b.floatValue();  // Integer -> float 
		String str = b.toString(); // Integer -> String 
		long l = b.longValue();  // Integer -> long 
		
	}