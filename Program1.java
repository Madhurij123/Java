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
class Employee1 extends Person
{
	//private String name;
	//private int age;
	private int id;
	private double salary;
	
	public Employee1()
	{
		System.out.println("public Employee()");
	}
	public Employee1(String name, int age, int id, double salary)
	{
		//this.name = name;
		//this.age = age;
		super(name, age)
		this.id = id;
		this.salary = salary;
	}
	public void display()
	{
		super.display();
     System.out.println("\nId:"+id+"\nSalary"+salary);
	}
	
}
public class Program1 {
	public static void main(String[] args)
	{
		//Person p = new Person();
		//p.display();
		
		Employee1 e = new Employee1();
		e.display();
	}

}
