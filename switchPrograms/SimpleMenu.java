package switchPrograms;

import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Option 1.");
                break;
            case 2:
                System.out.println("You selected Option 2.");
                break;
            case 3:
                System.out.println("You selected Option 3.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
