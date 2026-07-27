package clg.dkte;

public class Program {

	public static void main(String[] args) {
     
		
		Human[] arr = new Human[4];
		
		arr[0] = new Human(10, 50, 150);
		arr[1] = new Human(20, 60, 150);
		arr[2] = new Human(30, 70, 789);
		arr[3] = new Human(30, 78, 123);
		
		/*for(int i = 0; i < 4; i++)
		{
			arr[i].display();
		}*/
		
		for(Human arr1 : arr)
		{
			arr1.display();
			
		}
	}

}
