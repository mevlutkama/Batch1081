package grupcalismasi;

import java.util.*;

public class Questions05 {
    public static void main(String[] args) {
        /*
        There is a lonely monkey in the island He needs to eat 4 bananas every day there are just 165 bananas in that island
    Create following variables and find how many days monkey can survive. Use do while loop, increment and decrement and if statements
    int numberOfBananas =165, survivalDays = 1; boolean monkeyAlive = true; */
        /*  int numberOfBananas = 165, survivalDays = 1;
        boolean monkeyAlive = true;
        do {
            if (numberOfBananas>3){
                survivalDays++;
                numberOfBananas -= 4;
            }else{
                monkeyAlive = false;
                break;
            }
        }while (true);
        System.out.println(survivalDays); */

        /*  AtbashCode ; It is a simple method based on the Hebrew alphabet to encrypt or decrypt a text.
 The first letter of the alphabet is used instead of the last letter. "abcdefghijklmnopqrstuvwxyz"; 26 character
"zyxwvutsrqponmlkjihgfedcba";       */

        //  int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}}; Find how many elements are there in the given array.
       /* int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};
        int sum = 0;
        for (int[] w : arr) {
            sum = sum + w.length;
        }
        System.out.println(sum); */

        //By using Iterator remove a specific element from an Integer List
       /* List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(19);
        list.add(21);
        list.add(35);
        int element = 19;
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int e = itr.next();
            if (e == element){
               itr.remove();
            }
        }
        System.out.println(list); */

        /*  Create a program checks if a String is PALINDROME or not. If a word, phrase, or sequence that reads the same backword as forward
        then it is called "palindrome", For Example : "madam" or "nursesrun". */
        String s = "ATA";
        System.out.println(isPalindrome(s));
    }public static String isPalindrome(String str){
        String p="";
        for (int i=str.length()-1; i>-1; i--){
            p = p + str.substring(i,i+1);
        }
        if (p.equals(str)){
            return "palindrome";
        }else {
            return "not palindrome";
        }
    }
}


