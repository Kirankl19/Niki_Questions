public class FrequencyOfString {
    static void findfrequency(String str) {
        int[] freq = new int[256];//ASCII characters
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        System.out.println("character Frequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s = "abcdefabcdexyz";
        findfrequency(s);

    }
}
