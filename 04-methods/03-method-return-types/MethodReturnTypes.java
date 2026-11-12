
import java.util.Arrays;

public class MethodReturnTypes {

    // 1. Returning an integer
    static int getAge() {
        return 24;
    }

    // 2. Returning a decimal value
    static double calculateSalary(double basic, double allowance) {
        return basic + allowance;
    }

    // 3. Returning a String
    static String getEmployeeName() {
        return "Abhiram";
    }

    // 4. Returning a boolean
    static boolean isEligible(int age) {
        return age >= 18;
    }

    // 5. Returning an array
    static int[] getNumbers() {
        return new int[]{10, 20, 30, 40, 50};
    }

    // 6. Returning an object
    static Employee getEmployee() {
        return new Employee("Rahul", 25000);
    }

    // 7. Returning a calculated result
    static int findLargest(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    // 8. Early return
    static String checkNumber(int number) {

        if (number < 0) {
            return "Negative";
        }

        if (number == 0) {
            return "Zero";
        }

        return "Positive";
    }

    // 9. Void method
    static void displayMessage() {
        System.out.println("Welcome to Java!");
    }

    // 10. Returning an object reference
    static Employee updateSalary(Employee employee, double salary) {
        employee.salary = salary;
        return employee;
    }

    public static void main(String[] args) {

        // Integer
        int age = getAge();
        System.out.println("Age: " + age);

        // Double
        double salary = calculateSalary(10000, 5000);
        System.out.println("Salary: " + salary);

        // String
        String name = getEmployeeName();
        System.out.println("Name: " + name);

        // Boolean
        System.out.println("Eligible: " + isEligible(age));

        // Array
        int[] numbers = getNumbers();
        System.out.println("Numbers: " + Arrays.toString(numbers));

        // Object
        Employee employee = getEmployee();

        System.out.println("Employee: " + employee.name);
        System.out.println("Employee Salary: " + employee.salary);

        // Calculated result
        System.out.println("Largest: " + findLargest(50, 100));

        // Early return
        System.out.println(checkNumber(-10));
        System.out.println(checkNumber(0));
        System.out.println(checkNumber(25));

        // Void
        displayMessage();

        // Returning an updated object
        Employee updatedEmployee = updateSalary(employee, 30000);

        System.out.println("Updated Salary: " + updatedEmployee.salary);
    }
}

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
