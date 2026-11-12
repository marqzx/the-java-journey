
public class MethodOverloading {

    // 1. Different number of parameters
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 2. Different parameter data types
    static double add(double a, double b) {
        return a + b;
    }

    // 3. Different parameter order
    static void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    static void display(int age, String name) {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }

    // 4. Different combinations of parameters
    static double calculateArea(double side) {
        return side * side;
    }

    static double calculateArea(double length, double width) {
        return length * width;
    }

    // 5. Method overloading with different types
    static void printValue(int value) {
        System.out.println("Integer: " + value);
    }

    static void printValue(String value) {
        System.out.println("String: " + value);
    }

    static void printValue(boolean value) {
        System.out.println("Boolean: " + value);
    }

    // 6. Overloading with type promotion
    static void show(int number) {
        System.out.println("Integer version: " + number);
    }

    static void show(double number) {
        System.out.println("Double version: " + number);
    }

    public static void main(String[] args) {

        // Different number of parameters
        System.out.println("Addition 1: " + add(10, 20));
        System.out.println("Addition 2: " + add(10, 20, 30));

        // Different data types
        System.out.println("Decimal Addition: " + add(10.5, 20.5));

        // Different parameter order
        display("Abhiram", 24);
        display(24, "Abhiram");

        // Area calculation
        System.out.println("Square Area: " + calculateArea(5));
        System.out.println("Rectangle Area: " + calculateArea(5, 10));

        // Different parameter types
        printValue(100);
        printValue("Java");
        printValue(true);

        // Type promotion
        show(10);
        show(10.5);
        show('A'); // char can be promoted to int
    }
}
