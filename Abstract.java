package clg.dkte2;

abstract class A
{
	public final void f1()  //100% complete
	{
		System.out.println("A.f1()");
	}
	
	public abstract void f2(); //100% incomplete
	
	public void f3()
	{
		System.out.println("A.f3()");
	}
}

class B extends A
{
   @Override
   public final void f2()
   {
	   System.out.println("B.f2");
   }
   @Override
   public void f3()
   {
	   System.out.println("B.F3()");
   }
}
class C extends B
{
	@Override
	   public final void f3()
	   {
		   System.out.println("C.F3()");
	   }
}
public class Abstract {
  public static void main(String[] args)
  {
	 /* B b = new B();  we can call the final method but cannot override
	  b.f1();
	  b.f2();
	  b.f3();*/
  }
}
