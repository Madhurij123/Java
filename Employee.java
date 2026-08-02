import javax.print.attribute.standard.MediaSize.Other;

public class Employee implements Comparable<Employee>{
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
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public boolean equal(Object obj)
	{
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return this.id == other.id;
	}

	@Override
	public int compareTo(Employee o) {
		int diff = this.id - o.id;
		return diff;
	}
	
}
