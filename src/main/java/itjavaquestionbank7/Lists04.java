package itjavaquestionbank7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {
        //Find the closest 2 integers in an Integer List Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13
        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(31);
        a.add(15);
        a.add(13);
        a.add(54);
        Collections.sort(a);
        int minDiff = Integer.MAX_VALUE;
        for (int i=1;i<a.size();i++){
            minDiff=Math.min(minDiff,a.get(i)-a.get(i-1));
        }
        for (int i=1;i<a.size();i++){
            if (minDiff==a.get(i)-a.get(i-1)){
                System.out.println(a.get(i) +" and "+a.get(i-1));
            }
        }

        //Increase the value of every element except 7 and 10 by 2 in a List Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)
        List<Integer> b = new ArrayList<>();
        b.add(12);
        b.add(31);
        b.add(7);
        b.add(13);
        b.add(10);
        for (int w : b){
            if (w==7 || w==10){
                continue;
            }else {
                b.set(b.indexOf(w),w+2);
            }
        }
        System.out.println(b);
    }
}
