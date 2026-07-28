abstract class Car
{
	public abstract void  drive();
	
	public void show()
	{
		System.out.println("abc show()");;
	}
}
class Car1 extends Car{

	@Override
	public void drive() {
		System.out.println("drive()");
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {

		Car1  c = new Car1();
		c.drive();
		c.show();
		
	}

}
