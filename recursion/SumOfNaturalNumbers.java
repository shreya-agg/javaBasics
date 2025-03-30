package recursion;

public class SumOfNaturalNumbers {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Sum of first " + number + " natural numbers is " + sum(number));
    }
}
