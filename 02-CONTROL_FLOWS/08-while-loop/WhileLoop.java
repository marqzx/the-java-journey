
import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        // =================================
        // 1. BASIC WHILE LOOP
        // =================================

        System.out.println("===== BASIC WHILE LOOP =====");

        int count = 1;

        while (count <= 5) {
            System.out.println(count);
            count++;
        }


        // =================================
        // 2. PRINT NUMBERS FROM 1 TO 10
        // =================================

        System.out.println("\n===== NUMBERS 1 TO 10 =====");

        int number = 1;

        while (number <= 10) {
            System.out.println(number);
            number++;
        }


        // =================================
        // 3. REVERSE COUNTING
        // =================================

        System.out.println("\n===== REVERSE COUNTING =====");

        int reverse = 10;

        while (reverse >= 1) {
            System.out.println(reverse);
            reverse--;
        }


        // =================================
        // 4. EVEN NUMBERS
        // =================================

        System.out.println("\n===== EVEN NUMBERS =====");

        int even = 2;

        while (even <= 20) {
            System.out.println(even);
            even += 2;
        }


        // =================================
        // 5. SUM OF NUMBERS
        // =================================

        System.out.println("\n===== SUM OF NUMBERS =====");

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.println("Sum: " + sum);


        // =================================
        // 6. MULTIPLICATION TABLE
        // =================================

        System.out.println("\n===== MULTIPLICATION TABLE =====");

        int tableNumber = 5;
        int multiplier = 1;

        while (multiplier <= 10) {
            System.out.println(
                tableNumber + " x " + multiplier
                + " = " + (tableNumber * multiplier)
            );

            multiplier++;
        }


        // =================================
        // 7. FACTORIAL
        // =================================

        System.out.println("\n===== FACTORIAL =====");

        int factorialNumber = 5;
        int factorial = 1;
        int factor = 1;

        while (factor <= factorialNumber) {
            factorial *= factor;
            factor++;
        }

        System.out.println("Factorial: " + factorial);


        // =================================
        // 8. DIGIT COUNTING
        // =================================

        System.out.println("\n===== DIGIT COUNTING =====");

        int value = 12345;
        int temp = value;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        System.out.println("Number: " + value);
        System.out.println("Digits: " + digits);


        // =================================
        // 9. REVERSE A NUMBER
        // =================================

        System.out.println("\n===== REVERSE NUMBER =====");

        int original = 1234;
        int remaining = original;
        int reversed = 0;

        while (remaining > 0) {
            int digit = remaining % 10;
            reversed = reversed * 10 + digit;
            remaining /= 10;
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);


        // =================================
        // 10. SENTINEL-CONTROLLED LOOP
        // =================================

        System.out.println("\n===== SENTINEL LOOP =====");

        int input = 1;
        int total = 0;

        // Enter 0 to stop the loop
        while (input != 0) {

            total += input;

            // Example input sequence
            if (total >= 10) {
                input = 0;
            }
        }

        System.out.println("Total: " + total);


        // =================================
        // 11. USER INPUT
        // =================================

        System.out.println("\n===== USER INPUT =====");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int userNumber = scanner.nextInt();

        int counter = 1;

        while (counter <= userNumber) {
            System.out.println(counter);
            counter++;
        }


        // =================================
        // 12. PASSWORD VALIDATION
        // =================================

        System.out.println("\n===== PASSWORD VALIDATION =====");

        String correctPassword = "java123";
        String enteredPassword = "";

        int attempts = 0;
        int maxAttempts = 3;

        while (!enteredPassword.equals(correctPassword)
                && attempts < maxAttempts) {

            System.out.print("Enter password: ");
            enteredPassword = scanner.next();

            attempts++;

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Incorrect password.");
            }
        }

        if (!enteredPassword.equals(correctPassword)) {
            System.out.println("Maximum attempts reached.");
        }


        // =================================
        // 13. DO NOT RUN WITHOUT A BREAK
        // =================================

        System.out.println("\n===== INFINITE LOOP EXAMPLE =====");

        // Uncomment to test an infinite loop.
        // while (true) {
        //     System.out.println("Running forever...");
        // }

        scanner.close();

    }
}
