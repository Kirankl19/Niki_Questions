//Find the sum of cubes of first N natural numbers.
/*
 int sum = (N * (N + 1) / 2);
        return sum * sum; shortcut
 */
public class SumofCubes {
    static int cube(int n)
    {
        return n*n*n;
    }

    public static void main(String[] args) {
        int N=10;
        int sum=0;
        for (int i = 0; i <=N; i++) {
            sum=sum+cube(i);

        }
        System.out.println("The Sum of Cube of "+N+" is "+sum);
    }
}
