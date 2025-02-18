//Find the Nth Fibonacci number using loops.
public class NthFibonacci {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i < n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
        //After the loop finishes, b will contain the Fibonacci number at position N because it was the last value updated in the loop.
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("The " + n + "th Fibonacci Number is " + fibonacci(n));
    }
}
