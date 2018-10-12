package lambdas;

import java.util.logging.Logger;

import static java.lang.System.out;

interface ArraySum {
    int sum(int[] a) throws EmptyArrayExcemption;
}

class EmptyArrayExcemption extends Exception {
    EmptyArrayExcemption() {
        super("Empty Array");
    }
}

public class ExceptionLambda {
    public static void main(String[] args) throws EmptyArrayExcemption {
        ArraySum arraySum = (a) -> {
            if (a.length == 0) {
                throw new EmptyArrayExcemption();
            }
            return 0;
        };

        int[] a = {3, 4, 5, 6, 7};

        out.println(arraySum.sum(a));
    }
}
