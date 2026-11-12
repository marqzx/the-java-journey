
public class StaticVsInstanceMethods {

    // Static variable: shared by the class
    static String companyName = "Kerala Vision";

    // Instance variable: belongs to each object
    String employeeName;
    double salary;

    // Constructor
    StaticVsInstanceMethods(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // 1. Static method
    static void displayCompany() {
        System.out.println("Company: " + companyName);
    }

    // 2. Instance method
    void displayEmployee() {
        System.out.println("Employee: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    // 3. Static method with parameters
    static double calculateTax(double salary) {
        return salary * 0.05;
    }

    // 4. Instance method with parameters
    void increaseSalary(double amount) {
        salary += amount;
    }

    // 5. Static method calling another static method
    static void displayTax(double salary) {
        double tax = calculateTax(salary);
        System.out.println("Tax: " + tax);
    }

    // 6. Instance method calling another instance method
    void displayEmployeeDetails() {
        displayEmployee();
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {

        // Calling static methods using the class name
        StaticVsInstanceMethods.displayCompany();

        System.out.println(
            "Tax: " + StaticVsInstanceMethods.calculateTax(30000)
        );

        displayTax(30000);

        // Creating objects
        StaticVsInstanceMethods employee1 =
            new StaticVsInstanceMethods("Abhiram", 25000);

        StaticVsInstanceMethods employee2 =
            new StaticVsInstanceMethods("Rahul", 30000);

        // Calling instance methods using objects
        employee1.displayEmployee();
        employee2.displayEmployee();

        // Modifying one employee's salary
        employee1.increaseSalary(5000);

        System.out.println("\nAfter Salary Increase:");

        employee1.displayEmployee();
        employee2.displayEmployee();

        // Calling another instance method
        employee1.displayEmployeeDetails();
    }
}
