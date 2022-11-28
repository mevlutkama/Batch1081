package itjavaquestionbank8;

import java.util.*;

public class Sets01 {

    public static void main(String[] args) {

        // Type the code that shows how many different elements there are in a list. Example: {10, 31, 15, 7, 15, 7, 7} ==> 4
        /*List<Integer> nums = Arrays.asList(10,31,15,7,15,7,7);
        Set<Integer> uniqueNums = new HashSet<>(nums);
        System.out.println(uniqueNums);
        System.out.println(uniqueNums.size()); */

        // Type code to print different characters used in a String Example: ‘Mississippi’ ==> Misp
       /* String str = "Mississippi";
        String output = "";
        String [] a = str.split("");
        LinkedHashSet<String> c = new LinkedHashSet<>();
        for (String w : a){
            c.add(w);
        }
        for (String w : c){
            output = output.concat(w);
        }
        System.out.println(output); */

        // Type code to print the common elements between a Set and a List
        /*List<Integer> myList = Arrays.asList(10, 31, 15, 7, 13);
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);
        for (int w : myList){
            for (int u : mySet){
                if (w == u){
                    System.out.print(w+ " ");
                }
            }
        }
        System.out.println();
        mySet.retainAll(myList);
        System.out.println(mySet); */

        //  Type code to print the different elements in a Set from a List
       /* List<Integer> myList = Arrays.asList(10, 31, 15, 7, 13);
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);
        mySet.removeAll(myList);
        System.out.println(mySet); */

        // Type code to check if a List has repeated elements or not
       /* List<Integer> myList = Arrays.asList(10, 31, 15, 7, 13, 13, 10, 7);
        Set<Integer> mySet = new HashSet<>(myList);
        if (myList.size() == mySet.size()){
            System.out.println("There is no repeated element");
        }else {
            System.out.println("There are "+(myList.size() - mySet.size())+ " repeated elemens in this List");
        } */




    }
}