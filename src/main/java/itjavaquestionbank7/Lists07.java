package itjavaquestionbank7;

import java.util.*;

public class Lists07 {
    public static void main(String[] args) {
        /*Type the code that shows how many different elements there are in a list. Example: {10, 31, 15, 7, 15, 7, 7} ==> 4*/
        /*List<Integer> arr = Arrays.asList(10, 31, 15, 7, 15, 7, 7, 98);
        List<Integer> brr = new ArrayList<>();
        int idx = 0;
        for (int w : arr){
            if (!brr.contains(w)){
                brr.add(w);
            }
        }
        int numOfUniqueElement=brr.size();
        System.out.println(numOfUniqueElement);*/

        //Type code to print different characters used in a String Example: ‘Mississippi’ ==> Misp
        //1.Way:
        /*String s = "Mississippi";
        String p = "";
        int i = 0;
        while (i<s.length()){
            String r = s.substring(i,i+1);
            if (!p.contains(r)){
                p=p+r;
            }
            i++;
        }
        System.out.println(p);*/

        //2.Way:
        /*StringBuilder s = new StringBuilder("Mississippi");
        StringBuilder p = new StringBuilder();
        for (int i=0;i<s.length();i++){
            String r = s.substring(i,i+1);
            if (!p.toString().contains(r))
            p.append(r);
        }
        System.out.println(p);*/

        //Type code to check if a List has repeated elements or not
        /*List<Integer> a = Arrays.asList(10, 31, 15, 7, 13, 13);
        List<Integer> b = new ArrayList<>();
        for (int w : a){
            if (!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);

        if (a.size()==b.size()){
            System.out.println("There is no repeated element");
        }else {
            System.out.println("The list has repeated element");
        }*/



    }
}
