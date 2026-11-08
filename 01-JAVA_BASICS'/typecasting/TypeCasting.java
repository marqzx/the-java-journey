package typecasting;


public class TypeCasting {

    public static void main(String[] args) {

        // =================================
        // 1. WIDENING CASTING (Automatic)
        // =================================

        System.out.println("===== WIDENING CASTING =====");

        int number = 100;
        double decimal = number;

        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimal);


        // =================================
        // 2. NARROWING CASTING (Manual)
        // =================================

        System.out.println("\n===== NARROWING CASTING =====");

        double price = 199.99;
        int convertedPrice = (int) price;

        System.out.println("Original: " + price);
        System.out.println("Converted: " + convertedPrice);


        // =================================
        // 3. PRIMITIVE TYPE CONVERSION
        // =================================

        System.out.println("\n===== PRIMITIVE CONVERSION =====");

        int age = 25;
        long longAge = age;

        float temperature = 36.5f;
        double doubleTemperature = temperature;

        System.out.println("Int to Long: " + longAge);
        System.out.println("Float to Double: " + doubleTemperature);


        // =================================
        // 4. STRING TO NUMBER CONVERSION
        // =================================

        System.out.println("\n===== STRING TO NUMBER =====");

        String numberString = "500";
        int convertedNumber = Integer.parseInt(numberString);

        String salaryString = "25000.50";
        double salary = Double.parseDouble(salaryString);

        System.out.println("String to Int: " + convertedNumber);
        System.out.println("String to Double: " + salary);


        // =================================
        // 5. NUMBER TO STRING CONVERSION
        // =================================

        System.out.println("\n===== NUMBER TO STRING =====");

        int marks = 95;
        String marksString = String.valueOf(marks);

        double amount = 1500.75;
        String amountString = String.valueOf(amount);

        System.out.println("Int to String: " + marksString);
        System.out.println("Double to String: " + amountString);


        // =================================
        // 6. CHARACTER CONVERSION
        // =================================

        System.out.println("\n===== CHARACTER CONVERSION =====");

        char letter = 'A';
        int asciiValue = letter;

        System.out.println("Character: " + letter);
        System.out.println("Numeric Unicode Value: " + asciiValue);


        // =================================
        // 7. DATA LOSS DURING CASTING
        // =================================

        System.out.println("\n===== DATA LOSS =====");

        double decimalNumber = 99.99;
        int wholeNumber = (int) decimalNumber;

        System.out.println("Before Casting: " + decimalNumber);
        System.out.println("After Casting: " + wholeNumber);


        // =================================
        // 8. BYTE OVERFLOW
        // =================================

        System.out.println("\n===== BYTE OVERFLOW =====");

        int largeNumber = 256;
        byte smallNumber = (byte) largeNumber;

        System.out.println("Original: " + largeNumber);
        System.out.println("After Casting to Byte: " + smallNumber);


        // =================================
        // 9. NEGATIVE NUMBER CASTING
        // =================================

        System.out.println("\n===== NEGATIVE CASTING =====");

        double negativeNumber = -10.99;
        int convertedNegative = (int) negativeNumber;

        System.out.println("Original: " + negativeNumber);
        System.out.println("Converted: " + convertedNegative);

    }
}
