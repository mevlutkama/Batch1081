package itjavaquestionbank8;

import java.util.*;

public class Maps01 {

    public static void main(String[] args) {

        // There is a Map which contains product names as key and number of the products as value.
        // Type code to find the total number of products.
      /*  HashMap<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        Collection<Integer> a = product.values();
        /*System.out.println(a);
        int sum = 0;
        for (int w : a){
            sum += w;
        }
        System.out.println("Total number of products: " + sum); */
       /* int sum = 0;
        Iterator<Integer> itr = a.iterator();
        while (itr.hasNext()){
            int i = itr.next();
            sum += i;
        }
        System.out.println("Total number of products: " + sum); */

        //There is a Map which contains product names as key and number of the products as value. Type code to check if ‘Laptop’ is among the products.
      /*  HashMap<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87); */

       /* Set<String> productNames = product.keySet();
        Iterator<String> itr = productNames.iterator();
        while (itr.hasNext()){
            String s = itr.next();
            if (s.equals("Laptop")){
                System.out.println("There is Laptop among the products");
                break;
            }else {
                System.out.println("There is no laptop among the products");
                break;
            }
        } */
       /* String productName = "Laptop";
        boolean isExist = product.containsKey(productName);
        if (isExist){
            System.out.println("There is "+ productName + " among the products");
        }else {
            System.out.println("There is no "+ productName + " among the products");
        } */

        // There is a Map which contains product names as key and number of the products as value. Print the prices in ascending order.
       /* HashMap<String, Integer> products = new HashMap<>();
        products.put("Laptop",82);
        products.put("TV", 53);
        products.put("Refrigerator", 12);
        products.put("Music System", 87);
        products.put("Mobile Phone", 53);
        Object []  numOfPro = products.values().toArray();
        Arrays.sort(numOfPro);
        System.out.println(Arrays.toString(numOfPro)); */

        //There is a Map which contains product names as key and number of the products as value. Print the product names in alphabetical order.
       /* HashMap<String, Integer> products = new HashMap<>();
        products.put("Laptop",82);
        products.put("TV", 53);
        products.put("Refrigerator", 12);
        products.put("Music System", 87);
        products.put("Mobile Phone", 53);
        Set<String> nameOfPro = products.keySet();
        List<String> orderedNameOfPro = new ArrayList<>(nameOfPro);
        Collections.sort(orderedNameOfPro);
        System.out.println(orderedNameOfPro); */

        // Type code to count the number of occurrences of the words in a String. (Case insensitive)
       /* String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
        String [] arr = s.toLowerCase().replaceAll("\\p{Punct}","").split(" ");
        HashMap<String, Integer> occurenceMap = new HashMap<>();
        for (String w : arr){
           Integer occurence =  occurenceMap.get(w);
           if (occurence == null){
               occurenceMap.put(w,1);
           }else {
               occurenceMap.put(w,occurence+1);
           }
        }
        System.out.println(occurenceMap);
        System.out.println(occurenceMap.get("a")); */

        // How to check the number of repeated elements in a List
      /*  List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(21);
        nums.add(12);
        nums.add(13);
        nums.add(12);
        nums.add(21);
        nums.add(35);
        nums.add(35);
        List<Integer> repeatedNodes = new ArrayList<>();
        int idx = 0;
        int counter = 0;
        for (int i=0;i<nums.size();i++){
            for (int j=i+1;j<nums.size();j++){
                if (nums.get(i) == nums.get(j)){
                    if (!repeatedNodes.contains(nums.get(i)))
                    repeatedNodes.add(nums.get(i));
                }
            }
        }
        System.out.println(repeatedNodes); */



    }
}
