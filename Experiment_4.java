//Create a class Savings Account. Demonstrate the static variable and static
//method for calculation of monthly interest and modification of interest rate.
class SavingAccount
{
	private static double annualRateIntrest = 0.0;
	
	private  double savingBalance = 0.0;
	
	public SavingAccount(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	
	public static double getAnnualRateIntrest() {
		return annualRateIntrest;
	}


	public static void setAnnualRateIntrest(double annualRateIntrest) {
		SavingAccount.annualRateIntrest = annualRateIntrest;
	}


	public double getSavingBalance() {
		return savingBalance;
	}


	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}


	public void calculateMonthlyInterest()
	{
		double monthlyIntrest = (savingBalance * annualRateIntrest ) / 12.0;
		savingBalance += monthlyIntrest;
	}
	
	public static void modifyInterestRate(double newRate)
	{
		annualRateIntrest = newRate;
	}
}
public class Experiment_4 {

	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount(2000.0);
		SavingAccount sa1 = new SavingAccount(3000.0);
		
		SavingAccount.modifyInterestRate(0.04);
		
		sa.calculateMonthlyInterest();
		sa1.calculateMonthlyInterest();
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Balances at 4% annual interest:");
        System.out.println("Saver 1 balance: "+sa.getSavingBalance());
        System.out.println("Saver 2 balance: " +sa1.getSavingBalance());

		System.out.println("---------------------------------------------------");
		
		SavingAccount.modifyInterestRate(0.05);
		
		sa.calculateMonthlyInterest();
		sa1.calculateMonthlyInterest();
		
        System.out.println("---------------------------------------------------");
		
		System.out.println("Balances at 5% annual interest:");
        System.out.println("Saver 1 balance: "+sa.getSavingBalance());
        System.out.println("Saver 2 balance: " +sa1.getSavingBalance());

		System.out.println("---------------------------------------------------");
		
		

	}

}
