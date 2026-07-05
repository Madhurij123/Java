
public class Priority {

	public static void delay(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		
		class PrintTable extends Thread
		{
			//Constructor
			private int num;
			public PrintTable(int num)
			{
				this.num = num;
			}
			@Override
			public void run()
			{
				for(int i = 1; i <= 10; i++)
				{
					System.out.printf("%d * %d = %d\n",num, i, num * i);
					delay(1000);
				}
			}
		}
		
		PrintTable th1 = new PrintTable(2);
		th1.setPriority(1);  //min_priority
		th1.start();
		
		PrintTable th3 = new PrintTable(3);//avarage_priority
		th3.setPriority(5);
		th3.start();
		
		PrintTable th2 = new PrintTable(4); //max_priority
		th1.setPriority(10);
		th2.start();
		
		try {
		// calling thread i.e. main will wait for completion given thread i.e. th1  
			th1.join();
			th2.join();
			th3.join();


		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Exit");
	}

}
