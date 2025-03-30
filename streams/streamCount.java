package streams;

import java.util.Arrays;
import java.util.List;

public class streamCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "Charlie", "Anna");

        // Use stream and filter to count names starting with 'A'
        long count = names.stream()
                          .filter(name -> name.startsWith("A"))
                          .count();

        System.out.println("Number of names starting with 'A': " + count);
    }
}