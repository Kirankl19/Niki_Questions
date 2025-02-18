//Check if a number is a perfect number(6,28,496,8128)
/*
Number: 6
Divisors (excluding 6): 1, 2, 3
Sum: 1 + 2 + 3 = 6
Since 6 == 6, it is a Perfect Number.

 */
public class PerfectNumber {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0)
            {
              sum=sum+i;
            }

        }
        if(sum==n)
        {
            System.out.println(n+" is a Perfect Number");
        }
        else
        {
            System.out.println(n+" not a Perfect Number");

        }
    }
}
