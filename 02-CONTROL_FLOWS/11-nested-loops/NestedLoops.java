
public class NestedLoops {

    public static void main(String[] args) {

        // 1. Basic nested loop
        System.out.println("1. Basic nested loop");

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }

        }


        // 2. Print a square star pattern
        System.out.println("\n2. Square star pattern");

        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= 5; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // 3. Right-angled triangle
        System.out.println("\n3. Right-angled triangle");

        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // 4. Inverted right-angled triangle
        System.out.println("\n4. Inverted triangle");

        for (int row = 5; row >= 1; row--) {

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // 5. Number triangle
        System.out.println("\n5. Number triangle");

        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }

            System.out.println();
        }


        // 6. Repeated number triangle
        System.out.println("\n6. Repeated number triangle");

        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }

            System.out.println();
        }


        // 7. Inverted number triangle
        System.out.println("\n7. Inverted number triangle");

        for (int row = 5; row >= 1; row--) {

            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }

            System.out.println();
        }


        // 8. Pyramid pattern
        System.out.println("\n8. Pyramid pattern");

        int height = 5;

        for (int row = 1; row <= height; row++) {

            // Print leading spaces
            for (int space = 1; space <= height - row; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // 9. Multiplication grid
        System.out.println("\n9. Multiplication grid");

        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= 5; column++) {

                System.out.printf("%4d", row * column);

            }

            System.out.println();
        }


        // 10. Nested while loops
        System.out.println("\n10. Nested while loops");

        int row = 1;

        while (row <= 3) {

            int column = 1;

            while (column <= 3) {

                System.out.print("* ");
                column++;

            }

            System.out.println();
            row++;
        }


        // 11. Checkerboard pattern
        System.out.println("\n11. Checkerboard pattern");

        for (int r = 1; r <= 5; r++) {

            for (int c = 1; c <= 5; c++) {

                if ((r + c) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }

            }

            System.out.println();
        }


        // 12. Hollow square pattern
        System.out.println("\n12. Hollow square pattern");

        int size = 5;

        for (int r = 1; r <= size; r++) {

            for (int c = 1; c <= size; c++) {

                if (r == 1 || r == size || c == 1 || c == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }

    }
}
