package grupcalismasi;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class Questions06 {
    public static void main(String[] args) {
       /* int num = 11;
        int counter=0;
        int count = 0;
        do {
            num++;
            for (int i=1;i<=num;i++){
                if (num%i == 0){
                    counter++;
                }
            }
            if (counter == 2){
                System.out.print(num + " ");
                count++;
            }
            counter=0;
        }while (count<10);*/
        //Q02) Write a Java program to join 2 ArrayLists(c1 and c2).
       /* ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        ArrayList<String> c3 = new ArrayList<>();
        c3.addAll(c1);
        c3.addAll(c2);
        System.out.println(c3); */

        //Q03) Write a Java program to copy/clone an ArrayList to another ArrayList.(clone c1)
        /*ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 = new ArrayList<>();*/

        //Q04) Write a Java program to empty an array list. (c1)
        /*ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        c1.clear();
        System.out.println(c1); */

        //Q05) Write a Java program to extract first 3 elements of an ArrayList and the result will be a list again.
        //Original list: [Red, Green, Orange, White, Black] ==> List of the first three elements: [Red, Green, Orange]
       /*ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        List<String> sub_list = list.subList(0, 3);
        System.out.println(sub_list); */

        /*Q06)  Write a Java program to iterate a LinkedList in reverse order.
                use add() method to add values in the linked list */
       /* LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Black");
        list2.add("Pink");
        list2.add("Orange");
        Iterator itr = list2.descendingIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        } */
        /* Q07) Write a Java program to remove and return the first element of a linked list. First print the removed element and
           then the updated list. (use list2) */
       /* LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Black");
        list2.add("Pink");
        list2.add("Orange");
        list2.pop();
        System.out.println(list2); */

        //Q08) Write a Java program to retrieve but does not remove, the last element of a linked list.
        /*LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Black");
        list2.add("Pink");
        list2.add("Orange");
        System.out.println(list2.peekLast());*/

        //Q10) delete the middle element in a given String
        // input : [2, 3, 4, 5, 6] ==> output: [2, 3, 5, 6]
        //input : [2, 3, 4, 5, 6, 7] ==> output: [2, 3, 4, 5, 6]
       /*LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.remove(l1.size()/2);*/
        //Q12) Type a program to create a HashSet to an Array
        /*HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        String arr [] = new String[h_set.size()];
        int idx = 0;
        for (String w : h_set){
            arr[idx] = w;
            idx++;
        }
        System.out.println(Arrays.toString(arr)); */
        /*Q17)  Create an Array List. Add the following as an element. ==> "Computer", "Science"
                Create TreeSet and copy the list into the TreeSet and then add the followings as well. "Portal", "GFG"
                Use Iterator to print the elements of the TreeSet and guess what the output is before printing.
                And then print the elements of the TreeSet.*/

        //Create a  HashSet1 which name is primeNumbers with this numbers:2,3,5,7,11,13,17
        //Create a second HashSet2 which name is oddNumbers with this numbers:3,5,11,17,19,27
        //Create a third   HashSet3 which name is numbers with this numbers:3,5,13
        //a)Write common elements (Intersection) on the console
        //b)Check if numbers is a subset of primeNumbers
        //c)Find HashSet1's elements whose are different from HashSet2

        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(3);
        hs.add(5);
        hs.add(7);
        hs.add(11);
        hs.add(13);
        hs.add(17);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(3);
        hs2.add(5);
        hs2.add(11);
        hs2.add(17);
        hs2.add(19);
        hs2.add(27);

        HashSet<Integer> hs3 = new HashSet<>();
        hs3.add(3);
        hs3.add(5);
        hs3.add(13);

        for (int w : hs){
            for (int u : hs2){
                if (w == u){
                    System.out.print(w+" ");
                }
            }
        }

    }
}