// WAJP to find the sum of the digits in a given number:
public class SumofDigits {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        while (n != 0) {
            int last_digit = n % 10;
            sum = sum + last_digit;
            n = n / 10;
        }
        System.out.println("Sum of Digits is " + sum);
    }
}
