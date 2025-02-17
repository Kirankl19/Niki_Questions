//odd nos from 1 to 100
public class OddNumber {
    public static void main(String[] args) {
        System.out.println("Even Numbers are");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("ODD Numbers Are ");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
    }
}
