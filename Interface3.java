package clg.dkte;
interface A
{
	void print();
}
interface B
{
	void print();
}

class Demo7 implements A, B
{
	@Override
	public void print()
	{
		System.out.println("public print()");
	}
}
public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           A a = new Demo7();
           a.print();
	}

}
