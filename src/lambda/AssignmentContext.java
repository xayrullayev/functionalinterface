package lambda;

public class AssignmentContext {
    public static void main(String[] argv) {
        Calculator iCal = (x, y) -> x + y;//from   www.j  a  v a  2s .c o  m
        System.out.println(iCal.calculate(1, 2));
    }

}


//@FunctionalInterface
//interface Calculator{
//    int calculate(int x, int y);
//}
