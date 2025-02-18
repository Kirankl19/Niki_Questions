//Check if a number is a strong number
/*
Digits of 145: 1, 4, 5
Factorial of each digit:
1! = 1
4! = 4 × 3 × 2 × 1 = 24
5! = 5 × 4 × 3 × 2 × 1 = 120
Sum of factorials: 1 + 24 + 120 = 145
✅ Since 145 == 145, it is a Strong Number.
 */
public class StrongNumber {
    static int fact(int n) //Factorial Method
    {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 40585;
        int o = n;
        int sum = 0;
        while (n != 0) {
            int ld = n % 10;
            sum += fact(ld);
            n /= 10;
        }
        if (sum == o) {
            System.out.println(o + " is a Strong Number");
        } else {
            System.out.println(o + " not a Strong Number");


        }
    }
}
