//WAJP to print the multiplication table of a given number.

import java.util.Scanner;

public class TableofNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + "=" + (n * i));
        }
    }
}
