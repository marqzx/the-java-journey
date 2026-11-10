import java.util.Arrays;
import java.util.Scanner;

public class ArrayAccess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Accessing individual elements
        System.out.println("1. Accessing Elements");

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First: " + numbers[0]);
        System.out.println("Third: " + numbers[2]);
        System.out.println("Last: " + numbers[numbers.length - 1]);


        // 2. Updating an element
        System.out.println("\n2. Updating Elements");

        numbers[0] = 100;

        System.out.println(Arrays.toString(numbers));


        // 3. Updating multiple elements
        System.out.println("\n3. Updating Multiple Elements");

        numbers[1] = 200;
        numbers[2] = 300;
        numbers[3] = 400;

        System.out.println(Arrays.toString(numbers));


        // 4. Traversing using a for loop
        System.out.println("\n4. Array Traversal");

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(
                "Index " + i + " = " + numbers[i]
            );

        }


        // 5. Traversing using enhanced for loop
        System.out.println("\n5. Enhanced For Loop");

        for (int number : numbers) {
            System.out.println(number);
        }


        // 6. Updating every element
        System.out.println("\n6. Updating Every Element");

        int[] values = {1, 2, 3, 4, 5};

        for (int i = 0; i < values.length; i++) {

            values[i] = values[i] * 2;

        }

        System.out.println(Arrays.toString(values));


        // 7. Search for a specific element
        System.out.println("\n7. Searching an Element");

        int[] searchArray = {15, 25, 35, 45, 55};

        int target = 35;
        int foundIndex = -1;

        for (int i = 0; i < searchArray.length; i++) {

            if (searchArray[i] == target) {

                foundIndex = i;
                break;

            }

        }

        if (foundIndex != -1) {
            System.out.println("Found at index: " + foundIndex);
        } else {
            System.out.println("Element not found.");
        }


        // 8. Count occurrences of an element
        System.out.println("\n8. Counting Occurrences");

        int[] duplicateNumbers = {10, 20, 10, 30, 10, 40};

        int searchValue = 10;
        int count = 0;

        for (int number : duplicateNumbers) {

            if (number == searchValue) {
                count++;
            }

        }

        System.out.println(searchValue + " appears " + count + " times.");


        // 9. Replace all occurrences
        System.out.println("\n9. Replacing All Occurrences");

        int[] replaceArray = {5, 10, 5, 20, 5, 30};

        for (int i = 0; i < replaceArray.length; i++) {

            if (replaceArray[i] == 5) {
                replaceArray[i] = 99;
            }

        }

        System.out.println(Arrays.toString(replaceArray));


        // 10. Swap two elements
        System.out.println("\n10. Swapping Elements");

        int[] swapArray = {10, 20, 30, 40};

        int temp = swapArray[0];

        swapArray[0] = swapArray[3];
        swapArray[3] = temp;

        System.out.println(Arrays.toString(swapArray));


        // 11. Accept and update values using user input
        System.out.println("\n11. User Input");

        int[] userNumbers = new int[5];

        for (int i = 0; i < userNumbers.length; i++) {

            System.out.print("Enter value " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextInt();

        }

        System.out.println("Original array: "
                + Arrays.toString(userNumbers));

        System.out.print("Enter index to update (0-4): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < userNumbers.length) {

            System.out.print("Enter new value: ");
            userNumbers[index] = scanner.nextInt();

            System.out.println("Updated array: "
                    + Arrays.toString(userNumbers));

        } else {

            System.out.println("Invalid index.");

        }


        // 12. Find all elements greater than a given value
        System.out.println("\n12. Conditional Access");

        int[] scores = {45, 78, 90, 32, 88, 65};

        int minimumScore = 70;

        for (int score : scores) {

            if (score > minimumScore) {
                System.out.println(score);
            }

        }


        scanner.close();
    }
}
