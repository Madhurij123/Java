interface Abc{
	public abstract void show();
}

class Xyz implements Abc
{

	@Override
	public void show() {
		System.out.println("show()");
	}
	
}
public class AnnounymousInnerClass {

	public static void main(String[] args) {


		Xyz x = new Xyz()
		{
			public void show()
			{
				System.out.println("show())");
			}
		};
		x.show();
		

	}

}
