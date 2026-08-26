package multilevel.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Program {

	public static void main(String[] args) {
		
		Employee[] arr =
			{
					new Employee(3, "S", "Clerk", "Prod", 645.3),
					new Employee(5, "H", "Manager", "Prod", 723.2),
					new Employee(2, "B", "Salesman", "Sales", 752.2),
					new Employee(1, "A", "Manager", "Sales", 235.3),
					new Employee(8, "X", "Clerk", "Prod", 923.3),
					new Employee(7, "P", "Clerk", "Sales", 623.5),
					new Employee(6, "G", "Salesman", "Sales", 402.2)	
			};
		
		class EmpDeptComparator implements Comparator<Employee>
		{

			// compare emps by dept in asc order (1st level)
			@Override
			public int compare(Employee x, Employee y) {
				int diff = x.getDept().compareTo(y.getDept());
				//job in asc order (2nd level)
				if(diff == 0)
					diff = x.getJob().compareTo(y.getJob());
				//sal in desc order (3rd level)
				if(diff == 0)
					diff = - Double.compare(x.getSal(), y.getSal());
				return diff;
			}
			
		}
		Arrays.sort(arr,new EmpDeptComparator());
		
		for(Employee e: arr)
		{
			System.out.println(e);
		}

	}

}
