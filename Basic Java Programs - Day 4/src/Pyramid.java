/*
    *
   * *
  * * *
 * * * *
* * * * *

 */
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            //Printing Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //Printing Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
