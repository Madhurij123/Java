package clg.dkte2;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee()
	{
		
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj)
	{
		Employee other = (Employee) obj; //Downcatsing is mandatory
		if(this.id == other.id)  //e1.equcals(e2);
			return true;
		return false;
	}
	@Override
	public String toString()
	{
		return "Employee [empid=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
