//Second Maximum in Array

public class SecondMax {
    public static void main(String[] args) {
        int[] a = {12, 14, 15, 1, 16, 16,17};
        int max = Integer.MIN_VALUE; //-2 pow 31

        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                secondmax = max;
                max = a[i];
            } else if (a[i] > secondmax && a[i] != max) {
                secondmax = a[i];
            }

        }
        if (secondmax == Integer.MIN_VALUE) {
            System.out.println("No second Maximum Value");
        } else {
            System.out.println(" second Maximum Value : " + secondmax);

        }
    }
}
