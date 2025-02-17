package strings;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        System.out.println("The words in the string are:");
        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}
