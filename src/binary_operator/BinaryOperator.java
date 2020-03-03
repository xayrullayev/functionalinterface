package binary_operator;

/**
 * Binary Operator result and both argument types are the same (4 variants)
 */
public class BinaryOperator {
    public static void main(String[] args) {
        java.util.function.BinaryOperator<Integer> adder = (n1, n2) -> n1 + n2;

        System.out.println(adder.apply(3, 4));
    }
}
