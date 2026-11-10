
public class StringBuilderBuffer {

    public static void main(String[] args) {

        // 1. String is immutable
        System.out.println("1. String Immutability");

        String name = "Abhi";
        name.concat("ram");

        System.out.println(name); // Abhi

        name = name.concat("ram");
        System.out.println(name); // Abhiram


        // 2. StringBuilder
        System.out.println("\n2. StringBuilder");

        StringBuilder builder = new StringBuilder("Java");

        builder.append(" Programming");
        System.out.println("Append: " + builder);

        builder.insert(5, "Language ");
        System.out.println("Insert: " + builder);

        builder.replace(5, 13, "Development");
        System.out.println("Replace: " + builder);

        builder.delete(5, 17);
        System.out.println("Delete: " + builder);

        builder.reverse();
        System.out.println("Reverse: " + builder);


        // 3. StringBuilder capacity
        System.out.println("\n3. Capacity");

        StringBuilder text = new StringBuilder();

        System.out.println("Initial capacity: " + text.capacity());

        text.append("Hello Java");

        System.out.println("Length: " + text.length());
        System.out.println("Capacity: " + text.capacity());


        // 4. Converting StringBuilder to String
        System.out.println("\n4. Conversion");

        StringBuilder message = new StringBuilder("Hello");
        message.append(" World");

        String result = message.toString();

        System.out.println(result);


        // 5. StringBuffer
        System.out.println("\n5. StringBuffer");

        StringBuffer buffer = new StringBuffer("Java");

        buffer.append(" Programming");
        System.out.println(buffer);

        buffer.insert(5, "Language ");
        System.out.println(buffer);

        buffer.reverse();
        System.out.println(buffer);


        // 6. Comparing StringBuilder and StringBuffer
        System.out.println("\n6. Comparison");

        StringBuilder sb = new StringBuilder("Java");
        StringBuffer sf = new StringBuffer("Java");

        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sf);
    }
}
