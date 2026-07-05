	
public class Thread1 {
	
	public static void delay(int ms)
	{
		try {
			Thread.sleep(ms);
		}
		catch(Exception e)
		{
			
		}
	}

	public static void main(String[] args) {

		class MyThread extends Thread
		{
			@Override
			public void run()
			{
				for(int i = 1 ; i <= 10; i++)
				{
					System.out.println("My:" +i);
					Thread1.delay(1000);
				}
			}
		}
		MyThread m1 = new MyThread();
		m1.setDaemon(false);
		m1.start();
		
		
		class YourRunnable implements Runnable
		{
			@Override
			public void run()
			{
				for(int i = 1 ; i <= 10; i++)
				{
					System.out.println("Your:" +i);
					Thread1.delay(1000);
				}
			}
		}
		Thread th2 = new Thread(new YourRunnable());
		th2.setDaemon(false);
		th2.start();
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("Main: "+i);
			delay(1000); 
		}
	}

}
