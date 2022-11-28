package itjavaquestionbank6;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*  Find the middle element in an integer array Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
            (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10*/
        int arr[]={12, 5, 8, 13};
        Arrays.sort(arr);

        if (arr.length%2!=0){
            int indexOfMiddleElement=arr.length/2;
            System.out.println(arr[indexOfMiddleElement]);
        }else {
            int indexOfMiddleElement=arr.length/2;
            int averageValue=(arr[indexOfMiddleElement]+arr[indexOfMiddleElement-1])/2;
            System.out.println(averageValue);
        }
        System.out.println();
        /*  Find the smallest positive element and greatest negative element in an integer array
            Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2*/
        int brr[]={-12, 18, -5, 23, -2};
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));
        for (int i=0;i<brr.length;i++){
            if (brr[i]<0 && brr[i+1]>0){
                System.out.println("Maximum negative: "+brr[i]);
                System.out.println("Minimum positive: " + brr[i + 1]);
            }
        }
    }
}
