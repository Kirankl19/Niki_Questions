//WAJP to Reverse a String
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string=s.next();
        String rev=" ";
        for (int i = string.length()-1; i >=0 ; i--) {

            rev=rev+string.charAt(i);
        }
        System.out.println("Reversed String is "+rev);

    }
}
