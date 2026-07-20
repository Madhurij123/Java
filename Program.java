
public class Program {

	public static void main(String[] args) {

		Box b1 = new Box(1, 2, 3);
		Box b2 = new Box(3, 2, 3);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}

}
