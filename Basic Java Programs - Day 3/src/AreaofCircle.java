//WAJP to find the area of a circle using the formula πr².
import java.util.Scanner;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float radius=s.nextFloat();
        s.close();
        double Area= 3.142* radius*radius; // Area of a Circle Formula πr².
        System.out.println("Area of a Circle is : "+Area);
    }
}
