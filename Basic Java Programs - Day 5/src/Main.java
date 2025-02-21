import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sm = 9;
        int l = 0;
        int ld = 0;
        s.close();
        while (a > 0) {
            ld = a % 10;
            if (ld > l) {
                l = ld;
            }
            if (ld < sm) {
                sm = ld;
            }
            a = a / 10;
        }
        System.out.println("largest is " + l + " smallest is " + sm);

    }
}