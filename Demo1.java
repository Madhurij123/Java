package clg.dkte;
class Parent
{
	public final void display()
	{
		System.out.println("Parent Class");
	}
}
class Child extends Parent
{
	/*@Override
	public  void display()
	{
		System.out.println("Child Class");
	}*/ //Cannot override final method from parent
}
public class Demo1 {

	public static void main(String[] args) {
       Child c = new Child();
       c.display();
	}

}
