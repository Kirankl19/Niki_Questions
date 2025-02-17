public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int count = 0;
        int sum = 0;
        int copy = n;
        while (copy != 0) {
            copy /= 10;
            count++;
        }
        copy = n;
        while (copy != 0) {
            int ls = copy % 10;//3
            int res = 1;

            for (int i = 1; i <= count; i++) {
                res = res * ls;
            }
            sum = sum + res;
            copy = copy / 10;

        }


        if (sum == n) {
            System.out.println(n + " is a Armstrong Number");
        } else {
            System.out.println(n + " not a Armstrong Number");
        }
    }
}
