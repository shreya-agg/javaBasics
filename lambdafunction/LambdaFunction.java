package lambdafunction;

import java.util.function.Function;

public class LambdaFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;

        int result = square.apply(5);
        System.out.println("Square of 5: " + result);
    }
}