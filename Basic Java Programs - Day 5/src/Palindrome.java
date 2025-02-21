//Write a Java program to check if a given string is a palindrome (a word that reads the same forward and backward) without using built-in string reversal methods.
public class Palindrome {
    public static void main(String[] args) {
        String s = "TooT";
        //String o = s;
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (rev.equals(s)) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " not a Palindrome");

        }
    }
}
