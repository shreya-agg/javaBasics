package arrayPrograms;

import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] fruits = {"Banana", "Apple", "Mango", "Grapes", "Orange"};

        Arrays.sort(fruits);

        System.out.println("Sorted array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

