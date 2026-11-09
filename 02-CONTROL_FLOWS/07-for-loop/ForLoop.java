
public class ForLoop {

    public static void main(String[] args) {

        // =================================
        // 1. BASIC FOR LOOP
        // =================================

        System.out.println("===== BASIC FOR LOOP =====");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // =================================
        // 2. PRINT NUMBERS FROM 1 TO 10
        // =================================

        System.out.println("\n===== NUMBERS 1 TO 10 =====");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // =================================
        // 3. PRINT NUMBERS IN REVERSE
        // =================================

        System.out.println("\n===== REVERSE COUNTING =====");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }


        // =================================
        // 4. EVEN NUMBERS
        // =================================

        System.out.println("\n===== EVEN NUMBERS =====");

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }


        // =================================
        // 5. ODD NUMBERS
        // =================================

        System.out.println("\n===== ODD NUMBERS =====");

        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }


        // =================================
        // 6. SUM OF NUMBERS
        // =================================

        System.out.println("\n===== SUM OF NUMBERS =====");

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);


        // =================================
        // 7. MULTIPLICATION TABLE
        // =================================

        System.out.println("\n===== MULTIPLICATION TABLE =====");

        int number = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }


        // =================================
        // 8. FACTORIAL
        // =================================

        System.out.println("\n===== FACTORIAL =====");

        int factorialNumber = 5;
        long factorial = 1;

        for (int i = 1; i <= factorialNumber; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);


        // =================================
        // 9. NESTED FOR LOOP
        // =================================

        System.out.println("\n===== NESTED FOR LOOP =====");

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }


        // =================================
        // 10. RIGHT-ANGLED TRIANGLE PATTERN
        // =================================

        System.out.println("\n===== TRIANGLE PATTERN =====");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }


        // =================================
        // 11. MULTIPLICATION TABLES 1 TO 5
        // =================================

        System.out.println("\n===== TABLES 1 TO 5 =====");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nTable of " + i);

            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " x " + j + " = " + (i * j));

            }
        }


        // =================================
        // 12. LOOP THROUGH A STRING
        // =================================

        System.out.println("\n===== STRING LOOP =====");

        String language = "JAVA";

        for (int i = 0; i < language.length(); i++) {

            System.out.println(language.charAt(i));

        }


        // =================================
        // 13. LOOP WITH MULTIPLE VARIABLES
        // =================================

        System.out.println("\n===== MULTIPLE VARIABLES =====");

        for (int i = 1, j = 10; i <= 5; i++, j--) {

            System.out.println("i = " + i + ", j = " + j);

        }


        // =================================
        // 14. FOR LOOP WITHOUT OPTIONAL PARTS
        // =================================

        System.out.println("\n===== MANUAL FOR LOOP =====");

        int count = 1;

        for (; count <= 5;) {

            System.out.println(count);

            count++;

        }


        // =================================
        // 15. INFINITE LOOP (DO NOT RUN)
        // =================================

        System.out.println("\n===== INFINITE LOOP EXAMPLE =====");

        // Uncomment to test, then stop with Ctrl + C.
        // for (;;) {
        //     System.out.println("Infinite Loop");
        // }

    }
}
