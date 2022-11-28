package grupcalismasi;

import java.util.*;

public class IteratorQuestions {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Gold");
        elements.add("Silver");
        elements.add("Uranyum");
        elements.add("Iron");
        // Question 5: Update every element by putting "*" to end. By using iterators.
        /*ListIterator<String> itr = elements.listIterator();
        while (itr.hasNext()){
            String el = itr.next();
            itr.set(el+"*");
        }
        System.out.println(elements);*/

        // Question 6: Remove every element from list by using iterators
        /*System.out.println(elements);
        Iterator<String> ite =  elements.iterator();
        while (ite.hasNext()){
            String el = ite.next();
            ite.remove();
        }
        System.out.println(elements);*/

        // Question 7: Increase the numbers in a List by 30 percent then print the elements in the descending order
        // By using iterators INPUT = [30, 70, 50, 120]  OUTPUT = [156, 91, 65, 39]
        /*List<Integer> list = Arrays.asList(30, 70, 50, 120);
        ListIterator<Integer> itr = list.listIterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            itr.set(i * 130 / 100);
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);*/


    }
}
