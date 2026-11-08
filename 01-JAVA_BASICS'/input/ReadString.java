package input;

import java.util.Scanner;

public class ReadString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Your name is: " + fullName);

        scanner.close();
    }
}