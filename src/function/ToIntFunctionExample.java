package function;

import java.util.function.ToIntFunction;

public class ToIntFunctionExample {
    public static void main(String[] args) {
        ToIntFunction<String> i  = (x)-> Integer.parseInt(x);

        System.out.println(i.applyAsInt("2"));
    }
}
