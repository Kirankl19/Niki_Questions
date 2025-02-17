//Swap A number without using Third Variable
public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("After Swapping a=%d b=%d%n", a, b);


    }
}
