public class ArraySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 44, 23};
        int key = 1;
        int position = -1;//Initialize with -1 to indicate "not found"
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                position = i;
                break;
            }
        }
        if (position == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println(key + " is found at : " + position);
        }
    }
}
