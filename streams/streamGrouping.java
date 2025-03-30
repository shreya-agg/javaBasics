package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamGrouping {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna", "Alex");

        // Use stream and Collectors.groupingBy to group names by their length
        Map<Integer, List<String>> groupedByLength = names.stream()
                                                          .collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByLength);
    }
}
