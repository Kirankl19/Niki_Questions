//Find the square root of a number without using Math functions.

public class SquareRoot {
    static double squareroot(double n) {
        double guess = 0;
        double precision = 0.0001;
        while (guess * guess < n) {
            guess = guess + precision;
        }
        return guess;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println("Square root of " + n + " is " + squareroot(n));
    }
}
