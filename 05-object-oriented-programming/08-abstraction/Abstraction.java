
abstract class Payment {

    protected double amount;
    protected String transactionId;

    // Abstract class constructor
    Payment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    // Abstract method
    abstract void processPayment();

    // Concrete method
    void displayReceipt() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: ₹" + amount);
    }

    // Concrete method
    void validateAmount() {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Payment amount must be greater than zero."
            );
        }
    }
}

// UPI payment implementation
class UPIPayment extends Payment {

    UPIPayment(double amount, String transactionId) {
        super(amount, transactionId);
    }

    @Override
    void processPayment() {
        validateAmount();

        System.out.println("Processing UPI payment...");
        System.out.println("Payment completed using UPI.");
    }
}

// Card payment implementation
class CardPayment extends Payment {

    CardPayment(double amount, String transactionId) {
        super(amount, transactionId);
    }

    @Override
    void processPayment() {
        validateAmount();

        System.out.println("Processing card payment...");
        System.out.println("Payment completed using card.");
    }
}

// Net banking implementation
class NetBankingPayment extends Payment {

    NetBankingPayment(double amount, String transactionId) {
        super(amount, transactionId);
    }

    @Override
    void processPayment() {
        validateAmount();

        System.out.println("Processing net banking payment...");
        System.out.println("Payment completed using net banking.");
    }
}

// Main class
public class Abstraction {

    public static void main(String[] args) {

        // Parent class references
        Payment payment1 = new UPIPayment(500, "TXN101");
        Payment payment2 = new CardPayment(1200, "TXN102");
        Payment payment3 = new NetBankingPayment(2500, "TXN103");

        // Process first payment
        payment1.processPayment();
        payment1.displayReceipt();

        System.out.println("----------------------");

        // Process second payment
        payment2.processPayment();
        payment2.displayReceipt();

        System.out.println("----------------------");

        // Process third payment
        payment3.processPayment();
        payment3.displayReceipt();
    }
}
