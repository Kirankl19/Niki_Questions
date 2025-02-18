//Find the least common multiple (LCM) of two numbers.
public class LCM {
    public static void main(String[] args) {
        int x=12,y=18;
        int max=0;
        if(x>y)
        {
            max=x;
        }
        else
        {
            max=y;
        }
        int LCM =max;
        while (true)
        {
            if (LCM % x == 0 && LCM % y == 0) {
                System.out.println("The LCM of " + x + " and " + y + " is " + LCM);
                break; // Exit the loop when LCM is found
            }
            LCM += max;//Increment to find LCM
        }
    }
}
