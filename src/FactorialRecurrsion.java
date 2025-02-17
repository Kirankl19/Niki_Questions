//Write a program to find the factorial of a number using recursion.

import java.util.Scanner;

public class FactorialRecurrsion {
    public static int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res=fact(n);
        System.out.printf("Factorial of %d is %d\n",n,res);
    }
}
