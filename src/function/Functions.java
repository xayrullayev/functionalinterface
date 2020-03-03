package function;

import java.util.function.Function;

/**
 * Functions result and one (or two) argument(s) types are different (17 variants)
 */
public class Functions {
    public static void main(String[] args) {
        Function<Integer,String> converter = (i)-> Integer.toString(i);

        System.out.println(converter.apply(3).length());
        System.out.println(converter.apply(30).length());

        /*----------------------------------------------------*/
        Function<Integer,String> converter2 = (i)-> Integer.toString(i);
        Function<String, Integer> reverse2 = (s)-> Integer.parseInt(s);

        System.out.println(converter.apply(3).length());
        System.out.println(converter.compose(reverse2).apply("30").length());
    }
}
