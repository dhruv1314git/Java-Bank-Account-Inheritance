/** Child class that adds interest calculation to a BankAccount. */
public class SavingsAccount extends BankAccount {
    private final double interestRate;

    public SavingsAccount(String number, String holder, double balance, double interestRate) {
        super(number, holder, balance); // invoke parent constructor
        if (!Double.isFinite(interestRate) || interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate / 100;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Savings Account ---");
        super.displayDetails(); // reuse parent method
        System.out.printf("Interest Rate: %.1f%%%n", interestRate);
    }
}
