import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Program {
	public static void main(String[] args)
	{
		List<Employee> list = new ArrayList<>();
	    
		Collections.addAll(list,
				new Employee(10,"abc",40000),
				new Employee(22,"xyz",20000),
				new Employee(32,"asdf",30000),
				new Employee(42,"shds",50000));
		
		System.out.println("Employee:");
		for(Employee e : list)
		{
			System.out.println(e);
		}
		
	   int index = 1;
	   Employee emp = list.get(index);
	   System.out.println(emp.toString());
	   System.out.println();
	   
	   ListIterator<Employee> trav = list.listIterator();
	   //-----------------------Forward----------------
	   System.out.println("Forward");
	   while(trav.hasNext())
	   {
		   Employee e1 = trav.next();
		   System.out.println(e1);
	   }
	   System.out.println();
	   
	   //---------------------Bi-directional-----------
	   System.out.println("Bi-directional");
	   trav = list.listIterator(list.size());
	   while(trav.hasPrevious())
	   {
		   Employee e2 = trav.previous();
		   System.out.println(e2);
	   }
	   System.out.println();
	   
	   //---------------------Searching----------------
	     int id = 10; 
		Employee key = new Employee(); 
		key.setId(id);
		
		int idx = list.indexOf(key); 
		if(idx!=-1) {
			Employee b = list.get(idx); 
			System.out.println( b + " found ");
		}
		else 
		{
			System.out.println("not found");

		}
		
		Collections.sort(list);
		System.out.println("Employee Id:");
		for(Employee c : list)
		{
			System.out.println(c);
		}
	   System.out.println();
	   
	   class EmployeeIdComparator implements Comparator<Employee>
	   {

		@Override
		public int compare(Employee x, Employee y) {
			int res = Integer.compare(x.getId(), y.getId());
			return res;
		}
		   
	   }
	   Collections.sort(list, new EmployeeIdComparator());
	   System.out.println("(Comparator)Employee Id:");
		for(Employee c : list)
		{
			System.out.println(c);
		}
		System.out.println();
		
		class EmployeeSalaryCompatator implements Comparator<Employee>
		{

			@Override
			public int compare(Employee x, Employee y) {
				int diff = Double.compare(x.getSalary(), y.getSalary());
				return diff;
			}
		}
		Collections.sort(list, new EmployeeSalaryCompatator());
		System.out.println("(Comparator)Employee Salary:");
		for(Employee c : list)
		{
			System.out.println(c);
		}
		System.out.println();
		
		class EmployeeNameCompatator implements Comparator<Employee>
		{

			@Override
			public int compare(Employee x, Employee y) {
				int res = x.getName().compareTo(y.getName());
				return res;
			}
		}
		Collections.sort(list, new EmployeeNameCompatator());
		System.out.println("(Comparator)Employee Name::");
		for(Employee c : list)
		{
			System.out.println(c);
		}
		System.out.println();
		

	}
}
