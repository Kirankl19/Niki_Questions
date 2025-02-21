//WAJP to check array is sorted or not

import java.util.Arrays;

public class CheckArrayisSorted {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 1};
//        Arrays.sort(arr);
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is  sorted");
        } else {
            System.out.println("Array is not sorted");

        }
    }
}
