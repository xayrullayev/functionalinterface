package lambda;

/**
 * final Modifier
 *
 * You can use final modifier in the parameter declaration for explicit lambda expressions.
 * The following lambda expressions use final modifier.
 *
 * (final int x, final int y) -> { return x + y; }
 * We can just use one modifier as follows.
 *
 * (int x, final int y) -> {return x + y;}
 */
public class FinalModifierLambda {
    public static void main(String[] argv) {
        Processor stringProcessor = (final String str) -> str.length();
        String name = "Java Lambda using explicit lambda with final modifier";
        int length = stringProcessor.getStringLength(name);
        System.out.println(length);

    }
}
