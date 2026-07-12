package clg.dkte;

public class BubbleSort {

	public static void main(String[] args) {
		

		int arr[] = {11, 2, 23, 44, 15};
		
		System.out.println("Array Element:");
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
		for(int i = 0; i< arr.length; i++)
		{
			for(int j = 0; j < arr.length - i -1; j++)
			{
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]  = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Array Sorting:");
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
