package day1;
class Student{
	private int num1 = 90;  //Field Initializer
	
	public Student()
	{
		num1 = 20;   //Constructor Initializer
		System.out.println(num1);
	}
}
public class ObjectInitializaer {
	public static void main(String args[]) {
		int num2 = 40;
		System.out.println(num2);
		
		Student s = new Student();
		
		
	}
}
