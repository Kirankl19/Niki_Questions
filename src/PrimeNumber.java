import java.util.Scanner;
// Check Whether Given Number is Prime or NOt
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int count = 0;
        if (n<=1) {
            System.out.println(n + " is not a Prime Number");
           return;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count = 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a Prime number");

        }
    }
}
