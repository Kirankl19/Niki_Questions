//Print all numbers divisible by a given number within a range.
public class DivisibleNumberPrinter {
    static void divisible(int min, int max, int n) {
        for (int i = min; i <= max; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int min = 10;
        int max = 50;
        int n = 7;
        System.out.println("The numbers divisible by " + n + " within " + min + "-" + max);
        divisible(min, max, n);
    }
}
