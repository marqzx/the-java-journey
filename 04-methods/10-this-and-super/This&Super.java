class User {

    String username;

    User(String username) {
        this.username = username;
    }

    void displayUser() {
        System.out.println("Username: " + username);
    }
}

class Customer extends User {

    String connectionId;

    Customer(String username, String connectionId) {

        super(username);

        this.connectionId = connectionId;
    }

    void displayCustomer() {

        super.displayUser();

        System.out.println("Connection ID: " + this.connectionId);
    }
}