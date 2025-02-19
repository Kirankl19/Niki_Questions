/*
WAJP to check if a given year is a leap year.
A year is a leap year if:
It is divisible by 4.
But if it is also divisible by 100, then it must also be divisible by 400 to be a leap year.

 */
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if ((n % 4 == 0) || (n % 100 == 0 && n % 400 != 0)) {
            System.out.println(n + " is a Leap Year");
        } else {
            System.out.println(n + " not a Leap Year");

        }
    }
}
