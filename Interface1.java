package clg.dkte;

interface Prinatble
{
	int num = 10;   /* by default field in interface is public,static,final*/
	void print( );  /*public abstract*/
}
 class Test implements Prinatble
{
  @Override
	public void print()   //There is complusory to override interface method
	{
		System.out.println("Number:"+Prinatble.num);
	}

}
public class Interface1 {

	public static void main(String[] args) {

		Prinatble p = new Test();
		p.print();
	}

}
