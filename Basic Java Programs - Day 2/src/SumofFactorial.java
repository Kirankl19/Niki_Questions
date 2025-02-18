//Find the sum of factorial of N number
public class SumofFactorial {
    static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        int N = 5, sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += fact(i);
        }
        System.out.println("Sum of Factorial of " + N + " is " + sum);
    }
}
