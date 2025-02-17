import java.util.Scanner;

// WAP to check given NUmber is Palindrome or Not
public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int Original = n;
        int rev = 0;
        while (n != 0) {
            int last_digit = n % 10;
            rev = rev * 10 + last_digit;
            n = n / 10;
        }
        if (Original == rev) {
            System.out.println(Original + " is a Palindrome");
        } else {
            System.out.println(Original + " not a Palindrome");
        }
    }
}
