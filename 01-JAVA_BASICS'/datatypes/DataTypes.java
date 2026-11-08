package datatypes;

public class DataTypes {

    public static void main(String[] args) {

        // 1. Integer types
        byte age = 25;
        short year = 2026;
        int salary = 22000;
        long population = 8000000000L;

        // 2. Decimal types
        float temperature = 36.5f;
        double price = 1999.99;

        // 3. Character type
        char grade = 'A';

        // 4. Boolean type
        boolean isJavaFun = true;

        // 5. String (Non-primitive)
        String name = "Abhi";

        // Printing values
        System.out.println("Byte: " + age);
        System.out.println("Short: " + year);
        System.out.println("Int: " + salary);
        System.out.println("Long: " + population);
        System.out.println("Float: " + temperature);
        System.out.println("Double: " + price);
        System.out.println("Char: " + grade);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("String: " + name);
    }
}