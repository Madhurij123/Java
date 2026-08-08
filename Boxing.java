package day1;

public class Boxing {

	public static void main(String[] args) {

		//Wrapper class is Final
		int a = 10;
		Integer i = a;
		System.out.println("Boxing:"+i);
		
		Double b = 12.6;
		int x = b.intValue();
		System.out.println("UnbOxing:"+x);
	}

}
