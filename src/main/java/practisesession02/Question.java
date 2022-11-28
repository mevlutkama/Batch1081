package practisesession02;

import java.util.Scanner;

public class Question {
    /* public static void main(String[] args) {
         String str = "12587 12$ po";
         sumOfDIgits(str); */
    // Count the frequency of the letters in a given String as the format below.
    // Input: String str = "Java is so good";
    // Output: String strOutput = "J1 a2 v1 i1 s2 o3 g1 d1"
   /* public static void main(String[] args) {

        String str = "Java is so good";
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (!output.contains(String.valueOf(str.charAt(i)))) {
                output = output + str.charAt(i) + counter + " ";
            }

        }
        System.out.println(output);
    } */
   /* public static  int sumOfDIgits(String s){
        int result = 0;
        s = s.replaceAll("[^0-9]","");
        for (int i =0;i<s.length();i++){
            String p = s.substring(i,i+1);
            result = result + Integer.valueOf(p);
        }
        System.out.println(result);
        return result; */

    public static void main(String[] args) {
        // Ask user to enter to numbers than swap them.
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double n1 = input.nextDouble();

        System.out.println("Enter second number");
        double n2 = input.nextDouble();

        System.out.println("Before swapping n1=" + n1 +" and"+" n2=" + n2); */
        //1.Way:
       /*double temp = 0;
        temp = n2;
        n2 = n1;
        n1 = temp;
        System.out.println("After swapping n1=" + n1 +" and"+" n2=" + n2);*/
        //2.Way:
       /* n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After swapping n1=" + n1 +" and"+" n2=" + n2);*/

        // Create a method from a given array and find all pairs of the integers whose sum is a given number.
        // {4,6,5,-10,8,5,20} ==> 10
        int [] arr = {4,6,5,-10,8,5,20};
        int element = 10;
        findPairs(arr,element);
    }
    public static void findPairs(int [] arr, int num){
        for (int i= 0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] + arr[j] == num){
                    System.out.print(arr[i]+" and "+arr[j]+" ");
                }
            }
        }
    }
}

