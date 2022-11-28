package itjavaquestionbank7;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {
        //If the list has 15 as element, change all 15s to 51 Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(11);
        myList.add(15);
        myList.add(34);
        myList.add(15);
        myList.add(43);
        int element = 15;
        if (myList.contains(element)) {
            for (int w : myList) {
                if (w == element) {
                    int idx = myList.indexOf(element);
                    myList.set(idx, 51);
                }
            }
            System.out.println(myList);
        } else {
            System.out.println("There is no expected element");
        }

        //If a list has 15 or 13, remove them. Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
        List<Integer> k = new ArrayList<>();
        k.add(10);
        k.add(31);
        k.add(15);
        k.add(13);
        k.add(54);
        System.out.println(k);
        List<Integer> l = new ArrayList<>();
        l.add(15);
        List<Integer> m = new ArrayList<>();
        m.add(13);
        k.removeAll(l);
        k.removeAll(m);
        System.out.println(k);
    }
}
