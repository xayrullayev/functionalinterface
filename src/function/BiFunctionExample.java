package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, String,String> bi = (x, y) -> {
            return x + y;
        };

        System.out.println(bi.apply("java2s.com", " tutorial"));
        /**
         * Example 2
         */
        Calculator calculator = new Calculator();
        String result = calculator.calc((a, b) -> ": " + (a * b),3,  5);

        System.out.println(result);

        /**
         * Example 3
         */
        List<Integer> _numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Function<Integer, Integer> lambda = value -> value * 2;
        List<Integer> doubled = _numbers.stream()
                .map(lambda)
                .collect(java.util.stream.Collectors.toList());

        System.out.println(doubled);

        /**
         * Example 4
         */
        List<Double> numbers = Arrays.asList(1D, 25D, 100D);
        System.out.println(transformNumbers(numbers, Math::sqrt));

    }


    private static List<String> transformNumbers(List<Double> numbers, Function<Double, Double> fx) {
        List<String> appliedNumbers = new ArrayList<>();
        for (Double n : numbers) {
            appliedNumbers.add(String.valueOf(fx.apply(n)));
        }
        return appliedNumbers;
    }

}
class Calculator {
    public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
        return bi.apply(i1, i2);
    }
}
