//Find the power of a number using loops.
/*
Input: 2^3
Steps:
result = 1 * 2 = 2
result = 2 * 2 = 4
result = 4 * 2 = 8
Output: 8
 */
public class PowerOfNumber {
    static int power(int a, int e) {
        int res = 1;
        for (int i = 1; i <= e; i++) {
            res = res * a;
        }
        return res;
    }

    public static void main(String[] args) {
        int Power = power(5, 3);
        System.out.println(Power);
    }
}
