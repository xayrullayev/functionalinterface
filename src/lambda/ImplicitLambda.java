package lambda;

public class ImplicitLambda {
    public static void main(String[] args) {
        MyIntegerCalculator myIntegerCalculator = (Integer s1) -> s1 * 2;

        System.out.println("1- Result x2 : " + myIntegerCalculator.calcIt(5));

    }
}
