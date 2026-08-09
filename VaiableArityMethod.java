package day1;

public class VaiableArityMethod {

	public static int sum(int...arr) {
		int total = 0;
		for(int num : arr)
			total = total + num;
		return total;
	}
	public static void main(String[] args) {

		int res = sum(10,30);
		System.out.println(res);

		int res1 = sum(1,2,3);
		System.out.println(res1);

		
	}

}
