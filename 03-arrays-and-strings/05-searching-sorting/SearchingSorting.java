
import java.util.Arrays;

public class SearchingSorting {

    public static void main(String[] args) {

        // =====================================
        // 1. LINEAR SEARCH
        // =====================================

        System.out.println("1. LINEAR SEARCH");

        int[] numbers = {10, 20, 30, 40, 50};

        int target = 30;
        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Found at index: " + foundIndex);
        } else {
            System.out.println("Element not found.");
        }


        // =====================================
        // 2. LINEAR SEARCH - ALL OCCURRENCES
        // =====================================

        System.out.println("\n2. ALL OCCURRENCES");

        int[] duplicateNumbers = {10, 20, 10, 30, 10, 40};

        int searchValue = 10;
        int count = 0;

        for (int i = 0; i < duplicateNumbers.length; i++) {

            if (duplicateNumbers[i] == searchValue) {
                System.out.println("Found at index: " + i);
                count++;
            }
        }

        System.out.println("Total occurrences: " + count);


        // =====================================
        // 3. BINARY SEARCH
        // =====================================

        System.out.println("\n3. BINARY SEARCH");

        // Binary Search requires sorted data.
        int[] sortedNumbers = {10, 20, 30, 40, 50, 60, 70};

        int binaryTarget = 60;

        int left = 0;
        int right = sortedNumbers.length - 1;

        int binaryResult = -1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (sortedNumbers[middle] == binaryTarget) {

                binaryResult = middle;
                break;

            } else if (sortedNumbers[middle] < binaryTarget) {

                left = middle + 1;

            } else {

                right = middle - 1;

            }
        }

        if (binaryResult != -1) {
            System.out.println("Found at index: " + binaryResult);
        } else {
            System.out.println("Element not found.");
        }


        // =====================================
        // 4. BUBBLE SORT - ASCENDING
        // =====================================

        System.out.println("\n4. BUBBLE SORT");

        int[] bubbleArray = {5, 3, 8, 1, 2};

        for (int i = 0; i < bubbleArray.length - 1; i++) {

            for (int j = 0; j < bubbleArray.length - 1 - i; j++) {

                if (bubbleArray[j] > bubbleArray[j + 1]) {

                    int temp = bubbleArray[j];

                    bubbleArray[j] = bubbleArray[j + 1];

                    bubbleArray[j + 1] = temp;
                }
            }
        }

        System.out.println("Ascending: "
                + Arrays.toString(bubbleArray));


        // =====================================
        // 5. BUBBLE SORT - DESCENDING
        // =====================================

        System.out.println("\n5. BUBBLE SORT DESCENDING");

        int[] descendingArray = {5, 3, 8, 1, 2};

        for (int i = 0; i < descendingArray.length - 1; i++) {

            for (int j = 0; j < descendingArray.length - 1 - i; j++) {

                if (descendingArray[j] < descendingArray[j + 1]) {

                    int temp = descendingArray[j];

                    descendingArray[j] = descendingArray[j + 1];

                    descendingArray[j + 1] = temp;
                }
            }
        }

        System.out.println("Descending: "
                + Arrays.toString(descendingArray));


        // =====================================
        // 6. SELECTION SORT
        // =====================================

        System.out.println("\n6. SELECTION SORT");

        int[] selectionArray = {64, 25, 12, 22, 11};

        for (int i = 0; i < selectionArray.length - 1; i++) {

            int minimumIndex = i;

            for (int j = i + 1; j < selectionArray.length; j++) {

                if (selectionArray[j] < selectionArray[minimumIndex]) {

                    minimumIndex = j;
                }
            }

            int temp = selectionArray[i];

            selectionArray[i] = selectionArray[minimumIndex];

            selectionArray[minimumIndex] = temp;
        }

        System.out.println("Sorted: "
                + Arrays.toString(selectionArray));


        // =====================================
        // 7. INSERTION SORT
        // =====================================

        System.out.println("\n7. INSERTION SORT");

        int[] insertionArray = {12, 11, 13, 5, 6};

        for (int i = 1; i < insertionArray.length; i++) {

            int key = insertionArray[i];

            int j = i - 1;

            while (j >= 0 && insertionArray[j] > key) {

                insertionArray[j + 1] = insertionArray[j];

                j--;
            }

            insertionArray[j + 1] = key;
        }

        System.out.println("Sorted: "
                + Arrays.toString(insertionArray));


        // =====================================
        // 8. SORT USING ARRAYS.SORT()
        // =====================================

        System.out.println("\n8. BUILT-IN SORTING");

        int[] builtInArray = {50, 10, 40, 20, 30};

        Arrays.sort(builtInArray);

        System.out.println("Sorted: "
                + Arrays.toString(builtInArray));


        // =====================================
        // 9. REVERSE A SORTED ARRAY
        // =====================================

        System.out.println("\n9. REVERSE SORTED ARRAY");

        int[] reverseArray = {10, 20, 30, 40, 50};

        int start = 0;
        int end = reverseArray.length - 1;

        while (start < end) {

            int temp = reverseArray[start];

            reverseArray[start] = reverseArray[end];

            reverseArray[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed: "
                + Arrays.toString(reverseArray));


        // =====================================
        // 10. SEARCH AFTER SORTING
        // =====================================

        System.out.println("\n10. SORT AND SEARCH");

        int[] data = {45, 12, 78, 23, 56, 9};

        Arrays.sort(data);

        System.out.println("Sorted data: "
                + Arrays.toString(data));

        int searchTarget = 56;

        int result = Arrays.binarySearch(data, searchTarget);

        if (result >= 0) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

    }
}
