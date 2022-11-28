package itjavaquestionbank7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {
        //Find the multiplication of all even list elements in an integer list
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        System.out.println(myList);
        int mul = 1;
        for (int w : myList) {
            if (w % 2 != 0) {
                continue;
            }
            mul = mul * w;
        }
        System.out.println(mul);

        /*Check if elements are in descending order in a list Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
 (Yellow, Red, Green, Blue) ==> Output: It is in descending order*/
        List<String> col = new ArrayList<>();
        col.add("Yellow");
        col.add("Red");
        col.add("Green");
        col.add("Blue");
        List<String> rev = new ArrayList<>();
        rev.addAll(col);
        col.sort(Comparator.reverseOrder());
        if (col.equals(rev)) {
            System.out.println("Elements are in descending order");
        } else {
            System.out.println("Elements are not in descending order");
        }
    }
}
