package grupcalismasi;

import java.util.*;
import java.util.stream.Collectors;

public class MapQuestions {
    public static void main(String[] args) {
        //String s = "ABCBDB";
        //getFirstRepEle(s);

        //List<Integer> list = Arrays.asList(2, 5, 8, 9, 12, 5, 8, 2);
        //System.out.println(removeDuplicates(list));
        int arr [] = {2,4,6,10,12,14,20};
        int brr [] = {3,5,7,8,9,15,16};
        //getIntersection(arr,brr);

        // Question 3: There is a Map which contains product names as key and number of the products as value.
        // Print the product names in alphabetical order.(Without using TreeMap and TreeSet)
        Map<String, Integer> product = new HashMap<>();
        product.put("Olive", 25);
        product.put("Sugar", 38);
        product.put("Milk", 58);
        product.put("Egg", 17);
        product.put("Honey", 30);

        /*Set<String> asSet = product.keySet();
        List<String> ordereda = asSet.stream().sorted().collect(Collectors.toList());
        System.out.println(ordereda);*/

        // Question 4: Print the prices in ascending order.
        /*Object[] productPrices = product.values().toArray();
        Arrays.sort(productPrices);*/

    }






    // Question 1: Google and Facebook Interview Question: Write a function to be able to find the element which repeat first inside the String.
    public static void getFirstRepEle(String s) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i, i + 1);
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                System.out.println(c);
                break;
            }
        }
    }











    // Question : Write a function to be able to remove duplicate value from an integer Arraylist by using HashMap.
    public static List<Integer> removeDuplicates(List<Integer> a){
        HashMap<Integer, Boolean> hm = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();
        for (int w : a){
            if (!hm.containsKey(w)){
                hm.put(w,true);
                output.add(w);
            }
        }
        return output;
    }

    // Question 2: Write a program to be able to find intersection of two array by using HashMap.
    public static void getIntersection(int a [], int b[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int w : a){
            if (hm.containsKey(w)){
                hm.put(w,hm.get(w) + 1);
            }else {
                hm.put(w,1);
            }
        }
        for (int w : b){
            if (hm.containsKey(w)){
                System.out.print(w+" ");
            }
        }
    }
}