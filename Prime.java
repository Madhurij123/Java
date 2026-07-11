package clg.dkte;

public class Prime {

	public static void main(String[] args) {

		int num = 1;
		
		boolean prime = true;

		if(num < 2)
			prime = false;
		
		for(int i = 2; i < Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				prime = false;
				break;
			}
		}
		System.out.println(prime);

	}

}
