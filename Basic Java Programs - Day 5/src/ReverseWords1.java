//Write a Java program to reverse the order of words in a given string without using built-in functions
/*
input: RCB is BLOOD
output: BLOOD is RCB
 */
public class ReverseWords1 {
    public static void main(String[] args) {
        String s = "RCB is BLOOD";
        String[] w = s.split(" ");
        String rev = "";
        for (int i = w.length - 1; i >= 0; i--) {
            rev += w[i];
            if (i > 0) {
                rev += " ";
            }
        }
        System.out.println(rev);
    }
}
