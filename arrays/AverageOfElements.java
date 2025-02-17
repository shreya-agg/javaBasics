package arrays;

import java.util.Scanner;

public class AverageOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        double average = (double) sum / n;
        System.out.println("The average of elements is: " + average);
        scanner.close();
    }
}
