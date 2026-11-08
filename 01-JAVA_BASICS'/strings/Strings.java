package strings;


public class Strings {

    public static void main(String[] args) {

        // =================================
        // 1. STRING DECLARATION
        // =================================

        System.out.println("===== STRING DECLARATION =====");

        String name = "Abhi";
        String city = new String("Kannur");

        System.out.println("Name: " + name);
        System.out.println("City: " + city);


        // =================================
        // 2. STRING CONCATENATION
        // =================================

        System.out.println("\n===== STRING CONCATENATION =====");

        String firstName = "Abhi";
        String lastName = "T";

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);


        // =================================
        // 3. STRING LENGTH
        // =================================

        System.out.println("\n===== STRING LENGTH =====");

        String message = "Hello Java";

        System.out.println("Length: " + message.length());


        // =================================
        // 4. CHAR AT
        // =================================

        System.out.println("\n===== CHAR AT =====");

        String language = "Java";

        System.out.println("First Character: " + language.charAt(0));
        System.out.println("Second Character: " + language.charAt(1));


        // =================================
        // 5. STRING COMPARISON
        // =================================

        System.out.println("\n===== STRING COMPARISON =====");

        String text1 = "Java";
        String text2 = "Java";
        String text3 = "Python";

        System.out.println(text1.equals(text2));
        System.out.println(text1.equals(text3));

        System.out.println("Ignore Case: " + "java".equalsIgnoreCase("JAVA"));


        // =================================
        // 6. STRING CASE CONVERSION
        // =================================

        System.out.println("\n===== CASE CONVERSION =====");

        String programming = "Java Programming";

        System.out.println(programming.toUpperCase());
        System.out.println(programming.toLowerCase());


        // =================================
        // 7. STRING CONTAINS
        // =================================

        System.out.println("\n===== CONTAINS =====");

        String sentence = "I am learning Java Programming";

        System.out.println(sentence.contains("Java"));
        System.out.println(sentence.contains("Python"));


        // =================================
        // 8. STRING REPLACEMENT
        // =================================

        System.out.println("\n===== REPLACEMENT =====");

        String oldText = "I like Python";

        String newText = oldText.replace("Python", "Java");

        System.out.println(newText);


        // =================================
        // 9. STRING SUBSTRING
        // =================================

        System.out.println("\n===== SUBSTRING =====");

        String word = "Programming";

        System.out.println(word.substring(0, 7));
        System.out.println(word.substring(7));


        // =================================
        // 10. STRING TRIM
        // =================================

        System.out.println("\n===== TRIM =====");

        String username = "   Abhi   ";

        System.out.println("Original: [" + username + "]");
        System.out.println("Trimmed: [" + username.trim() + "]");


        // =================================
        // 11. STARTS WITH / ENDS WITH
        // =================================

        System.out.println("\n===== STARTS WITH / ENDS WITH =====");

        String fileName = "document.pdf";

        System.out.println(fileName.startsWith("doc"));
        System.out.println(fileName.endsWith(".pdf"));


        // =================================
        // 12. STRING EMPTY CHECK
        // =================================

        System.out.println("\n===== EMPTY CHECK =====");

        String emptyText = "";
        String blankText = "   ";

        System.out.println(emptyText.isEmpty());
        System.out.println(blankText.isEmpty());
        System.out.println(blankText.isBlank());


        // =================================
        // 13. STRING INDEX OF
        // =================================

        System.out.println("\n===== INDEX OF =====");

        String programmingLanguage = "Java Programming";

        System.out.println(programmingLanguage.indexOf("Programming"));
        System.out.println(programmingLanguage.indexOf("Java"));


        // =================================
        // 14. STRING IMMUTABILITY
        // =================================

        System.out.println("\n===== STRING IMMUTABILITY =====");

        String original = "Hello";

        original.concat(" World");

        System.out.println("Original: " + original);

        original = original.concat(" World");

        System.out.println("Updated: " + original);


        // =================================
        // 15. STRING FORMATTING
        // =================================

        System.out.println("\n===== STRING FORMATTING =====");

        String user = "Abhi";
        int age = 24;
        double salary = 22000.50;

        String profile = String.format(
            "Name: %s | Age: %d | Salary: %.2f",
            user, age, salary
        );

        System.out.println(profile);


        // =================================
        // 16. STRING JOIN
        // =================================

        System.out.println("\n===== STRING JOIN =====");

        String joined = String.join(" - ", "Java", "Python", "JavaScript");

        System.out.println(joined);


        // =================================
        // 17. STRING REPEAT
        // =================================

        System.out.println("\n===== STRING REPEAT =====");

        String repeatText = "Java ";

        System.out.println(repeatText.repeat(3));

    }
}
