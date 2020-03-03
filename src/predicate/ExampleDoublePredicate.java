package predicate;

import java.util.function.DoublePredicate;

public class ExampleDoublePredicate {
    public static void main(String[] args) {
        DoublePredicate dp = (d) -> d > 0;

        System.out.println(dp.test(0.5));

    }
}
