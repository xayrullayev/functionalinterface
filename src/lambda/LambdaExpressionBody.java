package lambda;

public class LambdaExpressionBody {
    public static void main(String[] argv) {
        Processor stringProcessor = (String str) -> str.length();
        SecondProcessor secondProcessor = (String str) -> str.length();
        //stringProcessor = secondProcessor; //compile error
        String name = "Java Lambda expression body";
        int length = stringProcessor.getStringLength(name);
        System.out.println(length);

    }
}
@FunctionalInterface
interface SecondProcessor {
    int noName(String str);
}
