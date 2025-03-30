package searchPatterns;

import java.util.Arrays;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Arrays.sort(arr); // Ensure the array is sorted
        int target = 30;
        int n = arr.length;

        int step = (int) Math.sqrt(n); // Jump size
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                System.out.println("Element not found");
                return;
            }
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }
}