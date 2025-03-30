package lambdafunction;

import java.util.function.Supplier;

public class LambdaSupplier {
    public static void main(String[] args) {
        Supplier<String> messageSupplier = () -> "Hello from Supplier!";
        System.out.println(messageSupplier.get());
    }
}
