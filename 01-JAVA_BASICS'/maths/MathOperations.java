package maths;


public class MathOperations {

    public static void main(String[] args) {

        // =================================
        // 1. MATH.MAX()
        // =================================

        System.out.println("===== MAXIMUM VALUE =====");

        int a = 100;
        int b = 200;

        System.out.println("Maximum: " + Math.max(a, b));


        // =================================
        // 2. MATH.MIN()
        // =================================

        System.out.println("\n===== MINIMUM VALUE =====");

        System.out.println("Minimum: " + Math.min(a, b));


        // =================================
        // 3. MATH.SQRT()
        // =================================

        System.out.println("\n===== SQUARE ROOT =====");

        double number = 64;

        System.out.println("Square Root: " + Math.sqrt(number));


        // =================================
        // 4. MATH.POW()
        // =================================

        System.out.println("\n===== POWER =====");

        System.out.println("2 Power 3: " + Math.pow(2, 3));
        System.out.println("5 Power 2: " + Math.pow(5, 2));


        // =================================
        // 5. MATH.ABS()
        // =================================

        System.out.println("\n===== ABSOLUTE VALUE =====");

        int negativeNumber = -50;

        System.out.println("Absolute Value: " + Math.abs(negativeNumber));


        // =================================
        // 6. MATH.ROUND()
        // =================================

        System.out.println("\n===== ROUNDING =====");

        double decimal1 = 10.4;
        double decimal2 = 10.6;

        System.out.println("Round 10.4: " + Math.round(decimal1));
        System.out.println("Round 10.6: " + Math.round(decimal2));


        // =================================
        // 7. MATH.CEIL()
        // =================================

        System.out.println("\n===== CEILING =====");

        System.out.println("Ceiling 10.2: " + Math.ceil(10.2));
        System.out.println("Ceiling 10.8: " + Math.ceil(10.8));


        // =================================
        // 8. MATH.FLOOR()
        // =================================

        System.out.println("\n===== FLOOR =====");

        System.out.println("Floor 10.2: " + Math.floor(10.2));
        System.out.println("Floor 10.8: " + Math.floor(10.8));


        // =================================
        // 9. MATH.RANDOM()
        // =================================

        System.out.println("\n===== RANDOM NUMBER =====");

        double randomNumber = Math.random();

        System.out.println("Random Decimal: " + randomNumber);

        // Random integer between 1 and 100
        int randomInteger = (int) (Math.random() * 100) + 1;

        System.out.println("Random Integer: " + randomInteger);


        // =================================
        // 10. MATH.SIN(), COS(), TAN()
        // =================================

        System.out.println("\n===== TRIGONOMETRY =====");

        double angle = 30;

        // Convert degrees into radians
        double radians = Math.toRadians(angle);

        System.out.println("Sin 30: " + Math.sin(radians));
        System.out.println("Cos 30: " + Math.cos(radians));
        System.out.println("Tan 30: " + Math.tan(radians));


        // =================================
        // 11. MATH.LOG()
        // =================================

        System.out.println("\n===== LOGARITHM =====");

        System.out.println("Natural Log of 10: " + Math.log(10));
        System.out.println("Base 10 Log of 100: " + Math.log10(100));


        // =================================
        // 12. MATH.CONSTANTS
        // =================================

        System.out.println("\n===== MATH CONSTANTS =====");

        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);


        // =================================
        // 13. MATH.CBRT()
        // =================================

        System.out.println("\n===== CUBE ROOT =====");

        System.out.println("Cube Root of 27: " + Math.cbrt(27));


        // =================================
        // 14. MATH.SIGNUM()
        // =================================

        System.out.println("\n===== SIGNUM =====");

        System.out.println("Positive: " + Math.signum(25));
        System.out.println("Negative: " + Math.signum(-25));
        System.out.println("Zero: " + Math.signum(0));


        // =================================
        // 15. MATH.HYPOT()
        // =================================

        System.out.println("\n===== HYPOTENUSE =====");

        double sideA = 3;
        double sideB = 4;

        System.out.println("Hypotenuse: " + Math.hypot(sideA, sideB));

    }
}
