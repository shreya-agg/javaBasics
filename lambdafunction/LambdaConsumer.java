package lambdafunction;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class LambdaConsumer {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Consumer<String> printName = name -> System.out.println(name);

        names.forEach(printName);
    }
}
