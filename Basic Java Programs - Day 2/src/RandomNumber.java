//Generate a random number within a given range.

import java.util.Random;

public class RandomNumber {
    static int Random(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        int min = 10;
        int max = 50;
        int random = Random(10, 50);
        System.out.println("The Random Number between " + min + " and " + max + " is " + random);
    }
}
