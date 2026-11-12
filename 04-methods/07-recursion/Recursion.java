
public class Recursion {

    // 1. Simple recursion: Countdown
    static void countdown(int number) {

        if (number <= 0) {
            System.out.println("Finished!");
            return;
        }

        System.out.println(number);

        countdown(number - 1);
    }

    // 2. Factorial using recursion
    static long factorial(int number) {

        if (number < 0) {
            throw new IllegalArgumentException(
                "Number cannot be negative"
            );
        }

        // Base case
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive case
        return number * factorial(number - 1);
    }

    // 3. Sum of natural numbers
    static int sum(int number) {

        if (number <= 0) {
            return 0;
        }

        return number + sum(number - 1);
    }

    // 4. Fibonacci using recursion
    static long fibonacci(int number) {

        if (number < 0) {
            throw new IllegalArgumentException(
                "Number cannot be negative"
            );
        }

        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        return fibonacci(number - 1)
             + fibonacci(number - 2);
    }

    // 5. Power calculation
    static long power(int base, int exponent) {

        if (exponent < 0) {
            throw new IllegalArgumentException(
                "Exponent must be non-negative"
            );
        }

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    // 6. Find array sum recursively
    static int arraySum(int[] numbers, int index) {

        if (index == numbers.length) {
            return 0;
        }

        return numbers[index]
             + arraySum(numbers, index + 1);
    }

    // 7. Reverse a String recursively
    static String reverse(String text) {

        if (text.isEmpty()) {
            return "";
        }

        return reverse(text.substring(1))
             + text.charAt(0);
    }

    // 8. Display array elements recursively
    static void displayArray(int[] numbers, int index) {

        if (index == numbers.length) {
            return;
        }

        System.out.println(numbers[index]);

        displayArray(numbers, index + 1);
    }

    public static void main(String[] args) {

        // Countdown
        System.out.println("1. Countdown");
        countdown(5);

        // Factorial
        System.out.println("\n2. Factorial");
        System.out.println("5! = " + factorial(5));

        // Sum
        System.out.println("\n3. Sum of Natural Numbers");
        System.out.println(sum(5));

        // Fibonacci
        System.out.println("\n4. Fibonacci Sequence");

        for (int i = 0; i < 8; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Power
        System.out.println("\n\n5. Power");
        System.out.println(power(2, 5));

        // Array sum
        System.out.println("\n6. Array Sum");

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(arraySum(numbers, 0));

        // String reversal
        System.out.println("\n7. String Reversal");
        System.out.println(reverse("JAVA"));

        // Array traversal
        System.out.println("\n8. Recursive Array Traversal");
        displayArray(numbers, 0);
    }
}
