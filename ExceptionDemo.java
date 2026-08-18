import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		System.out.println("Enter a number:");
		try {
			 num = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(num - 48);
	}

}
