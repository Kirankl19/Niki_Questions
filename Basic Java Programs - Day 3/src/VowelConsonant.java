import java.util.Scanner;

//WAJP to check if a given character is a vowel or a consonant.
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        s.close();
        c=Character.toLowerCase(c);
        if(c>='a' && c<='z')
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                System.out.println(c+" is a Vowel");
            }
            else
            {
                System.out.println(c+" is a Consonant");
            }
        }
        else
        {
            System.out.println("Please provide a valid Alphabet");
        }

    }
}
