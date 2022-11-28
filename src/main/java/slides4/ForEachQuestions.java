package slides4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachQuestions {

    public static void main(String[] args) {
        // Create an integer array find the sum of all elements by using for-each loop and print the sum on the console.
        /*int arr[] = {1,2,3,4,5,6};
        int sum = 0;
        for (int w : arr){
            sum = sum + w;
        }
        System.out.println(sum); */

        // Create a list find the sum of all elements by using for-each loop and print the sum on the console.
        /*List<Integer> a = Arrays.asList(2,4,6,8,10,12);
        int sum = 0;
        for (int w : a){
            sum = sum + w;
        }
        System.out.println(sum); */

        // Write a Java program to find the common elements between two arrays (string values)
        /*String arr [] = {"Emily","Sara","Miriam","Suzanne"};
        String brr [] = {"Camilla","Fonda","suzanne","sara"};
        for (String w : arr){
            for (String u : brr){
                if (w.equalsIgnoreCase(u)){
                    System.out.print(w+" ");
                }
            }
        } */

        /*String a = "";
        a += 2;
        a += 'c';
        a +=false;
        System.out.println(a);
        if (a == "2cfalse") {
            System.out.println("==");

        }
        if (a.equals("2cfalse")){
            System.out.println("equals");
        } */

        /*ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);
        for (int w : values){
            System.out.println(w);
        } */

        /*int random [] = {6,-4,12,0,-10};
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y); */


    }
}