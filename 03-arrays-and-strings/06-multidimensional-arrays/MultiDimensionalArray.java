
import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        // 1. Declare a 2D array
        System.out.println("1. Array Declaration");

        int[][] numbers;


        // 2. Initialize a 2D array
        System.out.println("\n2. Array Initialization");

        numbers = new int[3][3];

        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[0][2] = 30;

        numbers[1][0] = 40;
        numbers[1][1] = 50;
        numbers[1][2] = 60;

        numbers[2][0] = 70;
        numbers[2][1] = 80;
        numbers[2][2] = 90;

        System.out.println(Arrays.deepToString(numbers));


        // 3. Declare and initialize together
        System.out.println("\n3. Direct Initialization");

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(Arrays.deepToString(matrix));


        // 4. Access individual elements
        System.out.println("\n4. Accessing Elements");

        System.out.println(matrix[0][0]);
        System.out.println(matrix[1][2]);
        System.out.println(matrix[2][1]);


        // 5. Update an element
        System.out.println("\n5. Updating Elements");

        matrix[0][0] = 100;

        System.out.println(Arrays.deepToString(matrix));


        // 6. Find rows and columns
        System.out.println("\n6. Rows and Columns");

        System.out.println("Rows: " + matrix.length);
        System.out.println("Columns: " + matrix[0].length);


        // 7. Traverse using nested loops
        System.out.println("\n7. Matrix Traversal");

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0;
                 column < matrix[row].length;
                 column++) {

                System.out.print(matrix[row][column] + " ");

            }

            System.out.println();
        }


        // 8. Traverse using enhanced for loop
        System.out.println("\n8. Enhanced For Loop");

        for (int[] row : matrix) {

            for (int value : row) {

                System.out.print(value + " ");

            }

            System.out.println();
        }


        // 9. Calculate sum of all elements
        System.out.println("\n9. Matrix Sum");

        int sum = 0;

        for (int[] row : matrix) {

            for (int value : row) {

                sum += value;

            }
        }

        System.out.println("Total: " + sum);


        // 10. Calculate row-wise sums
        System.out.println("\n10. Row-wise Sum");

        int[][] marks = {
            {80, 90, 85},
            {70, 75, 80},
            {90, 95, 100}
        };

        for (int row = 0; row < marks.length; row++) {

            int rowSum = 0;

            for (int column = 0;
                 column < marks[row].length;
                 column++) {

                rowSum += marks[row][column];

            }

            System.out.println(
                "Row " + row + " sum: " + rowSum
            );
        }


        // 11. Calculate column-wise sums
        System.out.println("\n11. Column-wise Sum");

        for (int column = 0;
             column < marks[0].length;
             column++) {

            int columnSum = 0;

            for (int row = 0; row < marks.length; row++) {

                columnSum += marks[row][column];

            }

            System.out.println(
                "Column " + column + " sum: " + columnSum
            );
        }


        // 12. Find the largest element
        System.out.println("\n12. Largest Element");

        int largest = marks[0][0];

        for (int[] row : marks) {

            for (int value : row) {

                if (value > largest) {
                    largest = value;
                }

            }
        }

        System.out.println("Largest: " + largest);


        // 13. Matrix Addition
        System.out.println("\n13. Matrix Addition");

        int[][] first = {
            {1, 2},
            {3, 4}
        };

        int[][] second = {
            {5, 6},
            {7, 8}
        };

        int[][] addition = new int[2][2];

        for (int row = 0; row < 2; row++) {

            for (int column = 0; column < 2; column++) {

                addition[row][column] =
                    first[row][column] + second[row][column];

            }
        }

        for (int[] row : addition) {
            System.out.println(Arrays.toString(row));
        }


        // 14. Matrix Subtraction
        System.out.println("\n14. Matrix Subtraction");

        int[][] subtraction = new int[2][2];

        for (int row = 0; row < 2; row++) {

            for (int column = 0; column < 2; column++) {

                subtraction[row][column] =
                    first[row][column] - second[row][column];

            }
        }

        for (int[] row : subtraction) {
            System.out.println(Arrays.toString(row));
        }


        // 15. Matrix Multiplication
        System.out.println("\n15. Matrix Multiplication");

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] product = new int[a.length][b[0].length];

        if (a[0].length == b.length) {

            for (int row = 0; row < a.length; row++) {

                for (int column = 0;
                     column < b[0].length;
                     column++) {

                    for (int k = 0; k < b.length; k++) {

                        product[row][column] +=
                            a[row][k] * b[k][column];

                    }
                }
            }

            for (int[] row : product) {
                System.out.println(Arrays.toString(row));
            }

        } else {

            System.out.println("Matrix multiplication not possible.");

        }


        // 16. Matrix Transpose
        System.out.println("\n16. Matrix Transpose");

        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] transpose =
            new int[original[0].length][original.length];

        for (int row = 0; row < original.length; row++) {

            for (int column = 0;
                 column < original[row].length;
                 column++) {

                transpose[column][row] = original[row][column];

            }
        }

        for (int[] row : transpose) {
            System.out.println(Arrays.toString(row));
        }


        // 17. Jagged Array
        System.out.println("\n17. Jagged Array");

        int[][] jagged = new int[3][];

        jagged[0] = new int[]{10, 20};
        jagged[1] = new int[]{30, 40, 50};
        jagged[2] = new int[]{60};

        for (int row = 0; row < jagged.length; row++) {

            for (int column = 0;
                 column < jagged[row].length;
                 column++) {

                System.out.print(jagged[row][column] + " ");

            }

            System.out.println();
        }


        // 18. Three-dimensional array
        System.out.println("\n18. Three-dimensional Array");

        int[][][] cube = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        System.out.println("Value: " + cube[1][0][1]);

        System.out.println("Number of layers: " + cube.length);

    }
}
