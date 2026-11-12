
import java.util.Arrays;

public class MethodParameters {

    // 1. Single parameter
    static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    // 2. Multiple parameters
    static int add(int a, int b) {
        return a + b;
    }

    // 3. Different parameter data types
    static void displayEmployee(String name, int age, double salary) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    // 4. Passing an array
    static void displayNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // 5. Calculating array sum
    static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    // 6. Modifying an array
    static void updateFirstElement(int[] numbers) {
        if (numbers.length > 0) {
            numbers[0] = 999;
        }
    }

    // 7. Passing an object
    static void displayStudent(Student student) {
        System.out.println("Student: " + student.name);
        System.out.println("Marks: " + student.marks);
    }

    // 8. Modifying an object's field
    static void updateStudentMarks(Student student, int marks) {
        student.marks = marks;
    }

    // 9. Variable-length arguments (varargs)
    static int calculateTotal(int... numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    // 10. Varargs with other parameters
    static void printDetails(String title, int... values) {
        System.out.println(title);

        for (int value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {

        // Single parameter
        greet("Abhiram");

        // Multiple parameters
        System.out.println("Addition: " + add(10, 20));

        // Different data types
        displayEmployee("Abhiram", 24, 25000.50);

        // Passing an array
        int[] numbers = {10, 20, 30, 40, 50};

        displayNumbers(numbers);

        System.out.println("Array Sum: " + calculateSum(numbers));

        // Modifying an array
        updateFirstElement(numbers);

        System.out.println("Updated Array: " + Arrays.toString(numbers));

        // Passing an object
        Student student = new Student("Rahul", 85);

        displayStudent(student);

        updateStudentMarks(student, 95);

        System.out.println("Updated Marks: " + student.marks);

        // Varargs
        System.out.println("Total 1: " + calculateTotal(10, 20));
        System.out.println("Total 2: " + calculateTotal(10, 20, 30, 40));
        System.out.println("Total 3: " + calculateTotal());

        // Varargs with another parameter
        printDetails("Student Marks", 80, 90, 95);
    }
}

// Student class used for the object parameter example
class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
