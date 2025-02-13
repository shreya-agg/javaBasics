package numbers;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }
        double average = sum / n;
        System.out.println("The average is: " + average);
        scanner.close();
    }
}
