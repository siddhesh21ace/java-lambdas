package lambdas;

import java.util.function.Function;

import static java.lang.System.*;

public class FunctionalLambda {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        out.println(factorial.apply(5));
    }
}
