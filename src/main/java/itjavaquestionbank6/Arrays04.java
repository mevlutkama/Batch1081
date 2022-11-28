package itjavaquestionbank6;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Type code to find if a given element exists in a given array or not.
        String arr[] = {"Java", "is", "an", "object", "oriented", "programming", "language"};
        String element = "object";
        int counter = 0;
        for (String w : arr) {
            if (w.equals(element)) {
                counter++;
            }
        }
        String res = counter > 0 ? element + " exists" : element + " does not exist";
        System.out.println(res);

        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr, "object");
        String result = idx > 0 ? element + " exists" : element + " does not exist";
        System.out.println(result);

        //  Type code to find sum of the number of characters of array elements
        String brr[] = {"alabama", "pick", "sos", "sets", "pex"};
        int sum = 0;
        for (String w : brr) {
            sum = sum + w.length();
        }
        System.out.println(sum);

        //  Type code to put all zeros to end in an integer array. Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
        int crr[] = {5, 0, 2, 0, 3};
        int drr[] = new int[crr.length];
        int indx = 0;
        for (int w : crr) {
            if (w != 0) {
                drr[indx] = w;
                indx++;
            }
        }
        System.out.println(Arrays.toString(drr));
    }
}