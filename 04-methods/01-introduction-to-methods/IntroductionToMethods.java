
public class IntroductionToMethods {

    // 1. Method without parameters and return value
    static void greet() {
        System.out.println("Welcome to Java Programming!");
    }

    // 2. Method with parameters
    static void greetUser(String name) {
        System.out.println("Hello, " + name);
    }

    // 3. Method with a return value
    static int add(int a, int b) {
        return a + b;
    }

    // 4. Method returning a String
    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 5. Method with multiple calculations
    static double calculateAverage(int mark1, int mark2, int mark3) {
        int total = mark1 + mark2 + mark3;
        return total / 3.0;
    }

    // 6. Method returning a boolean
    static boolean isEligible(int age) {
        return age >= 18;
    }

    // 7. Method calling another method
    static void displayResult(int number) {

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Calling a method
        greet();

        // Calling a method with an argument
        greetUser("Abhiram");

        // Receiving a returned value
        int result = add(10, 20);
        System.out.println("Addition: " + result);

        // Receiving a String
        String fullName = getFullName("Abhi", "Ram");
        System.out.println("Full Name: " + fullName);

        // Average calculation
        double average = calculateAverage(80, 90, 100);
        System.out.println("Average: " + average);

        // Boolean result
        if (isEligible(22)) {
            System.out.println("Eligible.");
        } else {
            System.out.println("Not eligible.");
        }

        // Method calling another method
        displayResult(15);
        displayResult(20);
    }
}
