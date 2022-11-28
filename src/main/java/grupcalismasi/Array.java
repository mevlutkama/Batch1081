package grupcalismasi;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Example 8 -[0,2,3,2,12,2] put the all two to the end---> [0 3 12 2 2 2 ]
        int arr[] = {0, 2, 3, 2, 12, 2};
        int brr[] = new int[arr.length];
        int idx = 0;
        int x = brr.length-1;
        for (int w : arr) {
            if (w != 2) {
                brr[idx] = w;
                idx++;
            }
        }
        for (int w : arr){
            if (w==2){
                brr[x]=w;
                x--;

            }
        }
        System.out.println(Arrays.toString(brr));
    }
}
