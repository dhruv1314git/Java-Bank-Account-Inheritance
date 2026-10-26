/** Parent class with fields and operations common to all bank accounts. */
public class BankAccount {
    private final String accountNumber;
    private final String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive and finite.");
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive and finite.");
        }
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.printf("Balance: Rs. %.2f%n", balance);
    }
}
