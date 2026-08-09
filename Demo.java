package day1;

public class Demo {

	public static void main(String[] args) {

		int a = 10;  //without initialization - ---complie time error
		a++;
		//++a;
		System.out.println(a);
		
		Object o = null;  //allow
		o.toString(); //runtime error
		
	}

}
