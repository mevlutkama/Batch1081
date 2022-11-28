package itjavaquestionbank7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists05 {
    public static void main(String[] args) {
        /* Find the sum of all prices given in a String list
          Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04*/
        List<String> a = new ArrayList<>();
        a.add("$12.99");
        a.add("$23.60");
        a.add("$54.45");
        double sum = 0;

        for (String w : a) {
            Double price = Double.valueOf(w.replace("$", ""));
            sum = sum + price;
        }
        System.out.println(sum);

        /*Find the sum of the least and the greatest price given in a String list
         Example: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70*/
        List<String> b = new ArrayList<>();
        b.add("$12.99");
        b.add("$8.25");
        b.add("$23.60");
        b.add("$54.45");
        List<Double> decimalList = new ArrayList<>();

        for (String w : b) {
            Double prc = Double.valueOf(w.replace("$", ""));
            decimalList.add(prc);
        }
        Collections.sort(decimalList);
        Double summy=decimalList.get(0)+decimalList.get(decimalList.size()-1);
        System.out.println(summy);



    }
}
