/** Child class that supports withdrawals up to an overdraft limit. */
public class CurrentAccount extends BankAccount {
    private final double overdraftLimit;

    public CurrentAccount(String number, String holder, double balance, double overdraftLimit) {
        super(number, holder, balance);
        if (!Double.isFinite(overdraftLimit) || overdraftLimit < 0) {
            throw new IllegalArgumentException("Overdraft limit cannot be negative.");
        }
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive and finite.");
        }
        if (balance - amount < -overdraftLimit) return false;
        balance -= amount;
        return true;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Current Account ---");
        super.displayDetails();
        System.out.printf("Overdraft Limit: Rs. %.2f%n", overdraftLimit);
    }
}
