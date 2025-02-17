import java.util.Scanner;

//WAJP to find prime nos btwn 1 to 100
public class PrimeNumbers {
    static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 2; i < N; i++) {
            if(prime(i))
            {
                System.out.print(i+ " ");
            }
        }
    }
}
