package generic;

//Bounded Generic Type ------------------Number or its Sub Class
class Squre <T extends Number>
{
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get()
	{
		return this.obj;
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
	
		Squre<Number> b1 = new Squre<Number>();  //Okay
		
		//Box<Boolean> b1 = new Box<Boolean>(); //Error
		b1.set(101);
		b1.get();
		System.out.println(b1);

	}

}
 