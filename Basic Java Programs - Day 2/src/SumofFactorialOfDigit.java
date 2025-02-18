//Find the sum of factorial of digits of a number.
/*
Factorial of 3 is 6
Factorial of 4 is 24
Factorial of 1 is 1
Thus, the sum is:
6+24+1=31
 */
public class SumofFactorialOfDigit {
    static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 143;
        int o = n;
        int ls = 0;
        int sum = 0;
        while (n != 0) {
            ls = n % 10;

            sum = sum + fact(ls);
            n = n / 10;
        }

        System.out.println("The sum of Factorial of " + o + " is " + sum);
    }
}
