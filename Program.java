package Compatator_Interfacse;

import java.util.Arrays;
import java.util.Comparator;

import Comparable_Interface.Employee3;

public class Program {

	public static void main(String[] args) {

		Employee[] arr =
			{
					new Employee(10,"abc",40000),
					new Employee(22,"xyz",20000),
					new Employee(32,"asdf",30000),
					new Employee(42,"shds",50000)
			};
		
		//--------------------------ID----------------
		System.out.println("Before Sorting based on id");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		class EmployeeIdCompatator implements Comparator<Employee>
		{
			@Override
			public int compare(Employee x, Employee y) {
				int diff = x.getName().compareTo(y.getName());
				return diff;
			}
		}
		Arrays.sort(arr,new EmployeeIdCompatator());
		System.out.println("-----------------------------------");
		System.out.println("After Sorting based on id");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	   //--------------------------Name----------------

		class EmployeeNameCompatator implements Comparator<Employee>
		{
			@Override
			public int compare(Employee x, Employee y) {
				int diff = x.getName().compareTo(y.getName());
				return diff;
			}
			
		}
		
		Arrays.sort(arr, new EmployeeNameCompatator());
		
		System.out.println("-----------------------------------");
		System.out.println("After Sorting based on Name");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}	
		
		//-------------------------Salary--------------
		class EmployeeSalaryComapatator implements Comparator<Employee>
		{

			@Override
			public int compare(Employee x, Employee y) {
				int diff = Double.compare(x.salary, y.salary);
				return diff;
				
			}
		}
	    Arrays.sort(arr,new EmployeeSalaryComapatator());
	    
		System.out.println("-----------------------------------");
		System.out.println("After Sorting based on Salary");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}	
		
	}

}
