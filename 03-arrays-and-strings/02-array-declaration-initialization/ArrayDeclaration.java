
import java.util.Scanner;
import java.util.Arrays;

public class ArrayDeclaration {

    public static void main(String[] args) {

        // 1. Declaration
        System.out.println("1. Array Declaration");

        int[] numbers;


        // 2. Declaration and memory allocation
        System.out.println("\n2. Memory Allocation");

        numbers = new int[5];

        System.out.println("Array length: " + numbers.length);


        // 3. Assign values individually
        System.out.println("\n3. Assigning Values");

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println(Arrays.toString(numbers));


        // 4. Declaration and initialization together
        System.out.println("\n4. Array Initializer");

        int[] marks = {85, 90, 78, 92, 88};

        System.out.println(Arrays.toString(marks));


        // 5. Using the new keyword with values
        System.out.println("\n5. Using new with values");

        int[] ages = new int[]{21, 22, 23, 24};

        System.out.println(Arrays.toString(ages));


        // 6. Different data types
        System.out.println("\n6. Different Array Types");

        double[] prices = {99.50, 150.75, 200.00};

        String[] names = {"Abhi", "Rahul", "Arun"};

        char[] grades = {'A', 'B', 'C'};

        boolean[] results = {true, false, true};

        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(grades));
        System.out.println(Arrays.toString(results));


        // 7. Default initialization
        System.out.println("\n7. Default Values");

        int[] defaultNumbers = new int[4];

        double[] defaultPrices = new double[4];

        boolean[] defaultResults = new boolean[4];

        String[] defaultNames = new String[4];

        System.out.println(Arrays.toString(defaultNumbers));
        System.out.println(Arrays.toString(defaultPrices));
        System.out.println(Arrays.toString(defaultResults));
        System.out.println(Arrays.toString(defaultNames));


        // 8. Dynamic array size using user input
        System.out.println("\n8. Dynamic Array Size");

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to store? ");
        int size = scanner.nextInt();

        if (size <= 0) {

            System.out.println("Array size must be positive.");

        } else {

            int[] userNumbers = new int[size];

            for (int i = 0; i < userNumbers.length; i++) {

                System.out.print("Enter number " + (i + 1) + ": ");
                userNumbers[i] = scanner.nextInt();

            }

            System.out.println("Your array: "
                    + Arrays.toString(userNumbers));
        }


        // 9. Array reference assignment
        System.out.println("\n9. Array References");

        int[] firstArray = {10, 20, 30};

        int[] secondArray = firstArray;

        secondArray[0] = 100;

        System.out.println("First array: "
                + Arrays.toString(firstArray));

        System.out.println("Second array: "
                + Arrays.toString(secondArray));


        // 10. Creating an independent copy
        System.out.println("\n10. Independent Array Copy");

        int[] original = {10, 20, 30};

        int[] copied = Arrays.copyOf(original, original.length);

        copied[0] = 999;

        System.out.println("Original: "
                + Arrays.toString(original));

        System.out.println("Copied: "
                + Arrays.toString(copied));


        // 11. Creating an array with a fixed default value
        System.out.println("\n11. Filling an Array");

        int[] scores = new int[5];

        Arrays.fill(scores, 100);

        System.out.println(Arrays.toString(scores));


        // 12. Creating an array with zero elements
        System.out.println("\n12. Empty Array");

        int[] emptyArray = new int[0];

        System.out.println("Length: " + emptyArray.length);

        System.out.println(Arrays.toString(emptyArray));


        scanner.close();
    }
}
