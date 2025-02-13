package numbers;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int lcm = (number1 > number2) ? number1 : number2;
        while (true) {
            if (lcm % number1 == 0 && lcm % number2 == 0) {
                System.out.println("LCM is: " + lcm);
                break;
            }
            lcm++;
        }
        scanner.close();
    }
}

