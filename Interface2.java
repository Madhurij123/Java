package clg.dkte;

interface Prinatble1
{
	int num = 10;   /* by default field in interface is public,static,final*/
	void print( );  /*public abstract*/
}
 abstract class Test1 implements Prinatble1
{
  /*@Override
	public void print()   //There is complusory to override interface method
	{
		System.out.println("Number:"+Prinatble.num);
	}*/
//If we doenst want to override the interface method then making a class as absarct
//abstract class is force to implement sub class	 

}
 class Test2 extends Test{
	public void print()
	 {
		 System.out.println("abstract class");

	 }
 }
public class Interface2 {

	public static void main(String[] args) {

		Prinatble p = new Test2();
		p.print();
	}
}