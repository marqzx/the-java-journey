package input;

import java.util.Scanner;

public class ReadNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        scanner.close();
    }
}