package OutputFormatting;


public class OutputFormatting {

    public static void main(String[] args) {

        // =================================
        // 1. PRINT()
        // =================================

        System.out.println("===== PRINT =====");

        // Prints without moving to a new line
        System.out.print("Hello ");
        System.out.print("Java ");
        System.out.print("Developer");


        // =================================
        // 2. PRINTLN()
        // =================================

        System.out.println("\n\n===== PRINTLN =====");

        // Prints and moves to a new line
        System.out.println("Hello Java");
        System.out.println("Welcome to Java Programming");


        // =================================
        // 3. PRINTF()
        // =================================

        System.out.println("\n===== PRINTF =====");

        String name = "Abhi";
        int age = 24;
        double salary = 22000.50;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Salary: %.2f%n", salary);


        // =================================
        // 4. FORMAT SPECIFIERS
        // =================================

        System.out.println("\n===== FORMAT SPECIFIERS =====");

        int number = 100;
        double price = 99.99;
        char grade = 'A';
        boolean isPassed = true;
        String language = "Java";

        System.out.printf("Integer: %d%n", number);
        System.out.printf("Decimal: %f%n", price);
        System.out.printf("Character: %c%n", grade);
        System.out.printf("Boolean: %b%n", isPassed);
        System.out.printf("String: %s%n", language);


        // =================================
        // 5. DECIMAL PRECISION
        // =================================

        System.out.println("\n===== DECIMAL PRECISION =====");

        double value = 123.456789;

        System.out.printf("Default: %f%n", value);
        System.out.printf("2 Decimal Places: %.2f%n", value);
        System.out.printf("3 Decimal Places: %.3f%n", value);
        System.out.printf("4 Decimal Places: %.4f%n", value);


        // =================================
        // 6. WIDTH FORMATTING
        // =================================

        System.out.println("\n===== WIDTH FORMATTING =====");

        int a = 10;
        int b = 200;
        int c = 3000;

        System.out.printf("%10d%n", a);
        System.out.printf("%10d%n", b);
        System.out.printf("%10d%n", c);


        // =================================
        // 7. LEFT ALIGNMENT
        // =================================

        System.out.println("\n===== LEFT ALIGNMENT =====");

        System.out.printf("%-15s | %10d%n", "Java", 100);
        System.out.printf("%-15s | %10d%n", "Python", 200);
        System.out.printf("%-15s | %10d%n", "JavaScript", 300);


        // =================================
        // 8. ZERO PADDING
        // =================================

        System.out.println("\n===== ZERO PADDING =====");

        int id = 42;

        System.out.printf("ID: %05d%n", id);


        // =================================
        // 9. ESCAPE SEQUENCES
        // =================================

        System.out.println("\n===== ESCAPE SEQUENCES =====");

        System.out.println("Hello\nWorld");
        System.out.println("Java\tProgramming");
        System.out.println("He said: \"Hello Java\"");
        System.out.println("File Path: C:\\Java\\Projects");
        System.out.println("First Line\rSecond Line");


        // =================================
        // 10. FORMATTED TABLE
        // =================================

        System.out.println("\n===== STUDENT TABLE =====");

        System.out.printf("%-15s %-10s %-10s%n", "NAME", "AGE", "MARKS");

        System.out.println("--------------------------------------");

        System.out.printf("%-15s %-10d %-10.2f%n", "Abhi", 24, 85.50);
        System.out.printf("%-15s %-10d %-10.2f%n", "Arun", 22, 90.75);
        System.out.printf("%-15s %-10d %-10.2f%n", "Rahul", 23, 78.25);


        // =================================
        // 11. STRING FORMAT
        // =================================

        System.out.println("\n===== STRING FORMAT =====");

        String product = "Laptop";
        double productPrice = 55000.50;

        String formattedText = String.format(
            "Product: %s | Price: ₹%.2f",
            product,
            productPrice
        );

        System.out.println(formattedText);


        // =================================
        // 12. PERCENTAGE SYMBOL
        // =================================

        System.out.println("\n===== PERCENTAGE =====");

        double discount = 15.5;

        System.out.printf("Discount: %.1f%%%n", discount);


        // =================================
        // 13. PLUS SIGN FORMATTING
        // =================================

        System.out.println("\n===== SIGN FORMATTING =====");

        System.out.printf("%+d%n", 100);
        System.out.printf("%+d%n", -100);


        // =================================
        // 14. THOUSANDS SEPARATOR
        // =================================

        System.out.println("\n===== THOUSANDS SEPARATOR =====");

        int population = 1000000;

        System.out.printf("%,d%n", population);


        // =================================
        // 15. COMBINED FORMATTING
        // =================================

        System.out.println("\n===== COMBINED FORMATTING =====");

        String employee = "Abhi";
        int employeeId = 101;
        double employeeSalary = 35000.75;

        System.out.printf(
            "Employee: %-10s | ID: %05d | Salary: ₹%,.2f%n",
            employee,
            employeeId,
            employeeSalary
        );

    }
}
