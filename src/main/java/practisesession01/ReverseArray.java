package practisesession01;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*      Write a program to take a string as input and output its reverse.The given code takes a string as input and converts
            it into a char array, which contains letters of the string as its elements.*/
        String name="Tom Hanks";
        String arr[]=name.split("");
        String brr[]=new String[arr.length];
        int idx=0;
        for (int i=arr.length-1;i>-1;i--){
            brr[idx]=arr[i];
            idx++;
        }
        System.out.println(Arrays.toString(brr));


    }
}
