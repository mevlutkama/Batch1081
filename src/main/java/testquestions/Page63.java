package testquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Page63 {
    //List<String> list1 = new ArrayList<>();

    public static void main(String[] args) {
       /* List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("F");
        a.add("D");
        a.set(2,"C");
        System.out.println(a);
        a.add(1,"*");
        System.out.println(a);

        a.remove(3);
        a.remove("A");
        System.out.println(a);

        a.remove(2);
        a.remove("D");
        System.out.println(a);

        a.set(0,"A");
        a.add("C");
        a.add("D");
        System.out.println(a);

        for (int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }*/
       /* Page63 obj1 = new Page63();
        obj1.myMethod(obj1.list1);
        obj1.list1.add("z");
        obj1.list1.add("t");
        System.out.println(obj1.list1);*/

        ArrayList<Character> list = new ArrayList<>();
        for (char i='a';i<='e';i++){
            list.clear();
            list.add(i);
        }
        System.out.println(list);


    }

    /*public List<String> myMethod(List<String> list1) {
        list1.add("x");
        list1.add("y");
        return list1;
    }*/
}
