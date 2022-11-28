package day14arraysforeachloop;

import java.util.Arrays;

public class Review01 {
    public static void main(String[] args) {
        //Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //           [2, 3, 12, 0, 0, 0]
        int arr[] = {0, 2, 3, 0, 12, 0};
        int brr[] = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
        System.out.println();
        //Example 2: Type code to check if a specific element exists in an array or not
        //           int crr[]={-12, 23, 5}; check if 23 exists in the array or not.
        int crr[]={-12, 23, 5};
        int counter=0;
        int element=35;
        for (int w : crr) {
            if (w==element){
                counter++;
            }
        }
        String res=counter>0 ? element + " exists in array" : element+" does not exist";
        System.out.println(res);

        Arrays.sort(crr);
        int idx1=Arrays.binarySearch(crr,23);
        System.out.println(idx1);

    }
}