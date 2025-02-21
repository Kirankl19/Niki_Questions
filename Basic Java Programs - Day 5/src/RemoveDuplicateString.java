//
public class RemoveDuplicateString {
    public static void main(String[] args) {
        String s = "MALAYALAM";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //The condition if(res.indexOf(ch) == -1) checks whether the character ch is already present in the string res.
            if (res.indexOf(ch) == -1) {
                res += ch;
            }
        }
        System.out.println(res);
    }
}
