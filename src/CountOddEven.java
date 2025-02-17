import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int odd_count=0;
        int even_count=0;
        for (int i = 0; i <=n; i++) {
            if(i%2==0)
            {
                odd_count++;
            }
            if(i%2!=0)
            {
                even_count++;
            }
        }
        System.out.println("Odd number count is "+odd_count);
        System.out.println("Even number count is "+even_count);

    }
}
