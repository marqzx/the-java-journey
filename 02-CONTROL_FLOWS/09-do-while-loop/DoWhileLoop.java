
import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Basic do-while loop
        System.out.println("1. Basic do-while loop");

        int number = 1;

        do {
            System.out.println(number);
            number++;
        } while (number <= 5);


        // 2. Execute at least once
        System.out.println("\n2. Execute at least once");

        int value = 10;

        do {
            System.out.println("This executes even though the condition is false.");
        } while (value < 5);


        // 3. Reverse counting
        System.out.println("\n3. Reverse counting");

        int count = 5;

        do {
            System.out.println(count);
            count--;
        } while (count >= 1);


        // 4. Sum of numbers
        System.out.println("\n4. Sum of numbers");

        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= 10);

        System.out.println("Sum: " + sum);


        // 5. Menu-driven program
        System.out.println("\n5. Menu-driven calculator");

        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 3) {

                System.out.print("Enter first number: ");
                double first = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double second = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (first + second));
                        break;

                    case 2:
                        System.out.println("Result: " + (first - second));
                        break;

                    case 3:
                        System.out.println("Result: " + (first * second));
                        break;
                }

            } else if (choice == 4) {
                System.out.println("Exiting calculator...");
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);


        // 6. Input validation
        System.out.println("\n6. Input validation");

        int age;

        do {
            System.out.print("Enter an age between 1 and 100: ");
            age = scanner.nextInt();

            if (age < 1 || age > 100) {
                System.out.println("Invalid age. Try again.");
            }

        } while (age < 1 || age > 100);

        System.out.println("Valid age: " + age);


        // 7. Sum until user enters zero
        System.out.println("\n7. Sum until zero");

        int input;
        int total = 0;

        do {
            System.out.print("Enter a number (0 to stop): ");
            input = scanner.nextInt();

            total += input;

        } while (input != 0);

        System.out.println("Total sum: " + total);


        // 8. Password validation with three attempts
        System.out.println("\n8. Password validation");

        String correctPassword = "java123";
        String enteredPassword;
        int attempts = 0;
        boolean loggedIn = false;

        do {
            System.out.print("Enter password: ");
            enteredPassword = scanner.next();

            attempts++;

            if (enteredPassword.equals(correctPassword)) {
                loggedIn = true;
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password.");
            }

        } while (!loggedIn && attempts < 3);

        if (!loggedIn) {
            System.out.println("Maximum attempts reached. Access denied.");
        }

        scanner.close();
    }
}
