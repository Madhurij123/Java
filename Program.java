
import java.util.Scanner;

public class Program {
	public static void delay(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		class PrintTable extends Thread {
			private int num;

			public PrintTable(int num) {
				this.num = num;
			}

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.printf("%d * %d = %d\n", num, i, num * i);
					delay(1000);
				}
			}

		}
		PrintTable th1 = new PrintTable(2);
		System.out.println("state : " + th1.getState());
		th1.setPriority(1);
		th1.start();

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ANY KEY");
		sc.nextLine();
		System.out.println("state : " + th1.getState());

		try {
			th1.join();// calling thread i.e. main will wait for completion given thread i.e. th1

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		th1.start();
		
		System.out.println("state : " + th1.getState());

	}

}
