class B{
	public static String name = "abc";
	public static void show()
	{
		System.out.println(name);
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B.show();
      
      B.name = "xyz";
      System.out.println(B.name);  //static variable we can change but not final
	}

}
