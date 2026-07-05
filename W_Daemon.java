
public class W_Daemon {
	public static void delay(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		class MyThread extends Thread{
		@Override
		public void run() {
		for(int i = 0; i <= 10; i++){
			System.out.println("My:"+i);
			delay(1000);
		}
		}
	}
		MyThread th1 = new MyThread();
		th1.start();
		
		class YourRunnable implements Runnable{

			@Override
			public void run() {
				for(int i = 0; i <= 10; i++){
					System.out.println("Your:"+i);
					delay(1000);
				}
			}
		}
		Thread th2 = new Thread();
		th2.start();
		
		for(int i = 0; i <= 10; i++){
			System.out.println("Main:"+i);
			delay(1000);
		}
		
	}
}
