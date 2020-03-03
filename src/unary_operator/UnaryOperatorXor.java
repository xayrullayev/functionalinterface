package unary_operator;

import java.util.function.UnaryOperator;

public class UnaryOperatorXor {
    public static void main(String args[])
    {
        UnaryOperator<Integer> xor = a -> a ^ 2;
        System.out.println(xor.apply(6));
        System.out.println(127<<2);
        int n = 4096;
        int s=n^(n-1);
        if(s == 2*n-1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
