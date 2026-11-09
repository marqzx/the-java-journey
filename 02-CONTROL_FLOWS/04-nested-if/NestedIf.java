
import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        // =================================
        // 1. BASIC NESTED IF
        // =================================

        System.out.println("===== BASIC NESTED IF =====");

        int age = 25;
        boolean hasID = true;

        if (age >= 18) {

            if (hasID) {
                System.out.println("You are eligible for entry.");
            }

        }


        // =================================
        // 2. NESTED IF WITH ELSE
        // =================================

        System.out.println("\n===== NESTED IF WITH ELSE =====");

        int marks = 75;

        if (marks >= 40) {

            if (marks >= 80) {
                System.out.println("Excellent performance.");
            } else {
                System.out.println("You passed.");
            }

        } else {
            System.out.println("You failed.");
        }


        // =================================
        // 3. LOGIN VALIDATION
        // =================================

        System.out.println("\n===== LOGIN VALIDATION =====");

        String username = "admin";
        String password = "12345";

        String enteredUsername = "admin";
        String enteredPassword = "12345";

        if (username.equals(enteredUsername)) {

            if (password.equals(enteredPassword)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Incorrect password.");
            }

        } else {
            System.out.println("Incorrect username.");
        }


        // =================================
        // 4. VOTING ELIGIBILITY
        // =================================

        System.out.println("\n===== VOTING ELIGIBILITY =====");

        int voterAge = 22;
        boolean isCitizen = true;

        if (voterAge >= 18) {

            if (isCitizen) {
                System.out.println("Eligible to vote.");
            } else {
                System.out.println("Citizenship requirement not met.");
            }

        } else {
            System.out.println("You are too young to vote.");
        }


        // =================================
        // 5. LARGEST OF THREE NUMBERS
        // =================================

        System.out.println("\n===== LARGEST OF THREE =====");

        int a = 100;
        int b = 200;
        int c = 150;

        if (a > b) {

            if (a > c) {
                System.out.println("A is the largest.");
            } else {
                System.out.println("C is the largest.");
            }

        } else {

            if (b > c) {
                System.out.println("B is the largest.");
            } else {
                System.out.println("C is the largest.");
            }

        }


        // =================================
        // 6. BANK WITHDRAWAL VALIDATION
        // =================================

        System.out.println("\n===== BANK WITHDRAWAL =====");

        double balance = 10000;
        double withdrawal = 5000;
        boolean accountActive = true;

        if (accountActive) {

            if (withdrawal > 0) {

                if (withdrawal <= balance) {

                    balance = balance - withdrawal;

                    System.out.println("Withdrawal successful.");
                    System.out.println("Remaining Balance: " + balance);

                } else {
                    System.out.println("Insufficient balance.");
                }

            } else {
                System.out.println("Invalid withdrawal amount.");
            }

        } else {
            System.out.println("Account is inactive.");
        }


        // =================================
        // 7. NESTED IF WITH SCANNER
        // =================================

        System.out.println("\n===== USER INPUT =====");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        System.out.print("Do you have an ID? (true/false): ");
        boolean userHasID = scanner.nextBoolean();

        if (userAge >= 18) {

            if (userHasID) {
                System.out.println("Entry permitted.");
            } else {
                System.out.println("Please provide valid ID.");
            }

        } else {
            System.out.println("Entry denied: Age requirement not met.");
        }

        scanner.close();

    }
}
