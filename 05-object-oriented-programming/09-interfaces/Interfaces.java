
interface Notification {

    // Abstract method
    void sendNotification(String message);

    // Default method
    default void notificationStatus() {
        System.out.println("Notification service is active.");
    }

    // Static method
    static void showPlatform() {
        System.out.println("Notification Platform");
    }
}

// Email implementation
class EmailNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// SMS implementation
class SMSNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Push notification implementation
class PushNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}

// Main class
public class Interfaces {

    public static void main(String[] args) {

        // Interface references
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        Notification push = new PushNotification();

        // Send notifications
        email.sendNotification("Welcome to Java!");
        sms.sendNotification("Your OTP is 123456");
        push.sendNotification("You have a new message.");

        System.out.println("------------------------");

        // Default method
        email.notificationStatus();

        System.out.println("------------------------");

        // Static interface method
        Notification.showPlatform();
    }
}
