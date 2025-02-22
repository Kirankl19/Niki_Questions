//WAJP to Check given string is ANAGRAM S
public class AnagramString {
    public static boolean isAnagram(String s1, String s2) {
        s1.toLowerCase();
        s2.toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] c_count = new int[256];//ASCII Value Range
        for (int i = 0; i < s1.length(); i++) {
            c_count[s1.charAt(i)]++;
            c_count[s1.charAt(i)]--;

        }
        for (int i = 0; i < 256; i++) {
            if (c_count[i] != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "dog";
        String s2 = "godd";
        System.out.println(isAnagram(s1, s2));
    }

}
