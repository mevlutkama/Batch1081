package grupcalismasi;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        // Question 6: Get two String from user and create a function to be able to find this Strings are anagram or not?
        // For example: RAKI and IRAK are anagram
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two String");
        String a = scan.nextLine();
        String b = scan.nextLine();
        if (isAnagram(a, b)) {
            System.out.println("YES, These 2 Strings are ANAGRAM");
        } else {
            System.out.println("NO, These 2 Strings are not ANAGRAM");
        }

        // Question 9: Find the sum of the elements in the array elements of the given multi dimensional array { {1,2,3}, {4,5}, {6,7} } and return an array.
        // For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13} */

        // Question 10: Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
        //            arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }  */


    }


        public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) - 1);
                if (hm.get(c) == 0) {
                    hm.remove(c);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}