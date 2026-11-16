package clg.dkte;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {

		
		//Array of Refernece
		Employee[] arr = new Employee[]{
				 new Employee(4, "B", "Clerk", "Sales", 723.44),
			        new Employee(8, "X", "Manager", "Accounts", 823.23),
			        new Employee(2, "P", "Clerk", "Research", 234.23),
			        new Employee(9, "N", "Manger", "Sales", 252.53),
			        new Employee(5, "D", "Clerk", "Accounts", 923.23),
			        new Employee(1, "Q", "Analyst", "Research", 826.23),
			        new Employee(7, "H", "Clerk", "Research", 845.24),
			        new Employee(6, "A", "Analyst", "Research", 832.23),
			        new Employee(3, "G", "Analyst", "Sales", 952.44)
		     };	
		
		System.out.println("Employee:");
		for(Employee e: arr)
		{
			System.out.println(e);
		}
		System.out.println();

		
		class EmployeeIdComparator implements Comparator<Employee>
		{

			@Override
			public int compare(Employee x, Employee y) {
			  int diff = Integer.compare(x.getId(), y.getId());
			  return diff;
			}
			
		}
		Arrays.sort(arr, new  EmployeeIdComparator());
		System.out.println("After sorting Employee:");
		for(Employee e: arr)
		{
			System.out.println(e);
		}
		System.out.println();

		
		//*Employees sort by name ---- Anonymous Inner class (empNameComparator)
     Comparator<Employee> empID = new Comparator<Employee>()
    		 {

				@Override
				public int compare(Employee x, Employee y) {
				
					int diff = x.getName().compareTo(y.getName());
					return diff;
				}
    	 
    		 };
        Arrays.sort(arr, empID);
		System.out.println("Anonymous Inner class:");
		for(Employee e: arr)
		{
			System.out.println(e);
		}
		System.out.println();

		
		//Empolyees sort by Job : Anonymous Inner class Anonymous object 
		
		Arrays.sort(arr,new Comparator<Employee>()
		 {

			@Override
			public int compare(Employee x, Employee y) {
			
				int diff = x.getDept().compareTo(y.getDept());
				return diff;
			}
			});
		
		System.out.println("Anonymous Object:");
		for(Employee e: arr)
		{
			System.out.println(e);
		}
		System.out.println();

		
		//   // lambda is short-hand implementation of the abstract method in the functional interface
		    Arrays.sort(arr, (Employee x, Employee y) -> {
			
				int diff = -x.getDept().compareTo(y.getDept());
				return diff;
			});
		    System.out.println("Anonymous Method:");
			for(Employee e: arr)
			{
				System.out.println(e);
			}
			
			//*Empolyees sort by name desc (type inference) 
			 Arrays.sort(arr ,(x, y)-> {
					
					int diff = Double.compare(x.getSalary(), y.getSalary());
					return diff;
				});
			    System.out.println("Anonymous Method:");
				for(Employee e: arr)
				{
					System.out.println(e);
				}
				System.out.println();

			//No need to of variable
				 Arrays.sort(arr ,(x, y)-> {
						
					return -Double.compare(x.getSalary(), y.getSalary());
					});
				    System.out.println("Anonymous Method:");
					for(Employee e: arr)
					{
						System.out.println(e);
					}
					
			//Lambda Expression
					 Arrays.sort(arr ,(x, y)-> -Double.compare(x.getSalary(), y.getSalary()));
					 System.out.println("Lmabda Expression:");
						for(Employee e: arr)
						{
							System.out.println(e);
						}
						System.out.println();

	List<Employee> list = Arrays.asList(arr);
	list.sort((x,y) -> Integer.compare(x.getId(),y.getId()));
	list.forEach(e -> System.out.println(e));
	}

}
