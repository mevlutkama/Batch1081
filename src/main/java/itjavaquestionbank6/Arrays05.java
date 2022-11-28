package itjavaquestionbank6;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays05 {
    public static void main(String[] args) {
        /*  Create an integer array by getting the elements from the user then print the difference between the smallest and the greatest elements
          on the console.*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int num= input.nextInt();
        int arr[]=new int[num];

        System.out.println("Enter "+num+" array elements");
        for (int i=0;i<num;i++){
            arr[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int difference=arr[num-1]-arr[0];
        System.out.println("Difference between the smallest and the greatest elements is: "+difference);
    }
}
