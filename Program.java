package clg.dkte;

public class Program {

	public static void main(String[] args) {

		// Date d = new Date();
		 //d.printDate();
		
		System.out.println("------------------------Parameterless  Constructor-------------");
		Employee emp1 = new Employee();
		emp1.printRecord();
		
		System.out.println("------------------------Parameterized Constructor-------------");
		Date dt3 = new Date(01, 9, 2009); 
		
		Employee emp = new Employee(1, " dhgjs", 10000, dt3 );
		//emp.acceptRecord();
		emp.printRecord();
		
		System.out.println("------------------------Parameterized Constructor-------------");
       Employee emp2 = new Employee();
       emp2.acceptRecord();
       emp2.printRecord();
		
	}

}
