package searchPatterns;

import java.util.Arrays;

public class ExponentialSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Arrays.sort(arr); // Ensure the array is sorted
        int target = 30;
        int n = arr.length;

        if (arr[0] == target) {
            System.out.println("Element found at index: 0");
            return;
        }

        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }

        int result = binarySearch(arr, i / 2, Math.min(i, n - 1), target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
