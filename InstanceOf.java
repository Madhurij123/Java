package day2;
class Person
{
	private int id = 101;
	public Person()
	{
		
	}
	
	public void show()
	{
		System.out.println(id);
	}
	
}
class Employee extends Person{
	private int salary = 101;
	
	public void show1()
	{
		System.out.println(salary);
	}
}
public class InstanceOf {

	public static void main(String[] args) {
		
		/*
		 * Person p = new Employee(); 
		 * boolean flag = p instanceof Person;
		 * System.out.println(flag);
		 */
		
		//--gives True ----when that class or it's subclas mention
		Employee e = (Employee) Person();
		boolean flag = e instanceof Person;
		 System.out.println(flag);
		
	}

	private static Employee Person() {
		// TODO Auto-generated method stub
		return null;
	}

}
