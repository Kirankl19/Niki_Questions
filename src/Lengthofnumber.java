//WAJP tp calculate the count of digits in the given number.
public class Lengthofnumber {
    public static void main(String[] args) {
        int n = 1235;
        int original = n;
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("length of " + original + " is " + count);
    }
}
