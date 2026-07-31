enum Status{//class
	Running,Pending,Failure,Success;//Object
}
public class EnumDemo {
	public static void main(String[] args) {
		Status s = Status.Running;
		//System.out.println(s);
		
		//Status[] s = Status.values();  //values()----to display all
		//for(Status ss : s) {
			//System.out.println(ss+":"+ss.ordinal());
		//}
		
		
		switch(s) {
		
		case Running:
			System.out.println("All Good");
			break;
			
		case Failure:
			System.out.println("Try again");
			break;
		
			default:
				System.out.println("Done");
		}
	}

}
