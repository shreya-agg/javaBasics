package strings;

import java.util.Scanner;

public class IndexOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the character to find its index:");
        char ch = scanner.next().charAt(0);
        int index = input.indexOf(ch);
        if (index == -1) {
            System.out.println("Character not found in the string.");
        } else {
            System.out.println("Index of character '" + ch + "' is: " + index);
        }
        scanner.close();
    }
}
