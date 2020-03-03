package supplier;

import java.util.function.DoubleSupplier;

public class DoubleSupplierExample {
    public static void main(String[] args) {
        DoubleSupplier pi = () -> {return 3.14d;};
        System.out.println(pi.getAsDouble());
    }
}
