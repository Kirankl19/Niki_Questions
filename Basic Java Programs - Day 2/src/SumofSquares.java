//Find the sum of squares of first N natural numbers.
//math formula;(N * (N + 1) * (2 * N + 1)) / 6

public class SumofSquares {
    static int square(int n)
    {
        return n*n;
    }
    public static void main(String[] args) {
        int N=10;
        int sum=0;
        for (int i = 0; i <=N; i++) {
            sum=sum+square(i);

        }
        System.out.println("The Sum of square of "+N+" is "+sum);
    }
}
