package comments;


public class Comments {

    public static void main(String[] args) {

        // =================================
        // 1. SINGLE-LINE COMMENTS
        // =================================

        System.out.println("===== SINGLE-LINE COMMENTS =====");

        // This is a single-line comment.
        // It explains what the next statement does.

        int age = 24; // Stores the user's age

        System.out.println("Age: " + age);


        // =================================
        // 2. MULTI-LINE COMMENTS
        // =================================

        System.out.println("\n===== MULTI-LINE COMMENTS =====");

        /*
         * This is a multi-line comment.
         *
         * It can contain multiple lines.
         * It is useful for explaining
         * complex logic or functionality.
         */

        int salary = 22000;

        System.out.println("Salary: " + salary);


        // =================================
        // 3. DOCUMENTATION COMMENTS
        // =================================

        System.out.println("\n===== DOCUMENTATION COMMENTS =====");

        /*
         * Documentation comments use:
         *
         * /**
         *  * Documentation content
         *  *\/
         *
         * They are used by Javadoc to generate
         * HTML documentation.
         */

        System.out.println("Documentation comments are useful for APIs.");


        // =================================
        // 4. COMMENTS IN CALCULATIONS
        // =================================

        System.out.println("\n===== COMMENTS IN CALCULATIONS =====");

        int firstNumber = 100;
        int secondNumber = 50;

        // Calculate the sum
        int sum = firstNumber + secondNumber;

        // Calculate the difference
        int difference = firstNumber - secondNumber;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);


        // =================================
        // 5. COMMENTING OUT CODE
        // =================================

        System.out.println("\n===== COMMENTING OUT CODE =====");

        int number = 10;

        System.out.println("Active statement");

        // System.out.println("This statement will not execute.");

        System.out.println("Number: " + number);


        // =================================
        // 6. COMMENTS FOR CONDITIONAL LOGIC
        // =================================

        System.out.println("\n===== COMMENTS FOR LOGIC =====");

        int marks = 85;

        // Check whether the student passed
        boolean isPassed = marks >= 40;

        System.out.println("Passed: " + isPassed);


        // =================================
        // 7. COMMENTS FOR LOOPS
        // =================================

        System.out.println("\n===== COMMENTS FOR LOOPS =====");

        // Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {

            System.out.println(i);

        }

    }


    // =================================
    // 8. JAVADOC METHOD EXAMPLE
    // =================================

    /**
     * Calculates the sum of two integers.
     *
     * @param a First number
     * @param b Second number
     * @return Sum of the two numbers
     */
    public static int add(int a, int b) {

        return a + b;

    }

}
