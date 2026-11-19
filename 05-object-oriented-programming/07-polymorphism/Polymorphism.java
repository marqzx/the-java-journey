
class SupportTicket {

    protected int ticketId;
    protected String customerName;

    SupportTicket(int ticketId, String customerName) {
        this.ticketId = ticketId;
        this.customerName = customerName;
    }

    void resolveTicket() {
        System.out.println("Resolving general support ticket.");
    }

    void displayDetails() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Customer: " + customerName);
    }
}

class TechnicalTicket extends SupportTicket {

    TechnicalTicket(int ticketId, String customerName) {
        super(ticketId, customerName);
    }

    @Override
    void resolveTicket() {
        System.out.println(
            "Technical team is troubleshooting the issue."
        );
    }

    void restartConnection() {
        System.out.println("Connection restart initiated.");
    }
}

class BillingTicket extends SupportTicket {

    BillingTicket(int ticketId, String customerName) {
        super(ticketId, customerName);
    }

    @Override
    void resolveTicket() {
        System.out.println(
            "Billing team is checking the customer's invoice."
        );
    }
}

class NetworkTicket extends SupportTicket {

    NetworkTicket(int ticketId, String customerName) {
        super(ticketId, customerName);
    }

    @Override
    void resolveTicket() {
        System.out.println(
            "Network team is investigating connectivity."
        );
    }
}

class TicketManager {

    // Runtime polymorphism
    void processTicket(SupportTicket ticket) {

        ticket.displayDetails();
        ticket.resolveTicket();

        System.out.println();
    }

    // Compile-time polymorphism: method overloading
    void searchTicket(int ticketId) {
        System.out.println("Searching ticket ID: " + ticketId);
    }

    void searchTicket(String customerName) {
        System.out.println(
            "Searching customer: " + customerName
        );
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        TicketManager manager = new TicketManager();

        // Upcasting
        SupportTicket ticket1 =
                new TechnicalTicket(101, "Abhi");

        SupportTicket ticket2 =
                new BillingTicket(102, "Arun");

        SupportTicket ticket3 =
                new NetworkTicket(103, "Rahul");

        System.out.println("RUNTIME POLYMORPHISM");

        manager.processTicket(ticket1);
        manager.processTicket(ticket2);
        manager.processTicket(ticket3);

        System.out.println("COMPILE-TIME POLYMORPHISM");

        manager.searchTicket(101);
        manager.searchTicket("Abhi");

        System.out.println("\nDOWNCASTING");

        if (ticket1 instanceof TechnicalTicket technical) {

            technical.restartConnection();
        }

        System.out.println("\nTYPE CHECKING");

        if (ticket2 instanceof BillingTicket) {
            System.out.println("Ticket 2 is a BillingTicket");
        }
    }
}
