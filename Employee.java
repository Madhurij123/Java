package clg.dkte;

import java.util.*;
public class Employee {
	private int id;
	private String name;
	private double salary;
	
	private Date joining ;  //Association ---------------------Getting Refereance from Date class---------------------
	
	public Employee()
	{
     this.id = 0;
     this.name = null;
     this.salary = 0.0;
     this.joining = new Date();   //Creating a Object
	}
	
	public Employee(int id, String name, double salary, Date joining)
	{
		 this.id = id;
		 this.name = name;
		 this.salary = salary;;
		 this.joining = joining;    //It allow tp access in Prameterized Constructor using this
	}

	public void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a id:");
		id = sc.nextInt();
		
		System.out.println("Enter a name:");
		name = sc.next();
		
		System.out.println("Enter a salary");
		salary = sc.nextDouble();
		
		this.joining.acceptDate();
	}
	public void printRecord()
	{
		System.out.printf("Id:%d\nName:%s\nSalary:%.2f\n", id, name,salary);
		this.joining.printDate();
	}
}
