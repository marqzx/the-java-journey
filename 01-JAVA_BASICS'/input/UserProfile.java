package input;

import java.util.Scanner;

public class UserProfile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== USER REGISTRATION =====");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter monthly salary: ");
        double salary = scanner.nextDouble();

        System.out.println("\n===== PROFILE =====");
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
        System.out.println("Monthly Salary: ₹" + salary);

        scanner.close();
    }
}
