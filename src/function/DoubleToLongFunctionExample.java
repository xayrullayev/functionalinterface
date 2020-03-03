package function;

import java.util.function.DoubleToIntFunction;

public class DoubleToLongFunctionExample {
    public static void main(String[] args) {
        DoubleToIntFunction df = (x) -> {return (int)x+2;};
        System.out.println(df.applyAsInt(3.14));
    }
}
