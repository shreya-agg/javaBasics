package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

public class ArrayInteraction {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] intersection = findIntersection(array1, array2);

        System.out.println("Intersection of the arrays:");
        for (int element : intersection) {
            System.out.print(element + " ");
        }
    }

    public static int[] findIntersection(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (int element : array1) {
            set.add(element);
        }

        for (int element : array2) {
            if (set.contains(element)) {
                intersectionSet.add(element);
            }
        }

        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int element : intersectionSet) {
            result[index++] = element;
        }

        return result;
    }
}
