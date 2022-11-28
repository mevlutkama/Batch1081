package practisesession02;

import java.util.Arrays;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        //If the list has 15 as element, change all 15s to 51 Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
        List<Integer> a = Arrays.asList(12, 11, 15, 34, 43);
        if (a.contains(15)){
            //for (int w : a){
            //if (w==15){
                a.set(a.indexOf(15),51);
            System.out.println(a);
            }else {
            System.out.println("There is no 15 in the list");
        }

    }
}
