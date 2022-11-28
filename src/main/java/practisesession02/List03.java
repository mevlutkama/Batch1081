package practisesession02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List03 {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        List<Double> decimalList = new ArrayList<>();
        for (String w : a){
            Double price=Double.valueOf(w.replace("$",""));
            decimalList.add(price);
        }
        Collections.sort(decimalList);
        System.out.println(decimalList);
        Double sum= decimalList.get(0)+ decimalList.get(decimalList.size()-1);
        System.out.println(sum);


     }

}
