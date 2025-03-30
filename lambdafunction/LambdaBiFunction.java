package lambdafunction;

import java.util.function.BiFunction;

public class LambdaBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        int sum = add.apply(10, 20);
        System.out.println("Sum: " + sum);
    }
}
