
import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {

        // =================================
        // 1. BASIC ELSE-IF
        // =================================

        System.out.println("===== BASIC ELSE-IF =====");

        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Failed or needs improvement");
        }


        // =================================
        // 2. POSITIVE, NEGATIVE OR ZERO
        // =================================

        System.out.println("\n===== NUMBER CHECK =====");

        int number = 0;

        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Number is Zero");
        }


        // =================================
        // 3. LARGEST OF THREE NUMBERS
        // =================================

        System.out.println("\n===== LARGEST NUMBER =====");

        int a = 50;
        int b = 100;
        int c = 75;

        if (a >= b && a >= c) {
            System.out.println("A is the largest.");
        } else if (b >= a && b >= c) {
            System.out.println("B is the largest.");
        } else {
            System.out.println("C is the largest.");
        }


        // =================================
        // 4. AGE CATEGORY
        // =================================

        System.out.println("\n===== AGE CATEGORY =====");

        int age = 25;

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age <= 12) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior Citizen");
        }


        // =================================
        // 5. ELECTRICITY BILL
        // =================================

        System.out.println("\n===== ELECTRICITY BILL =====");

        int units = 250;
        double bill;

        if (units < 0) {
            System.out.println("Invalid electricity units.");
        } else if (units <= 100) {
            bill = units * 1.5;
            System.out.println("Bill: ₹" + bill);
        } else if (units <= 200) {
            bill = units * 2.5;
            System.out.println("Bill: ₹" + bill);
        } else {
            bill = units * 4.0;
            System.out.println("Bill: ₹" + bill);
        }


        // =================================
        // 6. DISCOUNT SYSTEM
        // =================================

        System.out.println("\n===== DISCOUNT SYSTEM =====");

        double purchase = 6000;
        double discount;

        if (purchase < 0) {
            System.out.println("Invalid purchase amount.");
        } else if (purchase >= 10000) {
            discount = 0.20;
            System.out.println("Discount: 20%");
        } else if (purchase >= 5000) {
            discount = 0.10;
            System.out.println("Discount: 10%");
        } else if (purchase >= 1000) {
            discount = 0.05;
            System.out.println("Discount: 5%");
        } else {
            discount = 0;
            System.out.println("No discount.");
        }


        // =================================
        // 7. TRAFFIC LIGHT
        // =================================

        System.out.println("\n===== TRAFFIC LIGHT =====");

        String signal = "RED";

        if (signal.equalsIgnoreCase("GREEN")) {
            System.out.println("Go");
        } else if (signal.equalsIgnoreCase("YELLOW")) {
            System.out.println("Get Ready");
        } else if (signal.equalsIgnoreCase("RED")) {
            System.out.println("Stop");
        } else {
            System.out.println("Invalid signal");
        }


        // =================================
        // 8. USER INPUT GRADING SYSTEM
        // =================================

        System.out.println("\n===== USER INPUT =====");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        int userMarks = scanner.nextInt();

        if (userMarks < 0 || userMarks > 100) {
            System.out.println("Invalid marks.");
        } else if (userMarks >= 90) {
            System.out.println("Grade A+");
        } else if (userMarks >= 80) {
            System.out.println("Grade A");
        } else if (userMarks >= 70) {
            System.out.println("Grade B");
        } else if (userMarks >= 60) {
            System.out.println("Grade C");
        } else if (userMarks >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Failed");
        }

        scanner.close();

    }
}
