
import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        // =================================
        // 1. BASIC SWITCH
        // =================================

        System.out.println("===== BASIC SWITCH =====");

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");

        }


        // =================================
        // 2. SWITCH WITH STRING
        // =================================

        System.out.println("\n===== SWITCH WITH STRING =====");

        String language = "Java";

        switch (language) {

            case "Java":
                System.out.println("Java Programming");
                break;

            case "Python":
                System.out.println("Python Programming");
                break;

            case "JavaScript":
                System.out.println("JavaScript Programming");
                break;

            default:
                System.out.println("Unknown Language");

        }


        // =================================
        // 3. SWITCH WITH CHARACTER
        // =================================

        System.out.println("\n===== SWITCH WITH CHARACTER =====");

        char grade = 'A';

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Very Good");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Needs Improvement");
                break;

            default:
                System.out.println("Invalid Grade");

        }


        // =================================
        // 4. MULTIPLE CASE LABELS
        // =================================

        System.out.println("\n===== MULTIPLE CASE LABELS =====");

        int month = 4;

        switch (month) {

            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;

            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Monsoon");
                break;

            case 10:
            case 11:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Invalid Month");

        }


        // =================================
        // 5. SWITCH FALL-THROUGH
        // =================================

        System.out.println("\n===== FALL-THROUGH =====");

        int number = 2;

        switch (number) {

            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");
                break;

            default:
                System.out.println("Other");

        }


        // =================================
        // 6. SIMPLE CALCULATOR
        // =================================

        System.out.println("\n===== CALCULATOR =====");

        double firstNumber = 20;
        double secondNumber = 10;
        char operator = '+';

        switch (operator) {

            case '+':
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;

            case '-':
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;

            case '*':
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;

            case '/':
                if (secondNumber != 0) {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid Operator");

        }


        // =================================
        // 7. USER INPUT WITH SWITCH
        // =================================

        System.out.println("\n===== USER INPUT =====");

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Home");
        System.out.println("2. Profile");
        System.out.println("3. Settings");
        System.out.println("4. Logout");

        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Welcome to Home");
                break;

            case 2:
                System.out.println("Opening Profile");
                break;

            case 3:
                System.out.println("Opening Settings");
                break;

            case 4:
                System.out.println("Logging Out");
                break;

            default:
                System.out.println("Invalid Option");

        }

        scanner.close();

    }
}
