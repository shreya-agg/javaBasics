package arrays;

import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int i = 0; i < n; i++) {
            uniqueElements.add(array[i]);
        }
        System.out.println("Array without duplicates:");
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }
        scanner.close();
    }
}
