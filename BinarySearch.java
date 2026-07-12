package clg.dkte;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5};
		
		System.out.println("Array Element:");
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
		int l = 0; 
		int h = arr.length -1;
		
		int key = 3;
		while(l <= h) {
			int mid = (l + h) /2;
			
			if(arr[mid] == key)
			{
				System.out.println("Element is found:"+mid);
				break;
			}
			else if(arr[mid] > key)
			{
				h = mid -1;
			}
			else
			{
				l = mid + 1;
			}
		}
		
	}

}
