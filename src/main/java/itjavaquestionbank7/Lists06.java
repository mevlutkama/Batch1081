package itjavaquestionbank7;

import java.util.ArrayList;
import java.util.List;

public class Lists06 {
    public static void main(String[] args) {
        //Check if all elements are unique in an integer List by using loops.
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(31);
        a.add(15);
        a.add(7);
        a.add(15);
        a.add(23);
        List<Integer> b = new ArrayList<>();
        for (int w : a){
            if (!b.contains(w)){
                b.add(w);
            }
        }
        if (a.equals(b)){
            System.out.println("There is no repeated element");
        }else {
            System.out.println("At least one element was repeated");
        }
    }
}
