package com.dkte;
	
public class EmployeeTest {
	    public static void main(String[] args) {

	        Employee emp1 = new Employee("Madhuri", "Jadhav", 30000);
	        Employee emp2 = new Employee("Rahul", "Patil", 40000);

	        System.out.println("Yearly Salary Before Raise");

	        System.out.println(
	                emp1.getFirstName() + " " +
	                emp1.getLastName() +
	                " : " + (emp1.getMonthlySalary() * 12));

	        System.out.println(
	                emp2.getFirstName() + " " +
	                emp2.getLastName() +
	                " : " + (emp2.getMonthlySalary() * 12));

	        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
	        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

	        System.out.println("\nYearly Salary After 10% Raise");

	        System.out.println(
	                emp1.getFirstName() + " " +
	                emp1.getLastName() +
	                " : " + (emp1.getMonthlySalary() * 12));

	        System.out.println(
	                emp2.getFirstName() + " " +
	                emp2.getLastName() +
	                " : " + (emp2.getMonthlySalary() * 12));
	    }
	}


