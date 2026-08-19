package generic;

class Box<T>
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
public class Demo1 {

	public static void main(String[] args) {
	
		Box<Number> b1 = new Box<Number>();
		b1.set(101);
		b1.get();
		System.out.println(b1);

	}

}
 