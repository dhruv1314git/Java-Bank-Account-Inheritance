/** Demonstrates inheritance, super, and method overriding in Java. */
public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA101", "Dhruv Patel", 5000, 5);
        savings.deposit(1000);  // inherited from BankAccount
        savings.addInterest();  // SavingsAccount-specific method
        savings.displayDetails(); // overridden method

        System.out.println();

        CurrentAccount current = new CurrentAccount("CA101", "Kaksh Patel", 8000, 5000);
        current.withdraw(2000); // overridden withdrawal method
        current.displayDetails();
    }
}
