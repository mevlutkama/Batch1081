package day13arrays;

import java.util.Arrays;

public class Review02 {
    public static void main(String[] args) {
        String cities[]=new String[5];
        cities[0]="Tokyo";
        cities[1]="Berlin";
        cities[2]="Istanbul";
        cities[3]="Jacksonville";
        cities[4]="Calgary";
        System.out.println(Arrays.toString(cities));

        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

        for (String w:cities){
            System.out.println(w);
        }
        System.out.println("==========================");
        String names[]={"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        for (String w:names) {
            if (w.length()<5){
                System.out.println(w);
            }
        }
        System.out.println("****************************");
        for (String w:names) {
            System.out.println(w);
            if (w.equals("Tom")){
                break;
            }
        }
        System.out.println("++++++++++++++++++++++++++++");
        for (String w:names){
            if (w.equals("Tom")){
                continue;
            }
            System.out.println(w);
        }
    }
}
