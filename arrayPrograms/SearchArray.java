package arrayPrograms;

public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " is found in the array.");
        } else {
            System.out.println("Element " + target + " is not found in the array.");
        }
    }
}


