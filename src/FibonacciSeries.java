import java.util.Scanner;

//Wap to Print N Fibonacci Series
public class FibonacciSeries {
    public static void main(String[] args) {
        int First = 0, Second = 1, count = 2;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print("Fibonacci Series : " + First + " " + Second + " ");
        /*
        while (count<n) //Using While Loop
        {
            int Third=First+Second;
            System.out.print(Third+" ");
            First=Second;
            Second=Third;
            count++;
        }

         */
        for (int i = 2; i < n; i++) {// using For Loop
            int next = First + Second;
            System.out.print(next + " ");
            First = Second;
            Second = next;
        }
    }
}
