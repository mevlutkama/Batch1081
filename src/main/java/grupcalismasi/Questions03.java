package grupcalismasi;

import java.util.HashMap;
import java.util.Scanner;

public class Questions03 {

    public static void main(String[] args) {
        /* Write java code checking the number is Perfect number or not. Any number can be a Java Perfect Number if the sum of its positive divisors
           excluding the number itself is equal to that number. */
        /*int num = 6;
        int sum = 0;
        for (int i=1;i<num ;i++){
            if (num%i == 0){
                sum += i;
            }
        }
        String res = sum == num ? num + " Perfect Number" : num + " is not Perfect Number";
        System.out.println(res); */

        // Type a code  to find the duplicate values of an array of integer values.
       /* int arr [] = {1,5,8,9,5,8};
            for (int i=0;i< arr.length;i++){
                for (int k=i+1;k<arr.length;k++){
                    if (arr[i] == arr[k]){
                        System.out.print(arr[i]+" ");
                }
            }
        } */

        // Type a program which gets integer values from the user and stops by displaying "Done" when the sum of these values is grater than 100
      /* Scanner scan = new Scanner(System.in);
        int sum = 0;
        do {
            System.out.println("Enter integer please");
            int num = scan.nextInt();
            sum = sum+num;

        }while (sum < 100);
        System.out.println("Sum is : " + sum+ " DONE"); */

        /* A four-digit number ABCD is called  Lucky if A+B = C+D Write a program that asks the user to enter a four-digit number and
           tell if the number is a lucky number or not Example: 3719 ==> 3+7 = 1+9  This is a Lucky number */

        // Create a method to count all words in a string get the string from user
        String str = "I like to move it move it move it";
        countWords(str);

        // Create a method to count all characters different from space in a string get the string from user
        System.out.println(countCharacters(str));

    }

    public static void countWords(String s) {
        HashMap<String, Integer> a = new HashMap<>();
        s = s.replaceAll("\\p{Punct}", "");
        String arr[] = s.split(" ");
        for (String w : arr) {
            Integer numOfOccurence = a.get(w);
            if (a.get(w) == null) {
                a.put(w, 1);
            } else {
                a.put(w, numOfOccurence + 1);
            }
        }
        System.out.println(a);
    }
    public static int countCharacters(String s){
       s = s.replaceAll("\\p{Punct}","").replaceAll(" ","");
       return s.length();
    }

}

