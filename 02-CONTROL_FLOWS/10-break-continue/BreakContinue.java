
public class BreakContinue {

    public static void main(String[] args) {

        // 1. Basic break statement
        System.out.println("1. Basic break");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }


        // 2. Basic continue statement
        System.out.println("\n2. Basic continue");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }


        // 3. Print only even numbers
        System.out.println("\n3. Even numbers");

        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) {
                continue;
            }

            System.out.println(i);
        }


        // 4. Stop when a number is found
        System.out.println("\n4. Find a number");

        int target = 7;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Checking: " + i);

            if (i == target) {
                System.out.println("Number found!");
                break;
            }
        }


        // 5. Skip multiples of 3
        System.out.println("\n5. Skip multiples of 3");

        for (int i = 1; i <= 20; i++) {

            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }


        // 6. Break inside a while loop
        System.out.println("\n6. Break inside while");

        int number = 1;

        while (number <= 10) {

            if (number == 6) {
                break;
            }

            System.out.println(number);
            number++;
        }


        // 7. Continue inside a while loop
        System.out.println("\n7. Continue inside while");

        int count = 0;

        while (count < 10) {

            count++;

            if (count == 5) {
                continue;
            }

            System.out.println(count);
        }


        // 8. Nested loops with break
        System.out.println("\n8. Nested loops with break");

        for (int row = 1; row <= 3; row++) {

            for (int column = 1; column <= 5; column++) {

                if (column == 4) {
                    break;
                }

                System.out.print(column + " ");
            }

            System.out.println();
        }


        // 9. Labeled break
        System.out.println("\n9. Labeled break");

        outerLoop:
        for (int row = 1; row <= 3; row++) {

            for (int column = 1; column <= 5; column++) {

                if (row == 2 && column == 3) {
                    break outerLoop;
                }

                System.out.println(
                    "Row: " + row + ", Column: " + column
                );
            }
        }


        // 10. Labeled continue
        System.out.println("\n10. Labeled continue");

        outer:
        for (int row = 1; row <= 3; row++) {

            for (int column = 1; column <= 3; column++) {

                if (column == 2) {
                    continue outer;
                }

                System.out.println(
                    "Row: " + row + ", Column: " + column
                );
            }
        }

    }
}
