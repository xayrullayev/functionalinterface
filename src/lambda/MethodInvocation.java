package lambda;

public class MethodInvocation {
    public static void main(String[] argv) {
        engine((x, y) -> x / y);//  www  .  j  a v a2s . co m
    }

    private static void engine(Calculator calculator) {
        long x = 2, y = 4;
        long result = calculator.calculate(x, y);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Calculator {
    long calculate(long x, long y);
}
