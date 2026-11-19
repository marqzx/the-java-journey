
class Employee {

    // Common fields
    protected int employeeId;
    protected String name;
    protected double salary;

    // Parent constructor
    Employee(int employeeId, String name, double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Common method
    void displayDetails() {

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

// Developer inherits Employee
class Developer extends Employee {

    String programmingLanguage;

    Developer(int employeeId, String name,
              double salary, String programmingLanguage) {

        super(employeeId, name, salary);

        this.programmingLanguage = programmingLanguage;
    }

    void writeCode() {
        System.out.println(
            name + " is writing " + programmingLanguage + " code."
        );
    }
}

// SupportEngineer inherits Employee
class SupportEngineer extends Employee {

    String supportLevel;

    SupportEngineer(int employeeId, String name,
                    double salary, String supportLevel) {

        super(employeeId, name, salary);

        this.supportLevel = supportLevel;
    }

    void resolveTicket() {
        System.out.println(
            name + " is resolving " + supportLevel + " support tickets."
        );
    }
}

public class Inheritance {

    public static void main(String[] args) {

        // Create Developer object
        Developer developer = new Developer(
            101,
            "Abhi",
            35000,
            "Java"
        );

        // Create SupportEngineer object
        SupportEngineer engineer = new SupportEngineer(
            102,
            "Arun",
            30000,
            "Level 2"
        );

        System.out.println("DEVELOPER DETAILS");

        developer.displayDetails();
        developer.work();
        developer.writeCode();

        System.out.println("\nSUPPORT ENGINEER DETAILS");

        engineer.displayDetails();
        engineer.work();
        engineer.resolveTicket();
    }
}
