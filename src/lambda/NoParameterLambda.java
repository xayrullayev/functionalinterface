package lambda;

import java.util.function.BooleanSupplier;

/**
 *
 * No Parameters
 * For a lambda expression with no parameters, we still need the parentheses.
 * () -> { System.out.println("hi"); }
 * The following example shows how to use BooleanSupplier
 *
 */
public class NoParameterLambda {
    public static void main(String[] args) {
        BooleanSupplier bs = () -> true;
        System.out.println(bs.getAsBoolean());

        int x = 0, y= 1;
        bs = () -> x > y;
        System.out.println(bs.getAsBoolean());
    }
}
