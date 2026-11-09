
import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        // =================================
        // 1. BASIC IF STATEMENT
        // =================================

        System.out.println("===== BASIC IF =====");

        int age = 20;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }


        // =================================
        // 2. IF WITH COMPARISON OPERATORS
        // =================================

        System.out.println("\n===== COMPARISON OPERATORS =====");

        int number = 100;

        if (number > 50) {
            System.out.println("Number is greater than 50.");
        }

        if (number == 100) {
            System.out.println("Number is equal to 100.");
        }


        // =================================
        // 3. IF WITH LOGICAL AND (&&)
        // =================================

        System.out.println("\n===== LOGICAL AND =====");

        int userAge = 25;
        boolean hasLicense = true;

        if (userAge >= 18 && hasLicense) {
            System.out.println("You can drive.");
        }


        // =================================
        // 4. IF WITH LOGICAL OR (||)
        // =================================

        System.out.println("\n===== LOGICAL OR =====");

        boolean hasEmail = true;
        boolean hasPhone = false;

        if (hasEmail || hasPhone) {
            System.out.println("User has contact information.");
        }


        // =================================
        // 5. IF WITH LOGICAL NOT (!)
        // =================================

        System.out.println("\n===== LOGICAL NOT =====");

        boolean isLoggedIn = false;

        if (!isLoggedIn) {
            System.out.println("Please log in.");
        }


        // =================================
        // 6. IF WITH NUMERIC CONDITIONS
        // =================================

        System.out.println("\n===== NUMERIC CONDITIONS =====");

        int marks = 85;

        if (marks >= 40) {
            System.out.println("Student passed.");
        }


        // =================================
        // 7. IF WITH STRING COMPARISON
        // =================================

        System.out.println("\n===== STRING COMPARISON =====");

        String username = "admin";

        if (username.equals("admin")) {
            System.out.println("Welcome, Administrator.");
        }


        // =================================
        // 8. IF WITH SCANNER INPUT
        // =================================

        System.out.println("\n===== USER INPUT =====");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int inputAge = scanner.nextInt();

        if (inputAge >= 18) {
            System.out.println("You are an adult.");
        }

        scanner.close();

    }
}
