class SavingsAccount {
    private double savingsBalance;

    private static double annualInterestRate;

    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest =
                (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getBalance() {
        return savingsBalance;
    }
}

public class SavingAccountTest {
    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Annual Interest Rate = 4%\n");

        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.printf(
                "Month %2d -> Saver1 Balance: $%.2f | Saver2 Balance: $%.2f%n",
                month,
                saver1.getBalance(),
                saver2.getBalance()
            );
        }

        SavingsAccount.modifyInterestRate(0.05);

        System.out.println("\nAnnual Interest Rate changed to 5%\n");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf(
            "Month 13 -> Saver1 Balance: $%.2f | Saver2 Balance: $%.2f%n",
            saver1.getBalance(),
            saver2.getBalance()
        );
    }
}
