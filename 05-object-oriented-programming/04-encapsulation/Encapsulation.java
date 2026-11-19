
class BankAccount {

    // Private fields: cannot be accessed directly
    private long accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(long accountNumber,
                       String accountHolder,
                       double initialBalance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException(
                "Initial balance cannot be negative"
            );
        }
    }

    // Getter methods
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Controlled operation: deposit money
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;

            System.out.println(
                "Deposited: " + amount
            );
        } else {
            System.out.println(
                "Deposit amount must be positive"
            );
        }
    }

    // Controlled operation: withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println(
                "Withdrawal amount must be positive"
            );
        } else if (amount > balance) {
            System.out.println(
                "Insufficient balance"
            );
        } else {
            balance -= amount;

            System.out.println(
                "Withdrawn: " + amount
            );
        }
    }

    // Display account details
    public void displayDetails() {

        System.out.println("\n--- ACCOUNT DETAILS ---");

        System.out.println(
            "Account Number: " + accountNumber
        );

        System.out.println(
            "Account Holder: " + accountHolder
        );

        System.out.println(
            "Balance: " + balance
        );
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
            123456789,
            "Abhi",
            5000
        );

        account.displayDetails();

        System.out.println("\n--- TRANSACTIONS ---");

        account.deposit(2000);

        account.withdraw(1500);

        account.withdraw(10000);

        account.deposit(-500);

        account.displayDetails();

        // Reading private data through a getter
        System.out.println(
            "\nCurrent Balance: " + account.getBalance()
        );

        // This would cause a compilation error:
        // account.balance = -10000;
    }
}
