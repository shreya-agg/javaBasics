package lambdafunction;

import java.util.Arrays;
import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Charlie", "Bob");

        // Sort names using a lambda expression for Comparator
        names.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted names: " + names);
    }
}