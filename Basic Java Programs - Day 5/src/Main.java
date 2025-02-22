import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 3, 2, 4};
        Arrays.sort(arr);
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[index++] = arr[i];
            }
        }
        arr[index++] = arr[arr.length - 1];
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}