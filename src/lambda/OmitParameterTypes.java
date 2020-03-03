package lambda;

/**
 * Omitting Parameter Types
 * (int x, int y) -> { return x + y; }
 * We can safely rewrite the lambda expression by omitting the types of parameters as
 * (x, y) -> { return x + y; }
 * If we choose to omit the types of parameters, we have to omit types for all parameters
 *
 */
public class OmitParameterTypes {
    public static void main(String[] argv) {
        Processor stringProcessor = (str) -> str.length();
        String name = "Java Lambda omitting parameter types";
        int length = stringProcessor.getStringLength(name);
        System.out.println(length);

    }
}

