package consumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiConsumer<String,String> andThenConsumer = (a,v)-> System.out.println("hi");
        biConsumer.andThen(andThenConsumer).accept("Example BiConsumer", "  functional interface");
    }
}
