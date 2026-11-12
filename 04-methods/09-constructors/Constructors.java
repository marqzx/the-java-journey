
public class Constructors {

    // Instance variables
    String employeeName;
    int age;
    double salary;

    // 1. No-argument constructor
    Constructors() {
        employeeName = "Unknown";
        age = 0;
        salary = 0;
    }

    // 2. Parameterized constructor
    Constructors(String name, int age, double salary) {
        this.employeeName = name;
        this.age = age;
        this.salary = salary;
    }

    // 3. Constructor overloading
    Constructors(String name) {
        this.employeeName = name;
        this.age = 18;
        this.salary = 15000;
    }

    // 4. Constructor chaining using this()
    Constructors(String name, int age) {
        this(name, age, 20000);
    }

    // 5. Display employee details
    void displayDetails() {
        System.out.println("Name: " + employeeName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        // Calling no-argument constructor
        Constructors employee1 = new Constructors();

        // Calling parameterized constructor
        Constructors employee2 =
            new Constructors("Abhiram", 24, 25000);

        // Calling overloaded constructor
        Constructors employee3 =
            new Constructors("Rahul");

        // Calling constructor with two parameters
        Constructors employee4 =
            new Constructors("Arun", 25);

        // Displaying object information
        employee1.displayDetails();
        employee2.displayDetails();
        employee3.displayDetails();
        employee4.displayDetails();
    }
}
