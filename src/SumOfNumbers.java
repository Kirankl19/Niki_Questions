import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int sum=0;
        for (int i = 0; i <=n; i++) {
            sum=sum+i;

        }
        System.out.printf("Sum of first %d numbers is %d\n", n, sum);
    }
}
