package streams;

import java.util.Arrays;
import java.util.List;

public class streamMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Use stream and map to convert names to uppercase
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}