
public class AccessModifiers {

    // Public variable
    public String companyName = "Kerala Vision";

    // Private variable
    private String employeeName = "Abhiram";

    // Protected variable
    protected double salary = 25000;

    // Default (package-private) variable
    String department = "IT";

    // Public method
    public void displayCompany() {
        System.out.println("Company: " + companyName);
    }

    // Private method
    private void displayEmployeeName() {
        System.out.println("Employee: " + employeeName);
    }

    // Protected method
    protected void displaySalary() {
        System.out.println("Salary: " + salary);
    }

    // Default method
    void displayDepartment() {
        System.out.println("Department: " + department);
    }

    // Public method accessing private method
    public void showEmployeeDetails() {
        displayEmployeeName();
        displaySalary();
        displayDepartment();
    }

    // Getter: access private employee name
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter: modify private employee name
    public void setEmployeeName(String employeeName) {

        if (employeeName != null && !employeeName.isBlank()) {
            this.employeeName = employeeName;
        } else {
            System.out.println("Invalid employee name");
        }
    }

    // Getter: access private salary
    public double getSalary() {
        return salary;
    }

    // Setter: modify salary with validation
    public void setSalary(double salary) {

        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    public static void main(String[] args) {

        AccessModifiers employee = new AccessModifiers();

        // Public access
        System.out.println(employee.companyName);
        employee.displayCompany();

        // Private members are accessed through public methods
        System.out.println(employee.getEmployeeName());

        // Modify private fields through setters
        employee.setEmployeeName("Rahul");
        employee.setSalary(30000);

        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getSalary());

        // Protected access within the same package
        employee.displaySalary();

        // Default access within the same package
        employee.displayDepartment();

        // Private method accessed indirectly
        employee.showEmployeeDetails();

        // These would cause compilation errors:
        // System.out.println(employee.employeeName);
        // employee.displayEmployeeName();
    }
}
