package itjavaquestionbank6;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
        // Find the elements whose length is the smallest in a String array Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
        String arr[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);

        // Get the initials of the elements in a String array, if the String ends with 'n' or 'k' Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM
        String brr[] = {"Kemal", "jonathan", "Mark", "Jackson", "Ali"};
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));
        for (String w : brr) {
            if (w.endsWith("n")  || w.endsWith("k")) {
                char initials=w.toUpperCase().charAt(0);
                System.out.print(initials);
            }
        }
        System.out.println();
        System.out.println("==============================");
        // Find the total number of characters used in String array elements Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26
       int sum=0;
       for (String w : arr){
           sum=sum+w.length();
       }
        System.out.println(sum);
    }
}
