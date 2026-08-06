package dsa1.array;

public class ReverseArray {

	static void reverseArray(int[] arr)
	{
		int n = arr.length;
		
		int[] temp = new int[n];

		//Revrse the element
		for(int i = 0; i < n; i++) {
			temp[i] = arr[n - i - 1];   //--------5 - 0 - 1 = 4  when size is 5 place last elemnt in 4th position
		}
		
		//COPY BACK TO original 
		for(int i = 0; i < n; i ++) {
			arr[i] = temp[i];
		}
		
		
	}
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		
		reverseArray(arr);
		
		for(int a : arr)
		{
			System.out.println(a);
		}
	}
}
