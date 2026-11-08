package operations;

public class Operators {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // 1. Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2. Assignment Operators
        int x = 10;
        x += 5;
        System.out.println("Addition Assignment: " + x);

        x -= 3;
        System.out.println("Subtraction Assignment: " + x);

        // 3. Comparison Operators
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater Than: " + (a > b));
        System.out.println("Less Than: " + (a < b));
        System.out.println("Greater or Equal: " + (a >= b));
        System.out.println("Less or Equal: " + (a <= b));

        // 4. Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("AND: " + (condition1 && condition2));
        System.out.println("OR: " + (condition1 || condition2));
        System.out.println("NOT: " + (!condition1));

        // 5. Increment and Decrement Operators
        int number = 5;

        System.out.println("Pre Increment: " + (++number));
        System.out.println("Post Increment: " + (number++));
        System.out.println("After Increment: " + number);

        System.out.println("Pre Decrement: " + (--number));
        System.out.println("Post Decrement: " + (number--));
        System.out.println("After Decrement: " + number);

        // 6. Bitwise Operators
        int p = 5;
        int q = 3;

        System.out.println("Bitwise AND: " + (p & q));
        System.out.println("Bitwise OR: " + (p | q));
        System.out.println("Bitwise XOR: " + (p ^ q));
        System.out.println("Bitwise NOT: " + (~p));

        // 7. Ternary Operator
        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println("Age Category: " + result);
    }
}