package clg.dkte;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	
	public Employee()
	{
		this();   ///Constructor Chaining
	}
	
	public Employee(int id , String name, double salary)
	{
		this.id = id;
		this.name =  name;
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.printf("Id: %d name: %s salary: %.2f\n", id, name, salary);
	}

	public static void main1(String[] args) {
		
		Employee[] arr = new Employee[2];
		
		arr[0] = new Employee(10,"abc",12000.0);
		arr[1] = new Employee(20,"xyz",120000.0);
		
		for(Employee arr1 : arr )
		{
			arr1.display();
		}

	}

	
	public static void main(String[] args)
	{
		Employee arr[] = null;
		arr = new Employee[2];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		
		//arr[0].display();    ///Throw NullPointerException
	}
}
