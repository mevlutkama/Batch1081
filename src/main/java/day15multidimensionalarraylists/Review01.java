package day15multidimensionalarraylists;

import java.util.Arrays;

public class Review01 {
    public static void main(String[] args) {
        // Example 1: Print the elements which have “a” from a 2 dimensional String array. { {“learn”, “java”, “it”}, {“is”, “easy”} }
        String arr[][] = {{"learn", "java", "it"}, {"is", "easy"}};
        for (String[] w : arr) {
            for (String u : w) {
                if (u.contains("a")) {
                    System.out.print(u + " ");
                }
            }
        }
        System.out.println();
        // Example 2: Create an integer multidimensional array then find the sum of the elements
        int brr[][] = {{12, 54}, {3, 2, 7}, {21}};
        int sum = 0;
        for (int[] w : brr) {
            for (int u : w) {
                sum = sum + u;
            }
        }
        System.out.println(sum);
        // Example 3: Convert multidimensional array to one dimensional array
        // {{"learn", "java", "it"}, {"is", "easy"}} ==> {"learn", "java", "it", "is", "easy"}
        String crr[][] = {{"learn", "java", "it"}, {"is", "easy"}};
        int summy = 0;
        for (String[] w : crr) {
            summy = summy + w.length;
        }
        String drr[] = new String[summy];
        int idx = 0;
        for (String[] w : crr) {
            for (String u : w) {
                drr[idx] = u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(drr));
    }
}
