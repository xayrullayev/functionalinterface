package lambda;

/**
 *
 * Single Parameter
 *
 * The lambda expression (String msg) -> {System.out.println(msg);} has everything.
 * Then we can omit the parameter type to have
 * (msg)->{System.out.println(msg);}
 * We can further omit the parameter type and parentheses as follows.
 * msg -> { System.out.println(msg); }
 *
 */
public class SingleParameterLambda {
    public static void main(String[] argv) {
        Processor stringProcessor = str -> str.length();
        String name = "Java Lambda when parameters single you can omit parentheses";
        int length = stringProcessor.getStringLength(name);
        System.out.println(length);
    }
}
