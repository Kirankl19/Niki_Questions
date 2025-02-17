//Write a Java program to swap two numbers by using a third variable.
public class SwapUsingVariable {
    public static void main(String[] args) {
        int a=10,b=20;
        int temp=a;
        a=b;
        b=temp;
        System.out.printf("After Swapping a=%d b=%d\n",a,b);
    }
}
