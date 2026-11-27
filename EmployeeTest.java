package com.dkte;


class Employee
{
	private int id ;
	private String name;
	private static double salary = 1009.00;
	
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public static void setSalary(double salary)
	{
		Employee.salary = salary;   //For static field there is need to get static getter and setter
	}
	
	public static double getSalary()
	{
		return salary;
	}
	public void display()
	{
		System.out.println("Employee Id:" +id);
		System.out.println("Employee Name:" +name);
		System.out.println("Employee Salary:" +salary);

	}
	
}

public class EmployeeTest {

	public static void main(String[] args)
	{
     Employee e = new Employee(101,"gdfh");
     e.display();
     
     
     System.out.println();
     
     Employee e2 = new Employee(102, "abc");
     e2.display();
     
     System.out.println();

     
     e2.setSalary(200000);
     System.out.println("Updated Salary:"+e2.getSalary());
     
	}

}
