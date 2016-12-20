package math;

/**
 * Created by mrahman on 12/16/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num = 9;
        int factorialnum = factorial(num);
        System.out.println("The factorial of "+num+ " is "+factorialnum);

    }
    public static int factorial(int num){

        if (num > 1)
            return num*factorial(num-1);
        else
            return 1;
    }
}
