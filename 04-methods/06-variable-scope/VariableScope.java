
public class VariableScope {

    // 1. Static variable
    static String companyName = "Kerala Vision";

    // 2. Instance variables
    String employeeName;
    double salary;

    // Constructor
    VariableScope(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // 3. Local variables
    void displayEmployee() {

        String message = "Employee Details";

        System.out.println(message);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
    }

    // 4. Block scope
    void demonstrateBlockScope() {

        int number = 100;

        if (number > 50) {

            int result = number * 2;

            System.out.println("Inside block: " + result);
        }

        // result cannot be accessed here
        System.out.println("Outside block: " + number);
    }

    // 5. Variable shadowing
    void demonstrateShadowing(String employeeName) {

        System.out.println("Parameter: " + employeeName);

        System.out.println("Instance variable: " + this.employeeName);
    }

    // 6. Local variable lifetime
    void demonstrateLifetime() {

        int count = 10;

        count++;

        System.out.println("Count: " + count);
    }

    // 7. Static variable shared between objects
    static void changeCompanyName(String name) {

        companyName = name;
    }

    // 8. Instance variable modification
    void increaseSalary(double amount) {

        salary += amount;
    }

    public static void main(String[] args) {

        // Creating objects
        VariableScope employee1 =
            new VariableScope("Abhiram", 25000);

        VariableScope employee2 =
            new VariableScope("Rahul", 30000);

        // Display employee details
        employee1.displayEmployee();
        employee2.displayEmployee();

        // Block scope
        employee1.demonstrateBlockScope();

        // Variable shadowing
        employee1.demonstrateShadowing("Temporary Name");

        // Local variable lifetime
        employee1.demonstrateLifetime();
        employee1.demonstrateLifetime();

        // Static variable modification
        changeCompanyName("KVBL");

        System.out.println("\nAfter Company Name Change:");

        employee1.displayEmployee();
        employee2.displayEmployee();

        // Instance variable modification
        employee1.increaseSalary(5000);

        System.out.println("\nAfter Salary Increase:");

        employee1.displayEmployee();
        employee2.displayEmployee();
    }
}
