package predicate;

import java.util.function.Predicate;

/**
 * Predicate takes one (or two) argument(s) and returns a boolean (5 variants)
 */
public class Example1 {
    public static void main(String[] args) {
        Predicate<String> i  = (s)-> s.length() > 5;

        System.out.println(i.test("simplex.uz"));
    }
}
