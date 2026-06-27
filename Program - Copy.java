class Person
{
	private String name;
	private int age;
	
	public Person()
	{
		System.out.println("public Person()");
	}
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void display()
	{
		System.out.printf("Name:%s\nAge:%d\n", name,age);
	}
}
class Employee
{
	private String name;
	private int age;
	private int id;
	private double salary;
	
	public Employee()
	{
		System.out.println("public Employee()");
	}
	public Employee(String name, int age, int id, double salary)
	{
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}
	public void display()
	{
     System.out.println("\nName:"+name+"\nAge:"+age+"\nId:"+id+"\nSalary"+salary);
	}
	
}
public class Program {
	public static void main(String[] args)
	{
		Person p = new Person();
		p.display();
		
		Employee e = new Employee();
		e.display();
	}

}
