
import java.util.Objects;
import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {

        // 1. Comparing using ==
        String first = "Java";
        String second = "Java";
        String third = new String("Java");

        System.out.println("1. Reference Comparison");
        System.out.println(first == second); // true
        System.out.println(first == third);  // false

        // 2. Comparing using equals()
        System.out.println("\n2. Content Comparison");
        System.out.println(first.equals(second)); // true
        System.out.println(first.equals(third));  // true

        // 3. Comparing using equalsIgnoreCase()
        System.out.println("\n3. Case-Insensitive Comparison");
        String language1 = "JAVA";
        String language2 = "java";

        System.out.println(language1.equals(language2)); 
        // false

        System.out.println(language1.equalsIgnoreCase(language2));
        // true

        // 4. Comparing using compareTo()
        System.out.println("\n4. Lexicographical Comparison");

        String a = "Apple";
        String b = "Banana";

        System.out.println(a.compareTo(b)); // Negative
        System.out.println(b.compareTo(a)); // Positive
        System.out.println(a.compareTo("Apple")); // 0

        // 5. String Pool and intern()
        System.out.println("\n5. String Pool");

        String poolString = "Hello";
        String newString = new String("Hello");
        String internedString = newString.intern();

        System.out.println(poolString == newString); 
        // false

        System.out.println(poolString == internedString);
        // true

        // 6. Null-safe comparison
        System.out.println("\n6. Null-Safe Comparison");

        String value1 = null;
        String value2 = "Java";

        System.out.println(Objects.equals(value1, value2));
        // false

        // 7. Comparing user input
        System.out.println("\n7. User Input Comparison");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your programming language: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Java")) {
            System.out.println("Correct! You entered Java.");
        } else {
            System.out.println("You entered a different language.");
        }

        scanner.close();
    }
}
