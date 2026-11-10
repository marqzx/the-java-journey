
import java.util.Arrays;

public class ArrayTraversal {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // 1. Forward traversal using for loop
        System.out.println("1. Forward Traversal");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        // 2. Reverse traversal using for loop
        System.out.println("\n2. Reverse Traversal");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }


        // 3. Traversal using enhanced for loop
        System.out.println("\n3. Enhanced For Loop");

        for (int number : numbers) {
            System.out.println(number);
        }


        // 4. Traversal using while loop
        System.out.println("\n4. While Loop");

        int i = 0;

        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }


        // 5. Traversal using do-while loop
        System.out.println("\n5. Do-While Loop");

        int j = 0;

        if (numbers.length > 0) {
            do {
                System.out.println(numbers[j]);
                j++;
            } while (j < numbers.length);
        }


        // 6. Calculate sum during traversal
        System.out.println("\n6. Sum of Elements");

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);


        // 7. Calculate average during traversal
        System.out.println("\n7. Average of Elements");

        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);


        // 8. Find maximum element
        System.out.println("\n8. Maximum Element");

        int maximum = numbers[0];

        for (int k = 1; k < numbers.length; k++) {

            if (numbers[k] > maximum) {
                maximum = numbers[k];
            }
        }

        System.out.println("Maximum: " + maximum);


        // 9. Find minimum element
        System.out.println("\n9. Minimum Element");

        int minimum = numbers[0];

        for (int k = 1; k < numbers.length; k++) {

            if (numbers[k] < minimum) {
                minimum = numbers[k];
            }
        }

        System.out.println("Minimum: " + minimum);


        // 10. Count even and odd numbers
        System.out.println("\n10. Even and Odd Count");

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);


        // 11. Print only numbers greater than 25
        System.out.println("\n11. Conditional Traversal");

        for (int number : numbers) {

            if (number > 25) {
                System.out.println(number);
            }
        }


        // 12. Traverse an array using a step of 2
        System.out.println("\n12. Traverse Every Second Element");

        for (int k = 0; k < numbers.length; k += 2) {
            System.out.println(numbers[k]);
        }


        // 13. Find the index of a target element
        System.out.println("\n13. Find Element Index");

        int target = 30;
        int foundIndex = -1;

        for (int k = 0; k < numbers.length; k++) {

            if (numbers[k] == target) {
                foundIndex = k;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Found at index: " + foundIndex);
        } else {
            System.out.println("Element not found.");
        }


        // 14. Traverse a String array
        System.out.println("\n14. String Array Traversal");

        String[] names = {"Abhi", "Rahul", "Arun", "Vishnu"};

        for (int k = 0; k < names.length; k++) {
            System.out.println(names[k]);
        }


        // 15. Modify elements during traversal
        System.out.println("\n15. Modify During Traversal");

        int[] values = {1, 2, 3, 4, 5};

        for (int k = 0; k < values.length; k++) {
            values[k] *= 2;
        }

        System.out.println(Arrays.toString(values));


        // 16. Traverse two arrays simultaneously
        System.out.println("\n16. Traverse Two Arrays");

        int[] first = {10, 20, 30};
        int[] second = {1, 2, 3};

        for (int k = 0; k < first.length; k++) {

            System.out.println(
                first[k] + " + " + second[k]
                + " = " + (first[k] + second[k])
            );
        }


        // 17. Find the first negative number
        System.out.println("\n17. Find First Negative Number");

        int[] data = {10, 20, -5, 30, -10};

        for (int number : data) {

            if (number < 0) {
                System.out.println("First negative: " + number);
                break;
            }
        }


        // 18. Traverse an empty array safely
        System.out.println("\n18. Empty Array");

        int[] empty = {};

        for (int k = 0; k < empty.length; k++) {
            System.out.println(empty[k]);
        }

        System.out.println("Traversal completed.");

    }
}
