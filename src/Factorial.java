import java.util.Scanner;

// Write a program to find the factorial of a number without recursion.
public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fact=1;
        for (int i = 1; i <=n ; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
