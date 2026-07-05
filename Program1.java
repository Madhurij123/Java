
public class Program1 {

	public static void main1(String[] args) {

		Account acc = new Account(1, "Saving", 1000.00);
		
		//1.extends Thread class & run() method
		class DepositThread extends Thread
		{
			@Override
			public void run() {
			for(int i = 1 ;  i <= 1000; i++)
			{
				acc.deposit(100);
				System.out.println("Baance After Deposit:"+acc.getBalance());
			}
		}
	}
		DepositThread th1 = new DepositThread();
		th1.start();
		
		class WithdrawThread extends Thread
		{
			@Override
			public void run() {
			for(int i = 1 ;  i <= 1000; i++)
			{
				acc.withdraw(100);
				System.out.println("Baance After Withdraw:"+acc.getBalance());
			}
		}
	}
		WithdrawThread th2 = new WithdrawThread();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Final Balanace:"+acc.getBalance());
		
	}
	
	//Avoid Race Condition -when depoit() & withdraw() not return as Synchroized
	
	//----------------use Synchroinzed block;-------------------------
	
	public static void main2(String[] args) {

		Account acc = new Account(1, "Saving", 1000.00);
		
		//1.extends Thread class & run() method
		class DepositThread extends Thread
		{
			@Override
			public void run() {
			for(int i = 1 ;  i <= 1000; i++)
			{
				synchronized (acc) { //lock
					acc.deposit(100);
					System.out.println("Baance After Deposit:" + acc.getBalance());
				}//unclock
			}
		}
	}
		DepositThread th1 = new DepositThread();
		th1.start();
		
		class WithdrawThread extends Thread
		{
			@Override
			public void run() {
			for(int i = 1 ;  i <= 1000; i++)
			{
				synchronized (acc) {
					acc.withdraw(100);
					System.out.println("Baance After Withdraw:" + acc.getBalance());
				}
			}
		}
	}
		WithdrawThread th2 = new WithdrawThread();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Final Balanace:"+acc.getBalance());
		
	}
	
	public static void main(String[] args) {

		Account acc = new Account(1, "Saving", 1000.00);
		
		//1.extends Thread class & run() method
		class DepositThread extends Thread
		{
			@Override
			public void run() {
			for(int i = 1 ;  i <= 1000; i++)
			{
				acc.deposit(100);
				System.out.println("Baance After Deposit:"+acc.getBalance());
			}
		}
	}
		DepositThread th1 = new DepositThread();
		th1.start();
		
		class WithdrawThread extends Thread
		{
			@Override
			public void run() {
			for(int i = 1 ;  i <= 1000; i++)
			{
				acc.withdraw(100);
				System.out.println("Baance After Withdraw:"+acc.getBalance());
			}
		}
	}
		WithdrawThread th2 = new WithdrawThread();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Final Balanace:"+acc.getBalance());
		
	}

}
