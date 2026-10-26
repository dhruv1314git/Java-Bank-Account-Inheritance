# Superclass and Subclass: Inheritance in Real-World Applications

**Java Bank Account Management System** — a Semester 3 Object-Oriented Programming demonstration.

## Project overview

This project demonstrates how Java inheritance reduces code duplication. A parent `BankAccount` class stores common account information and implements `deposit()`, `withdraw()`, and `displayDetails()`. Two child classes extend it:

- `SavingsAccount` calculates interest with `addInterest()`.
- `CurrentAccount` allows withdrawals up to a configured overdraft limit.

Key OOP concepts: **superclass**, **subclass**, **`extends`**, **`super`**, **method overriding**, and **code reuse**.

## UML overview

```text
                    BankAccount
               (superclass / parent)
             deposit(), withdraw(),
                 displayDetails()
                        ^
                  extends / extends
                    /       \
                   /         \
         SavingsAccount     CurrentAccount
          addInterest()      withdraw() override
```

## Requirements

Java JDK 17 or later. No external dependencies.

## Compile and run

From the repository root:

```bash
javac -d out src/*.java
java -cp out Main
```

On Windows PowerShell, the same commands work with `javac` and `java` on your PATH.

## Example output

```text
--- Savings Account ---
Account No: SA101
Holder: Dhruv Patel
Balance: Rs. 6300.00
Interest Rate: 5.0%

--- Current Account ---
Account No: CA101
Holder: Kaksh Patel
Balance: Rs. 6000.00
Overdraft Limit: Rs. 5000.00
```

## How inheritance is used

1. `SavingsAccount extends BankAccount` inherits `deposit()` and other accessible behavior.
2. `super(...)` calls the `BankAccount` constructor.
3. `SavingsAccount` overrides `displayDetails()` and calls `super.displayDetails()`.
4. `CurrentAccount` overrides `withdraw()` to implement overdraft behavior.

## Project structure

```text
Java-Bank-Account-Inheritance/
├── src/
│   ├── BankAccount.java
│   ├── SavingsAccount.java
│   ├── CurrentAccount.java
│   └── Main.java
├── .gitignore
└── README.md
```

> Educational demonstration only. Real financial applications should use decimal money types (such as `BigDecimal`), transaction records, stronger validation, and security controls.

## Authors

- Patel Dhruv Girishkumar — 202503103510241
- Patel Kaksh Pravinbhai — 202503103510242
- Class / Division: 3A
