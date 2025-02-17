import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is a even");
        }
        else {
            System.out.println(n+" is odd");
        }
    }
}
