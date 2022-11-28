package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Review03 {
    public static void main(String[] args) {
        //Example 1: Type code to check if a specific element exists in an Array or not
        String s []={"Ali", "Tom", "Carl", "Angie", "Martin"};
        String name="Carl";
        int counter=0;
        for (String w : s){
            if (w.equals(name)){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(name+ " exists");
        }else {
            System.out.println(name+" does not exist");
        }

        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        int a=Arrays.binarySearch(s,"Miami");
        System.out.println(a);


    }
}
