public class LengthofString {
    public static void main(String[] args) {
        String s = "nikitha lwda";
        char[] a = s.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        System.out.println(s + " length is " + count);
    }
}
