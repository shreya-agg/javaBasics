package lambdafunction;

import java.util.function.Function;

public class LambdaChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add3 = x -> x + 3;

        Function<Integer, Integer> combined = multiplyBy2.andThen(add3);

        int result = combined.apply(5); // (5 * 2) + 3
        System.out.println("Result: " + result);
    }
}
