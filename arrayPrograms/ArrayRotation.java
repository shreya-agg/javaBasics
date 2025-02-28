package arrayPrograms;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int positions = 3;

        rotateArray(array, positions);

        System.out.println("Array after rotation:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void rotateArray(int[] array, int positions) {
        int n = array.length;
        positions = positions % n;

        reverseArray(array, 0, n - 1);
        reverseArray(array, 0, positions - 1);
        reverseArray(array, positions, n - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
