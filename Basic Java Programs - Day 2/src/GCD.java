//Find the greatest common divisor (GCD) of two numbers.
/*
Find GCD(12, 18)

Divisors of 12: 1, 2, 3, 4, 6, 12
Divisors of 18: 1, 2, 3, 6, 9, 18
Common divisors: 1, 2, 3, 6
Largest common divisor: 6

 */
public class GCD {
    public static void main(String[] args) {
        int n1=12,n2=18;
        int a = n1, b = n2;
        while (n1!=n2)
        {
            if(n1>n2)
            {
                n1=n1-n2;
            }
            else
            {
                n2=n2-n1;
            }
        }
        System.out.printf("The GCD OF %d,%d is %d\n",a,b,n1);
    }
}
