
class Employee {

    int id;
    String name;
    double salary;

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    void updateSalary(double newSalary) {
        salary = newSalary;
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {

        // Create the first object
        Employee employee1 = new Employee();

        employee1.id = 101;
        employee1.name = "Abhi";
        employee1.salary = 25000;

        // Create the second object
        Employee employee2 = new Employee();

        employee2.id = 102;
        employee2.name = "Arun";
        employee2.salary = 30000;

        System.out.println("EMPLOYEE 1");
        employee1.displayDetails();

        System.out.println("\nEMPLOYEE 2");
        employee2.displayDetails();

        // Update only employee1
        employee1.updateSalary(28000);

        System.out.println("\nAFTER UPDATING EMPLOYEE 1");
        employee1.displayDetails();

        System.out.println("\nEMPLOYEE 2 REMAINS UNCHANGED");
        employee2.displayDetails();

        // Copy the reference, not the object
        Employee employee3 = employee1;

        employee3.name = "Abhiram";

        System.out.println("\nAFTER CHANGING THROUGH EMPLOYEE 3");
        employee1.displayDetails();
        employee3.displayDetails();

        // Null reference example
        Employee employee4 = null;

        System.out.println("\nEMPLOYEE 4: " + employee4);
    }
}

