
import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        // =================================
        // 1. BASIC IF-ELSE
        // =================================

        System.out.println("===== BASIC IF-ELSE =====");

        int age = 16;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }


        // =================================
        // 2. EVEN OR ODD
        // =================================

        System.out.println("\n===== EVEN OR ODD =====");

        int number = 15;

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }


        // =================================
        // 3. POSITIVE OR NEGATIVE
        // =================================

        System.out.println("\n===== POSITIVE OR NEGATIVE =====");

        int value = -25;

        if (value >= 0) {
            System.out.println("Number is positive or zero.");
        } else {
            System.out.println("Number is negative.");
        }


        // =================================
        // 4. PASS OR FAIL
        // =================================

        System.out.println("\n===== PASS OR FAIL =====");

        int marks = 35;

        if (marks >= 40) {
            System.out.println("Congratulations! You passed.");
        } else {
            System.out.println("Sorry! You failed.");
        }


        // =================================
        // 5. GREATER OR SMALLER
        // =================================

        System.out.println("\n===== GREATER OR SMALLER =====");

        int first = 50;
        int second = 30;

        if (first > second) {
            System.out.println(first + " is greater.");
        } else {
            System.out.println(second + " is greater or equal.");
        }


        // =================================
        // 6. LOGIN VALIDATION
        // =================================

        System.out.println("\n===== LOGIN VALIDATION =====");

        String username = "admin";
        String enteredUsername = "admin";

        if (username.equals(enteredUsername)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username.");
        }


        // =================================
        // 7. ELIGIBILITY CHECK
        // =================================

        System.out.println("\n===== ELIGIBILITY CHECK =====");

        int drivingAge = 20;
        boolean hasLicense = false;

        if (drivingAge >= 18 && hasLicense) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive.");
        }


        // =================================
        // 8. DISCOUNT CALCULATION
        // =================================

        System.out.println("\n===== DISCOUNT CALCULATION =====");

        double purchaseAmount = 1500;
        double finalAmount;

        if (purchaseAmount >= 1000) {

            finalAmount = purchaseAmount * 0.90;

        } else {

            finalAmount = purchaseAmount;

        }

        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Final Amount: " + finalAmount);


        // =================================
        // 9. USER INPUT
        // =================================

        System.out.println("\n===== USER INPUT =====");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        if (userNumber % 5 == 0) {
            System.out.println("Number is divisible by 5.");
        } else {
            System.out.println("Number is not divisible by 5.");
        }

        scanner.close();

    }
}
