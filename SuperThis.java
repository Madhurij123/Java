
class Super{
	private int a;
	public Super()
	{
		System.out.println("A super()");
	}
	public Super(int a) {
		this.a = a;
		System.out.println("a param");
	}
}
class Sub extends Super{
	private int a1;
	public Sub()
	{
		super(4);  //when we pass paramter then call parameterized constructor of super
		System.out.println("B super()");
	}
	public Sub(int a1) {
		this.a1 = a1;
		this();
		System.out.println("b param");

	}
}
public class SuperThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Sub b = new Sub();  //defualt constructor of both class
		
		Sub b = new Sub(4); //default constructor of a and parameterized of b
	}

}
