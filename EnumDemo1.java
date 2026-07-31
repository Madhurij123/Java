enum Statusb{//class
	Running,Pending,Failure,Success;//Object
}
public class EnumDemo1 {

	public static void main(String[] args) {

		Statusb s= Statusb.Running;

		System.out.println(s.getClass().getSuperclass());  //Enum is Super Class
		
		if(s == Statusb.Failure) {
			System.out.println("All Failure");
		}
		else if(s == Statusb.Running) {
			System.out.println("Running");
		}
		else
		{
			System.out.println("Done");
		}
	}

}
