// WAJP to find the Product of the digits in a given number:

public class ProductofDigit {
    public static void main(String[] args) {
        int n = 1234;
        int p = n;
        int prod = 1;
        while (n != 0) {
            int last_digit = n % 10;
            prod = prod * last_digit;
            n = n / 10;
        }
        System.out.println("Product of " + p + " Digits is " + prod);
    }
}
