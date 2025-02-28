package arrayPrograms;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 2, 5, 3, 6, 8, 7};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > firstMax) {
                secondMax = firstMax;
                firstMax = number;
            } else if (number > secondMax && number != firstMax) {
                secondMax = number;
            }
        }

        System.out.println("Second largest element: " + secondMax);
    }
}

