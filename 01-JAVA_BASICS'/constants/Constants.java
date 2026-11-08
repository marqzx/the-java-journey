package constants;


public class Constants {

    public static void main(String[] args) {

        // =================================
        // 1. NORMAL VARIABLES
        // =================================

        System.out.println("===== NORMAL VARIABLES =====");

        int age = 24;

        System.out.println("Original Age: " + age);

        age = 25; // Value can be changed

        System.out.println("Updated Age: " + age);


        // =================================
        // 2. CONSTANTS USING FINAL
        // =================================

        System.out.println("\n===== CONSTANTS =====");

        final int BIRTH_YEAR = 2002;

        System.out.println("Birth Year: " + BIRTH_YEAR);

        // BIRTH_YEAR = 2003; // ERROR: Cannot reassign a final variable


        // =================================
        // 3. CONSTANTS WITH DIFFERENT DATA TYPES
        // =================================

        System.out.println("\n===== DIFFERENT DATA TYPES =====");

        final double PI = 3.14159;
        final String COUNTRY = "India";
        final boolean IS_JAVA_FUN = true;
        final char GRADE = 'A';

        System.out.println("PI: " + PI);
        System.out.println("Country: " + COUNTRY);
        System.out.println("Java is fun: " + IS_JAVA_FUN);
        System.out.println("Grade: " + GRADE);


        // =================================
        // 4. CONSTANTS IN CALCULATIONS
        // =================================

        System.out.println("\n===== CONSTANTS IN CALCULATIONS =====");

        final double TAX_RATE = 0.18;

        double productPrice = 1000;
        double taxAmount = productPrice * TAX_RATE;

        double totalPrice = productPrice + taxAmount;

        System.out.println("Product Price: " + productPrice);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Total Price: " + totalPrice);


        // =================================
        // 5. STATIC FINAL CONSTANTS
        // =================================

        System.out.println("\n===== STATIC FINAL CONSTANTS =====");

        System.out.println("Application Name: " + APP_NAME);
        System.out.println("Maximum Login Attempts: " + MAX_LOGIN_ATTEMPTS);
        System.out.println("Application Version: " + VERSION);


        // =================================
        // 6. CONSTANTS IN MATHEMATICAL FORMULA
        // =================================

        System.out.println("\n===== AREA CALCULATION =====");

        final double CIRCLE_PI = 3.14159;

        double radius = 5;

        double area = CIRCLE_PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Circle Area: " + area);


        // =================================
        // 7. CONSTANTS AND EXPRESSIONS
        // =================================

        System.out.println("\n===== CONSTANT EXPRESSIONS =====");

        final int HOURS_PER_DAY = 24;
        final int DAYS_PER_WEEK = 7;

        final int HOURS_PER_WEEK = HOURS_PER_DAY * DAYS_PER_WEEK;

        System.out.println("Hours Per Day: " + HOURS_PER_DAY);
        System.out.println("Days Per Week: " + DAYS_PER_WEEK);
        System.out.println("Hours Per Week: " + HOURS_PER_WEEK);

    }

    // Class-level constants
    public static final String APP_NAME = "Java Journey";
    public static final int MAX_LOGIN_ATTEMPTS = 3;
    public static final double VERSION = 1.0;

}
