package Comparable_Interface;

public class Employee3 implements Comparable<Employee3>{

	protected int id;
	protected String name;
	protected double salary;
	
	public Employee3(int id, String name, double salary) {
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
		return "Employee3 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee3 other) {
		int diff = this.getName().compareTo(other.getName());
		return diff;
	}
	
}
