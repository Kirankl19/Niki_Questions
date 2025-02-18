//Find the sum of all prime numbers in a given range.
public class SumofPrimeNumber {
    static boolean primenumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeinrange(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (primenumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int min = 10, max = 50;
        System.out.println("The Prime Number Between " + min + "-" + max + " is");
        primeinrange(10, 50);
    }
}
