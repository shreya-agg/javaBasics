package strings;

import java.util.Scanner;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the character to be replaced:");
        char oldChar = scanner.next().charAt(0);
        System.out.println("Enter the new character:");
        char newChar = scanner.next().charAt(0);
        String replacedString = input.replace(oldChar, newChar);
        System.out.println("String after replacement: " + replacedString);
        scanner.close();
    }
}
