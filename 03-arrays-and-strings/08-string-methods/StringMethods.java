
import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String text = "Java Programming";

        // 1. length()
        System.out.println("1. LENGTH");

        System.out.println(text.length());


        // 2. charAt()
        System.out.println("\n2. CHAR AT");

        System.out.println(text.charAt(0));
        System.out.println(text.charAt(5));


        // 3. substring()
        System.out.println("\n3. SUBSTRING");

        System.out.println(text.substring(5));
        System.out.println(text.substring(0, 4));


        // 4. indexOf()
        System.out.println("\n4. INDEX OF");

        System.out.println(text.indexOf("Programming"));
        System.out.println(text.indexOf("Java"));
        System.out.println(text.indexOf("Python"));


        // 5. lastIndexOf()
        System.out.println("\n5. LAST INDEX OF");

        String repeated = "Java is great. Java is powerful.";

        System.out.println(repeated.lastIndexOf("Java"));


        // 6. toUpperCase()
        System.out.println("\n6. UPPERCASE");

        System.out.println(text.toUpperCase());


        // 7. toLowerCase()
        System.out.println("\n7. LOWERCASE");

        System.out.println(text.toLowerCase());


        // 8. trim()
        System.out.println("\n8. TRIM");

        String username = "   abhiram   ";

        System.out.println(username.trim());


        // 9. strip()
        System.out.println("\n9. STRIP");

        String message = "   Hello Java   ";

        System.out.println(message.strip());


        // 10. isEmpty()
        System.out.println("\n10. IS EMPTY");

        String empty = "";

        System.out.println(empty.isEmpty());


        // 11. isBlank()
        System.out.println("\n11. IS BLANK");

        String blank = "   ";

        System.out.println(blank.isBlank());


        // 12. contains()
        System.out.println("\n12. CONTAINS");

        String sentence = "I am learning Java programming";

        System.out.println(sentence.contains("Java"));


        // 13. startsWith()
        System.out.println("\n13. STARTS WITH");

        String website = "www.google.com";

        System.out.println(website.startsWith("www"));


        // 14. endsWith()
        System.out.println("\n14. ENDS WITH");

        System.out.println(website.endsWith(".com"));


        // 15. replace()
        System.out.println("\n15. REPLACE");

        String oldText = "I like Python";

        System.out.println(oldText.replace("Python", "Java"));


        // 16. replaceFirst()
        System.out.println("\n16. REPLACE FIRST");

        String numbers = "123-456-789";

        System.out.println(numbers.replaceFirst("-", "/"));


        // 17. replaceAll()
        System.out.println("\n17. REPLACE ALL");

        String phone = "987-654-3210";

        System.out.println(phone.replaceAll("-", ""));


        // 18. split()
        System.out.println("\n18. SPLIT");

        String fruits = "Apple,Banana,Orange";

        String[] fruitArray = fruits.split(",");

        System.out.println(Arrays.toString(fruitArray));


        // 19. join()
        System.out.println("\n19. JOIN");

        String joined = String.join(" - ", "Java", "Python", "C++");

        System.out.println(joined);


        // 20. concat()
        System.out.println("\n20. CONCAT");

        String first = "Hello";

        System.out.println(first.concat(" World"));


        // 21. repeat()
        System.out.println("\n21. REPEAT");

        System.out.println("Java ".repeat(3));


        // 22. compareTo()
        System.out.println("\n22. COMPARE TO");

        String a = "Apple";
        String b = "Banana";

        System.out.println(a.compareTo(b));


        // 23. compareToIgnoreCase()
        System.out.println("\n23. COMPARE TO IGNORE CASE");

        System.out.println("JAVA".compareToIgnoreCase("java"));


        // 24. toCharArray()
        System.out.println("\n24. TO CHAR ARRAY");

        String language = "JAVA";

        char[] characters = language.toCharArray();

        System.out.println(Arrays.toString(characters));


        // 25. valueOf()
        System.out.println("\n25. VALUE OF");

        int age = 25;

        String ageText = String.valueOf(age);

        System.out.println(ageText);


        // 26. format()
        System.out.println("\n26. FORMAT");

        String name = "Abhi";

        int years = 22;

        String formatted = String.format(
            "My name is %s and I am %d years old.",
            name,
            years
        );

        System.out.println(formatted);


        // 27. matches()
        System.out.println("\n27. MATCHES");

        String email = "abhi@example.com";

        System.out.println(
            email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")
        );


        // 28. Practical: Remove extra spaces
        System.out.println("\n28. PRACTICAL CLEANING");

        String rawName = "   Abhiram   ";

        String cleanName = rawName.strip();

        System.out.println(cleanName);


        // 29. Practical: Count characters
        System.out.println("\n29. CHARACTER COUNT");

        String word = "Programming";

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            count++;

        }

        System.out.println("Characters: " + count);


        // 30. Practical: Reverse a String
        System.out.println("\n30. REVERSE STRING");

        String original = "Java";

        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {

            reversed += original.charAt(i);

        }

        System.out.println(reversed);

    }
}
