package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Review02 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(10);
        a.add(21);
        Collections.sort(a);
        int minDiff=Integer.MAX_VALUE;
        for (int i = 1;i<a.size() ;i++){
            minDiff=Math.min(minDiff,a.get(i)-a.get(i-1));
        }
        for (int i = 1; i<a.size();i++){
            if (a.get(i)-a.get(i-1)==minDiff){
                System.out.println(a.get(i)+ " and "+a.get(i-1));
            }
        }
        List<Integer> b =new ArrayList<>();
        b.add(11);
        b.add(33);
        b.add(22);
        b.add(7);
        b.add(15);
        for (int w : b){
            if (w==7){
                continue;
            }
            b.set(b.indexOf(w),w+3);
        }
        System.out.println(b);

        List<String> x =new ArrayList<>();
        x.add("11");
        x.add("31");
        x.add("22");
       // x.add("17");
        //x.add("31");
       // x.add("21");
       // x.add("67");
        for (int i=0;i<x.size()-4;i++){

                x.set(i, "*");
            }
        System.out.println(x);
        }

    }

