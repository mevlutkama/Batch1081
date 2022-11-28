package practisesession02;

import java.util.Arrays;

public class SymetricalArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3, 2, 1, 6};
        System.out.println(isPalindrome(arr));;


    }

    public static boolean isPalindrome(int[] arr) {
        boolean result = false;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i] == arr[arr.length-1-i]){
                result = true;
            }else {
                result = false;
                break;
            }
        }
        return result;

    }

}