class M{
	public void show()
	{
		System.out.println("show()");;
	}
	class N{
		public void print()
		{
			System.out.println("print()");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {

		M m = new M();
		m.show();
		
		
		M.N n = m.new N();
		n.print();
		
	}

}
