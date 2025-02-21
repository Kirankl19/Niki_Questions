import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 1, 4, 5};
        Arrays.sort(arr);
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[index++] = arr[i];
            }

        }
        arr[index++] = arr[arr.length - 1];
        System.out.println("Array after removing duplicate");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
