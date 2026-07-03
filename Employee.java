
public class Employee extends Person
{
	//private int id;
	private String name;
	private double salary;
	


	public Employee(int id, String name, double salary) {
		//this.id = id;
		super(id);
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return salary;
	}

    @Override
    public String toString() {
        return "Employee [id=" + getId() + ", name=" + name + ", salary=" + salary + "]";
    }
	

	

}
