package clg.dkte;

public class Program {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
      Date dt1 = new Date(10,10,2006);
      Date dt2 = (Date) dt1.clone();  //used create and copy of object
      

		System.out.println("dt1 : " + dt1.toString());
		System.out.println("dt2 : " + dt2.toString());
	}

}
