package clg.dkte;

public class Human {

	
	private int age;
	private int height;
	private int weight;
	
	public Human(int age, int height, int weight)
	{
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void display()
	{
		System.out.printf("Age: %d weight : %d height: %d\n", age, weight, weight );
	}
}
