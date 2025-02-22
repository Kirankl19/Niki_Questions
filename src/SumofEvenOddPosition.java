//Write a Java program to calculate the sum of digits at even and odd positions in a given integer
//MOCK Question
public class SumofEvenOddPosition {
    public static void main(String[] args) {
        int n = 123456;
        int c = n;
        int count = 0;
        while (c != 0) {
            c = c / 10;
            count++;
        }
        c = n;
        int ld = 0;
        int Even_sum = 0;
        int Odd_sum = 0;
        while (c != 0) {
            ld = c % 10;
            if (count % 2 == 0) {
                Even_sum += ld;
            } else {
                Odd_sum += ld;
            }
            count--;
            c = c / 10;
        }
        System.out.println("Even position Sum is " + Even_sum);
        System.out.println("Odd Position Sum is " + Odd_sum);
    }
}
