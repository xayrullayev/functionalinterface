package unary_operator;

import java.util.function.UnaryOperator;

/**
 * Unary operator result and the single argument types are the same (4 variants)
 */
public class UnaryOperators {
    public static void main(String args[])
    {

        // Instantiate the UnaryOperator interface
        UnaryOperator<Boolean>
                op = UnaryOperator.identity();

        // Apply identify() method
        System.out.println(op.apply(true));
    }
}
