package practisesession02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        /*Ask user to enter an integer and print "even" on the console for even integers, increase the value by 3
        for odd integers and print it on the console by using ternary.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer please");
        int num = input.nextInt();

        Object res = num%2==0 ? "EVEN" : num + 3;
        System.out.println(res);

        /*Type code to find the common elements between two String Arrays (without case sensitivity)
         Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         Output : [brad,sofia,emily]*/
        String arr [] = {"John", "Brad", "Angel", "Sofia", "Emily"};
        String brr [] = {"sofia", "brad", "grace", "emily", "hazel"};
        List<String> list = new ArrayList<>();
        for (String w:arr){
            for (String u:brr){
                if(w.equalsIgnoreCase(u)){
                    list.add(u);
                }
            }
        }
        System.out.println(list);













    }
}
