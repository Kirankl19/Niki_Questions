//Reverse a each word in String
/*
ip:Welcome to java
o/p: emocleW  ot  avaj

 */
public class ReverseWords {
    public static void main(String[] args) {
        String str = "Welcome to java"; //original String
        String[] words = str.split(" ");//Split each word after space
        String reverseString = " ";
        for (int i = 0; i < words.length; i++) {
            String reverseWords = " ";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverseWords = reverseWords + words[i].charAt(j);
            }
            reverseString = reverseString + reverseWords;

        }
        System.out.println(reverseString);
    }
}
