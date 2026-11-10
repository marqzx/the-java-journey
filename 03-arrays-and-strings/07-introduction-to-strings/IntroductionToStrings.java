
public class IntroductionToStrings {

    public static void main(String[] args) {

        // 1. String declaration
        System.out.println("1. String Declaration");

        String name;


        // 2. String initialization
        System.out.println("\n2. String Initialization");

        name = "Abhiram";

        System.out.println(name);


        // 3. Declaration and initialization together
        System.out.println("\n3. Direct Initialization");

        String language = "Java";

        System.out.println(language);


        // 4. Creating String using new
        System.out.println("\n4. Using new Keyword");

        String city = new String("Kannur");

        System.out.println(city);


        // 5. String length
        System.out.println("\n5. String Length");

        String message = "Welcome to Java";

        System.out.println("Length: " + message.length());


        // 6. Access individual characters
        System.out.println("\n6. Access Characters");

        String word = "PROGRAMMING";

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(5));


        // 7. Concatenation using +
        System.out.println("\n7. String Concatenation");

        String firstName = "Abhi";
        String lastName = "Ram";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);


        // 8. Concatenation using concat()
        System.out.println("\n8. Using concat()");

        String first = "Hello";
        String second = "World";

        String result = first.concat(" ").concat(second);

        System.out.println(result);


        // 9. String immutability
        System.out.println("\n9. String Immutability");

        String original = "Java";

        original.concat(" Programming");

        System.out.println("Original: " + original);

        original = original.concat(" Programming");

        System.out.println("Updated reference: " + original);


        // 10. String comparison using equals()
        System.out.println("\n10. String Comparison");

        String password1 = "java123";
        String password2 = "java123";

        System.out.println(password1.equals(password2));


        // 11. Case-insensitive comparison
        System.out.println("\n11. Case Insensitive Comparison");

        String value1 = "JAVA";
        String value2 = "java";

        System.out.println(value1.equalsIgnoreCase(value2));


        // 12. String pool demonstration
        System.out.println("\n12. String Pool");

        String a = "Java";
        String b = "Java";

        System.out.println(a == b);


        // 13. Comparing String references
        System.out.println("\n13. Reference Comparison");

        String x = new String("Java");
        String y = new String("Java");

        System.out.println(x == y);

        System.out.println(x.equals(y));


        // 14. Convert to uppercase
        System.out.println("\n14. Uppercase");

        String text = "hello java";

        System.out.println(text.toUpperCase());


        // 15. Convert to lowercase
        System.out.println("\n15. Lowercase");

        String capital = "HELLO JAVA";

        System.out.println(capital.toLowerCase());


        // 16. Remove leading and trailing spaces
        System.out.println("\n16. Trim");

        String username = "   abhiram   ";

        System.out.println(username.trim());


        // 17. Check whether a String is empty
        System.out.println("\n17. Empty String");

        String empty = "";

        System.out.println(empty.isEmpty());


        // 18. Check whether a String is blank
        System.out.println("\n18. Blank String");

        String blank = "   ";

        System.out.println(blank.isBlank());


        // 19. Check whether String contains text
        System.out.println("\n19. Contains");

        String sentence = "I am learning Java programming";

        System.out.println(sentence.contains("Java"));


        // 20. Check beginning and ending
        System.out.println("\n20. Starts With and Ends With");

        String website = "www.google.com";

        System.out.println(website.startsWith("www"));
        System.out.println(website.endsWith(".com"));


        // 21. Find position of text
        System.out.println("\n21. Index Of");

        String programming = "Java Programming";

        System.out.println(programming.indexOf("Programming"));

        System.out.println(programming.indexOf("Python"));


        // 22. Extract a substring
        System.out.println("\n22. Substring");

        String technology = "Java Programming";

        System.out.println(technology.substring(5));
        System.out.println(technology.substring(0, 4));


        // 23. Replace characters and text
        System.out.println("\n23. Replace");

        String oldText = "I like Python";

        String newText = oldText.replace("Python", "Java");

        System.out.println(newText);


        // 24. Split a String
        System.out.println("\n24. Split");

        String fruits = "Apple,Banana,Orange";

        String[] fruitArray = fruits.split(",");

        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }


        // 25. Convert String to char array
        System.out.println("\n25. String to Character Array");

        String programmingLanguage = "JAVA";

        char[] characters = programmingLanguage.toCharArray();

        for (char character : characters) {
            System.out.println(character);
        }


        // 26. Check whether a String contains a digit
        System.out.println("\n26. Character Checking");

        String sample = "Java123";

        for (int i = 0; i < sample.length(); i++) {

            char character = sample.charAt(i);

            if (Character.isDigit(character)) {
                System.out.println(character + " is a digit");
            }
        }

    }
}
