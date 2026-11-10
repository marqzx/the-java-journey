
public class WrapperClasses {

    public static void main(String[] args) {

        // 1. Primitive types
        System.out.println("1. Primitive Types");

        int age = 25;
        double salary = 25000.50;
        char grade = 'A';
        boolean isActive = true;

        System.out.println(age);
        System.out.println(salary);
        System.out.println(grade);
        System.out.println(isActive);


        // 2. Wrapper classes
        System.out.println("\n2. Wrapper Classes");

        Integer employeeAge = 25;
        Double employeeSalary = 25000.50;
        Character employeeGrade = 'A';
        Boolean employeeActive = true;

        System.out.println(employeeAge);
        System.out.println(employeeSalary);
        System.out.println(employeeGrade);
        System.out.println(employeeActive);


        // 3. Autoboxing
        System.out.println("\n3. Autoboxing");

        int number = 100;

        Integer wrappedNumber = number;

        System.out.println(wrappedNumber);


        // 4. Unboxing
        System.out.println("\n4. Unboxing");

        Integer wrappedValue = 200;

        int primitiveValue = wrappedValue;

        System.out.println(primitiveValue);


        // 5. Parsing Strings into numbers
        System.out.println("\n5. Parsing");

        String numberText = "500";
        String decimalText = "99.50";

        int parsedNumber = Integer.parseInt(numberText);
        double parsedDecimal = Double.parseDouble(decimalText);

        System.out.println(parsedNumber);
        System.out.println(parsedDecimal);


        // 6. Converting numbers into Strings
        System.out.println("\n6. Number to String");

        int marks = 95;

        String marksText = Integer.toString(marks);

        System.out.println(marksText);


        // 7. Useful wrapper methods
        System.out.println("\n7. Wrapper Methods");

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Integer.compare(10, 20));
        System.out.println(Integer.compare(20, 10));
        System.out.println(Integer.compare(10, 10));


        // 8. Null values
        System.out.println("\n8. Null Values");

        Integer result = null;

        System.out.println(result);

        // Uncommenting the next line causes NullPointerException:
        // int value = result;


        // 9. Wrapper class comparison
        System.out.println("\n9. Wrapper Comparison");

        Integer first = 100;
        Integer second = 100;

        System.out.println(first.equals(second)); // true

        // Prefer equals() for comparing wrapper values.
    }
}
