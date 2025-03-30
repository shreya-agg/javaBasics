package streams;

import java.util.Arrays;
import java.util.List;

public class streamSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3);

        // Use stream and sorted to sort the list
        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}