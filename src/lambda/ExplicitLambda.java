package lambda;

public class ExplicitLambda {
    public static void main(String[] args) {
        MyIntegerCalculator myIntegerCalculator = (s1) -> s1 * 2;

        System.out.println("1- Result x2 : " + myIntegerCalculator.calcIt(5));

    }
}
