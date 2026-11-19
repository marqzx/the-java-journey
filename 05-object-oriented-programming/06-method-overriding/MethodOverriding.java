
class Employee {

    protected int employeeId;
    protected String name;

    Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    void work() {
        System.out.println(name + " is performing general work.");
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class Developer extends Employee {

    Developer(int employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    void work() {
        System.out.println(name + " is developing software.");
    }
}

class SupportEngineer extends Employee {

    SupportEngineer(int employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    void work() {
        System.out.println(name + " is resolving customer issues.");
    }
}

class Manager extends Employee {

    Manager(int employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    void work() {
        System.out.println(name + " is managing the team.");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Developer developer = new Developer(101, "Abhi");

        SupportEngineer supportEngineer =
                new SupportEngineer(102, "Arun");

        Manager manager = new Manager(103, "Rahul");

        System.out.println("DEVELOPER");
        developer.displayDetails();
        developer.work();

        System.out.println("\nSUPPORT ENGINEER");
        supportEngineer.displayDetails();
        supportEngineer.work();

        System.out.println("\nMANAGER");
        manager.displayDetails();
        manager.work();
    }
}
