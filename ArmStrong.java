package clg.dkte;

public class ArmStrong {

	public static void main(String[] args) {

		int num =103;
		
		int temp = num;
		int sum = 0;
		
		while(temp > 0)
		{
			int rev = temp % 10;
			sum = sum + ( rev * rev * rev);
			temp = temp /10;
		}
		
		if(sum == num)
			System.out.println("Armstrong");
		else
			System.out.println("Nott Armstrong");

	}

}
