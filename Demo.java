@FunctionalInterface
interface A
{
	void show();
}
public class Demo {

	public static void main(String[] args) {

		/*A obj = new A()
				{
		          	public void show() {
		          		System.out.println("Show() method");
		          	}
				};
				obj.show();*/
		
		//Lambda Excpression
		A obj = ()-> System.out.println("Show() method");  //Single line not need of curly braces
       
		obj.show();
	}

}
