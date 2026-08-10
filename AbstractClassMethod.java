package day2;
abstract class a{
	
	/*we allow to extends it
	 * 1.we cannont create abstract class object;
	 * 2.abstract class have zero or more
	 * abstract method 3.it has field,constructor and methods
	 */
	public void show() {
		System.out.println("Welcome in java");
	}
}
class b extends a{
	
}
public class AbstractClassMethod {
	public static void main(String[] args) {
		a ac = new b();
		ac.show();
	}
}
