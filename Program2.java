package clg.dkte2;

public class Program2 {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Nita", 1000.00);
		Employee e2 = new Employee(101, "Nita", 1000.00);

		//boolean res =(e1 == e2); //It comapre references that not same
		//System.out.println(res);
		
		boolean res = e1.equals(e2); //Object class equcals method also compare a reefernecs
		System.out.println(res);
	}

}
