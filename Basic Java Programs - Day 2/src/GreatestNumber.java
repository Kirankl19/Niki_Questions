//Find the greatest of three numbers.
public class GreatestNumber {

    public static void main(String[] args) {
        int n1 = 5, n2 = 1, n3 = 6;
        /*
        int Great = (n1 >= n2) ? //Using Ternary Operator
                ((n1 >= n3) ? n1 : n3) :
                (((n2 >= n3) ? n2 : n3));
        System.out.println("The largest NUmber is : " + Great);

         */
        if (n1 > n2 && n1 > n3) {
            System.out.println("The largest number is : " + n1);
        } else if (n2 > n1 && n2 > n3) {

            System.out.println("The largest number is : " + n2);

        } else {
            System.out.println("The largest number is : " + n3);

        }
    }
}
