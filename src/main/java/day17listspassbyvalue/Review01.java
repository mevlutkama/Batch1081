package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Review01 {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(2);
        x.add(3);
        x.add(2);
        x.add(2);
        x.add(5);
        List<Integer> y = new ArrayList<>();
        for (int w : x){
            if (!y.contains(w)){
                y.add(w);
            }
        }
        System.out.println(y);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter...");
        String let = scan.next();

        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("K");
        a.add("R");
        a.add("S");

        if (a.contains(let)){
            a.set( a.indexOf(let),"Got it" );
        }else {
            a.add(let);
        }
        System.out.println(a);
    }
}
