package function;

import java.util.function.DoubleToLongFunction;

public class DoubleToIntFunctionExample {
    public static void main(String[] args) {
        DoubleToLongFunction dl = (x) -> {return Long.MAX_VALUE - (long)x;};
        System.out.println(dl.applyAsLong(3.14));
    }
}
