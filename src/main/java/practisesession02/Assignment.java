package practisesession02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        /* Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.*/
        Scanner input = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            System.out.println("Enter " + i + ". int element for the list please");
            int n1 = input.nextInt();
            a.add(n1);
        }
        System.out.println(a);
        for (int j = 1; j < 3; j++) {
            System.out.println("Enter " + j + ". the element to remove please");
            int n2 = input.nextInt();
            a.remove(a.indexOf(n2));
        }
        System.out.println(a);
        for (int k = 1; k < 3; k++) {
            System.out.println("Which element do you want to update?");
            int n3 = input.nextInt();
            System.out.println("Enter new element please");
            int n4 = input.nextInt();
            a.set(a.indexOf(n3), n4);
        }
        System.out.println(a);


        }
    }

