//WAJP to Check if a number is a Buzz number (divisible by 7 or ends with 7).
/*
7: Divisible by 7 (7 % 7 == 0).
17: Ends with 7.
21: Divisible by 7 (21 % 7 == 0).
77: Divisible by 7 (77 % 7 == 0).
27: Ends with 7.
 */
public class BuzzNumber {
    public static void main(String[] args) {
        int n = 77;
        if (n % 7 == 0 || n % 10 == 7) {
            System.out.println(n + " is a Buzz Number");
        } else {
            System.out.println(n + " not a Buzz Number");

        }
    }
}
