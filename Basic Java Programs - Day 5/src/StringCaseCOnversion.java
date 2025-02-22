//Swap Uppercase and Lowercase in a String
/*
Input:"HeLLo"
Output:"hEllO"
 */
public class StringCaseCOnversion {
    public static void main(String[] args) {
        String s = "KiRaN";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            } else {
                ch = (char) (ch - 32);
            }
            System.out.print(ch);
        }
    }
}
