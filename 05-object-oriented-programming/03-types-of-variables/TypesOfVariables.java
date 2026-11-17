
class Employee {

    // Static variable: shared by all Employee objects
    static String companyName = "Kerala Vision";

    // Instance variables: separate for each object
    int employeeId;
    String employeeName;
    double salary;

    void displayDetails() {

        // Local variable
        String designation = "Software Engineer";

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
        System.out.println("Designation: " + designation);
    }

    void increaseSalary(double amount) {

        // Local variable
        double newSalary = salary + amount;

        salary = newSalary;
    }
}

public class TypesOfVariables {

    public static void main(String[] args) {

        // Creating first employee
        Employee employee1 = new Employee();

        employee1.employeeId = 101;
        employee1.employeeName = "Abhi";
        employee1.salary = 25000;

        // Creating second employee
        Employee employee2 = new Employee();

        employee2.employeeId = 102;
        employee2.employeeName = "Arun";
        employee2.salary = 30000;

        System.out.println("EMPLOYEE 1");
        employee1.displayDetails();

        System.out.println("\nEMPLOYEE 2");
        employee2.displayDetails();

        // Updating instance variable
        employee1.increaseSalary(5000);

        System.out.println("\nAFTER SALARY UPDATE");
        employee1.displayDetails();

        // Updating shared static variable
        Employee.companyName = "KVBL Technologies";

        System.out.println("\nAFTER COMPANY NAME UPDATE");

        employee1.displayDetails();

        System.out.println();

        employee2.displayDetails();
    }
}
