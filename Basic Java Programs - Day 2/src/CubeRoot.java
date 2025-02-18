//Find the cube root of a number without using Math functions.

public class CubeRoot {
    static double cuberoot(double n) {
        double guess = 0;
        double precision = 0.0001;
        while (guess * guess * guess < n) {
            guess = guess + precision;
        }
        return guess;
    }
    public static void main(String[] args) {
        int n = 125;
        System.out.println("Cube root of " + n + " is " + cuberoot(n));
    }
}
