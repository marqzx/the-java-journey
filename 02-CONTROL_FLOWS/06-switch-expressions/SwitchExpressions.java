
import java.util.Scanner;

public class SwitchExpressions {

    public static void main(String[] args) {

        // =================================
        // 1. BASIC SWITCH EXPRESSION
        // =================================

        System.out.println("===== BASIC SWITCH EXPRESSION =====");

        int day = 3;

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day";
        };

        System.out.println("Day: " + dayName);


        // =================================
        // 2. SWITCH EXPRESSION WITH STRING
        // =================================

        System.out.println("\n===== STRING SWITCH =====");

        String language = "Java";

        String description = switch (language) {
            case "Java" -> "Object-oriented programming language";
            case "Python" -> "Easy-to-learn programming language";
            case "JavaScript" -> "Web programming language";
            default -> "Unknown programming language";
        };

        System.out.println(description);


        // =================================
        // 3. MULTIPLE CASE LABELS
        // =================================

        System.out.println("\n===== MULTIPLE CASE LABELS =====");

        int month = 4;

        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Summer";
            case 6, 7, 8, 9 -> "Monsoon";
            case 10, 11 -> "Autumn";
            default -> "Invalid Month";
        };

        System.out.println("Season: " + season);


        // =================================
        // 4. SWITCH EXPRESSION WITH CHAR
        // =================================

        System.out.println("\n===== CHARACTER SWITCH =====");

        char grade = 'A';

        String result = switch (grade) {
            case 'A' -> "Excellent";
            case 'B' -> "Very Good";
            case 'C' -> "Good";
            case 'D' -> "Needs Improvement";
            case 'F' -> "Failed";
            default -> "Invalid Grade";
        };

        System.out.println("Result: " + result);


        // =================================
        // 5. SWITCH EXPRESSION WITH NUMBERS
        // =================================

        System.out.println("\n===== NUMBER SWITCH =====");

        int number = 2;

        String numberName = switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            default -> "Unknown Number";
        };

        System.out.println(numberName);


        // =================================
        // 6. SWITCH EXPRESSION CALCULATOR
        // =================================

        System.out.println("\n===== CALCULATOR =====");

        double first = 20;
        double second = 10;
        char operator = '*';

        String calculationResult = switch (operator) {

            case '+' -> "Result: " + (first + second);

            case '-' -> "Result: " + (first - second);

            case '*' -> "Result: " + (first * second);

            case '/' -> second != 0
                    ? "Result: " + (first / second)
                    : "Cannot divide by zero";

            default -> "Invalid Operator";
        };

        System.out.println(calculationResult);


        // =================================
        // 7. SWITCH WITH YIELD
        // =================================

        System.out.println("\n===== SWITCH WITH YIELD =====");

        int marks = 85;

        String gradeResult = switch (marks / 10) {

            case 10, 9 -> {
                System.out.println("Outstanding performance!");
                yield "Grade A";
            }

            case 8 -> {
                System.out.println("Very good performance!");
                yield "Grade B";
            }

            case 7 -> "Grade C";

            case 6 -> "Grade D";

            default -> "Needs Improvement";
        };

        System.out.println("Grade: " + gradeResult);


        // =================================
        // 8. SWITCH WITH ENUM
        // =================================

        System.out.println("\n===== ENUM SWITCH =====");

        Day today = Day.MONDAY;

        String dayType = switch (today) {
            case SATURDAY, SUNDAY -> "Weekend";
            case MONDAY, TUESDAY, WEDNESDAY,
                 THURSDAY, FRIDAY -> "Weekday";
        };

        System.out.println("Today is a: " + dayType);


        // =================================
        // 9. SWITCH EXPRESSION WITH SCANNER
        // =================================

        System.out.println("\n===== USER INPUT =====");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-5): ");
        int choice = scanner.nextInt();

        String menuOption = switch (choice) {
            case 1 -> "Home";
            case 2 -> "Profile";
            case 3 -> "Settings";
            case 4 -> "Notifications";
            case 5 -> "Logout";
            default -> "Invalid Option";
        };

        System.out.println("Selected: " + menuOption);

        scanner.close();

    }


    // =================================
    // 10. ENUM DECLARATION
    // =================================

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

}
