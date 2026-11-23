import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1, "Madhuri", 5000.00,"Sales"));
		emp.add(new Employee(2, "Mahek", 3000.00,"OP"));
		emp.add(new Employee(3, "Kavita", 5000.00,"Sales"));
		emp.add(new Employee(4, "Shubhangi", 35000.00,"Dev"));
		emp.add(new Employee(5, "Neha", 54000.00,"OP"));
		emp.add(new Employee(6, "Priti", 45000.00,"Sales"));
		emp.add(new Employee(7, "Swarda", 5000.00,"OP"));
		emp.add(new Employee(8, "Amruta", 8000.00,"Dev"));
		emp.add(new Employee(9, "Shravani", 85000.00,"Sales"));
		emp.add(new Employee(10, "Nilam", 50600.00,"Dev"));
		
		
		System.out.println("--------------------------------------------------");
		System.out.println("Display Employee sorted in name in asc order:");
		emp.stream()
		.sorted((x,y) -> x.getName().compareTo(y.getName()))
		.forEach(e -> System.out.println(e));
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Display all Employee from Sales dept");
		System.out.println("--------------------------------------------------");
		emp.stream()
		.filter(e -> e.getDept().equalsIgnoreCase("sales"))
		.forEach(e -> System.out.println(e));
		
		System.out.println("--------------------------------------------------");
       
		System.out.println("Display All Employee having Salary > 30000:");
		System.out.println("--------------------------------------------------");
		emp.stream()
		.filter(e -> e.getSalary() > 30000)
		.forEach(e -> System.out.println(e));
	}

}
