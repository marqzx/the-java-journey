
public class IntroductionToArrays {

    public static void main(String[] args) {

        // 1. Declare an array
        System.out.println("1. Array declaration");

        int[] numbers;


        // 2. Initialize an array
        System.out.println("\n2. Array initialization");

        numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;


        // 3. Declare and initialize together
        System.out.println("\n3. Array declaration and initialization");

        int[] marks = {85, 90, 78, 92, 88};


        // 4. Access individual elements
        System.out.println("\n4. Accessing array elements");

        System.out.println("First mark: " + marks[0]);
        System.out.println("Second mark: " + marks[1]);
        System.out.println("Third mark: " + marks[2]);


        // 5. Update an array element
        System.out.println("\n5. Updating array elements");

        marks[2] = 95;

        System.out.println("Updated third mark: " + marks[2]);


        // 6. Find array length
        System.out.println("\n6. Array length");

        System.out.println("Number of marks: " + marks.length);


        // 7. Print all elements using a for loop
        System.out.println("\n7. Array traversal using for loop");

        for (int i = 0; i < marks.length; i++) {

            System.out.println("Index " + i + ": " + marks[i]);

        }


        // 8. Print all elements using enhanced for loop
        System.out.println("\n8. Enhanced for loop");

        for (int mark : marks) {

            System.out.println(mark);

        }


        // 9. Calculate sum of array elements
        System.out.println("\n9. Sum of array elements");

        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        System.out.println("Total: " + sum);


        // 10. Calculate average
        System.out.println("\n10. Average of marks");

        double average = (double) sum / marks.length;

        System.out.println("Average: " + average);


        // 11. Find the largest element
        System.out.println("\n11. Largest element");

        int largest = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] > largest) {
                largest = marks[i];
            }

        }

        System.out.println("Largest mark: " + largest);


        // 12. Find the smallest element
        System.out.println("\n12. Smallest element");

        int smallest = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] < smallest) {
                smallest = marks[i];
            }

        }

        System.out.println("Smallest mark: " + smallest);


        // 13. Reverse traversal
        System.out.println("\n13. Reverse traversal");

        for (int i = marks.length - 1; i >= 0; i--) {

            System.out.println(marks[i]);

        }


        // 14. Different data types of arrays
        System.out.println("\n14. Different array types");

        double[] prices = {99.50, 150.75, 200.00};

        char[] grades = {'A', 'B', 'C'};

        String[] names = {"Abhi", "Rahul", "Arun"};

        boolean[] attendance = {true, false, true};

        System.out.println("Price: " + prices[0]);
        System.out.println("Grade: " + grades[0]);
        System.out.println("Name: " + names[0]);
        System.out.println("Attendance: " + attendance[0]);


        // 15. Default values of an integer array
        System.out.println("\n15. Default array values");

        int[] defaultValues = new int[5];

        for (int value : defaultValues) {
            System.out.println(value);
        }

    }
}
