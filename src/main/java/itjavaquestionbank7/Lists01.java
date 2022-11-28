package itjavaquestionbank7;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //Find the sum of all list elements in an integer list.
        List<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(31);
        arr.add(7);
        arr.add(13);
        arr.add(10);
        System.out.println(arr);
        int sum=0;
        for (int w : arr){
            sum=sum+w;
        }
        System.out.println(sum);

        //Find the sum of all list elements before the first occurrence of 13 in an integer list
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        System.out.println(myList);
        int summy=0;
        for (int w : myList){
            if (w==13){
                break;
            }
                summy=summy+w;

        }
        System.out.println(summy);
    }
}
