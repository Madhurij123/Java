package day1;

class Squre{
	private int height;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public void display()
	{
		System.out.println("Height:"+height);
	}

	public Squre(int height) {
		super();
		this.height = height;
	}

}
public class MethodArgument {

	public static void testMethod(Squre s)
	{
		s.setHeight(90);
	}
	public static void main(String[] args) {

		Squre s = new Squre(23);
		s.display();
		
		testMethod(s);
		
		s.display();
		
		
	}

}
