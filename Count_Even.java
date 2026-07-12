package clg.dkte;

public class Count_Even {

	public static void main(String[] args)
	{
		int arr[] = {1,2 ,3,4,5};
		int even = 0, odd =0;
		for(int a : arr) {
			if(a % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even:"+even);
		System.out.println("Odd:"+odd);

	}
}
