class A
{
	public void showRecord()
	{
		System.out.println("A.showRecord()");
	}
	public void printRecord()
	{
		System.out.println("A.printRecord()");
	}
}
class B extends A
{
	public void printRecord()
	{
		System.out.println("B.printRecord()");
	}
	public void displayRecord()
	{
		System.out.println("B.displayRecord()");
	}
}
public class Program3 {
	
	public static void main(String[] args)
	{
		A a = new B(); //Upcasting
		a.showRecord();
		a.printRecord();  //method same in both classes..so executes sub class method
		//a.displayRecord();    //Complie tIme Error ---beacuse the displayRecord() not presnt in A
		
		
		B b =(B) a;
		b.showRecord();   //Not a Mthod B  BUT Extends class A,,,so it is accessible
		b.printRecord();
		b.displayRecord();
		
		
	}
	public static void main1(String[] args)
	{
		B b = new B();
		b.displayRecord();
		b.showRecord();
		b.printRecord();
		
	}

}
