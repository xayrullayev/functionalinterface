package supplier;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class IntSupplierExample {
    public static void main(String[] args) {
        IntSupplier i = ()-> Integer.MAX_VALUE;
        System.out.println(i.getAsInt());
        /**
         * Example 2
         */
        IntSupplier fib = new IntSupplier() {
            private int previous = 0;
            private int current = 1;

            public int getAsInt() {
                int nextValue = this.previous + this.current;
                this.previous = this.current;
                this.current = nextValue;
                return this.previous;
            }
        };
        IntStream.generate(fib).limit(10).forEach(System.out::println);
    }
}
