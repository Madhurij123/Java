import java.rmi.AccessException;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		int i = 20;
		int j = 0;
		
		int[] arr = new int[5];
		try {
			j = 6 / 3;
			System.out.println(arr[5]);
			if(j == 0)
				throw new ArithmeticException();
			
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero" +e);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Stay with limit");
		}
		
		System.out.println(j);
	}
}
