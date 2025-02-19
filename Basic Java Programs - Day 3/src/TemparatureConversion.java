//WAJP to convert a temperature from Fahrenheit to Celsius.
/*
Read the temperature in Fahrenheit from the user.
Apply the formula: Subtract 32, multiply by 5, then divide by 9.
Display the result as Celsius.
 */
import java.util.Scanner;

public class TemparatureConversion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float f=s.nextFloat();
        s.close();
        float celsius= (f-32)*5/9; // Standard Formula
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
