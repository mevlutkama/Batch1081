package practisesession01;

import java.util.Arrays;
import java.util.Scanner;

public class MinsAndMaxValue {
    public static void main(String[] args) {
        // Type code to print the sum of the minimum and maximum value of an integer array.
        int arr[] = {23, 12, 34, 10, 78};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum = arr[0] + arr[arr.length - 1];
        System.out.println(sum);

        //Create an array and first take the number of the elements and then print them on the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of employees to store in the array");
        int length = scan.nextInt();

        String arrEmployee[] = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter " + (i + 1) + ". employee name. Please press 'Q' to quit");
            String en = scan.next();
            if (!en.equals("q") && !en.equals("Q")) {
                arrEmployee[i] = en;
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(arrEmployee));
    }
}