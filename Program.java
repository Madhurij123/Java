package clg.dkte;

public class Program {

	public static void main(String[] args) {

		Shape[] arr =
			{
					new Reactangle(1,2),
					new Circle(4),
					new Squre(2)
			};
		
		double total = Shape.cal(arr);
		System.out.println("Area:"+total);
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Peri:"+arr[i].calPeri());
		}
	}
}
