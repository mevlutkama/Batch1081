package practise;

import java.util.Scanner;

public class PractiseClass05 {
    public static void main(String[] args) {
        /*Example 21:Type a code, get age from user and decide which stage on it
                        0 - 4 => baby
                        5 - 12 => child
                        13 - 20 => teenager
                        21 - 30 => adult
                        else (not expected age)*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age please");
        int age = input.nextInt();
         if (age >= 0 && age <= 4) {
            System.out.println("Baby");
        } else if (age>=5 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 20) {
            System.out.println("Teenager");
        } else if (age >= 21 && age <= 30) {
            System.out.println("Adult");
        } else{
            System.out.println("Not expected age");
        }
    }
}
