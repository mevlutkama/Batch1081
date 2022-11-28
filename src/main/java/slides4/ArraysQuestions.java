package slides4;

public class ArraysQuestions {
    public static void main(String[] args) {
        // Type a program like; given an array whose length is 3, return an array with the elements "rotated left"
        // For Example: if the array is [1, 2, 3] output will be [2, 3, 1]
       /* int a [] = {1, 2, 3, 4, 5, 6};
        int b [] = new int[a.length];
        int temp [] = new int[1];
        temp[0] = a[0];
        int idx = 0;
        for (int i=1;i<a.length;i++){
            b[idx] = a[i];
            idx++;
        }
        b[a.length-1] = temp[0];
        System.out.println(Arrays.toString(b));*/

        // Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
      /*  int a [][] = {{1,2,3},{4,5,6}};
        int sum = 0;
        for (int[] w : a){
            for (int u : w){
                sum = sum+u;
            }
        }
        System.out.println(sum); */

        // Find the product of the last elements in the array elements of the given multi dimensional array { {1,2,3}, {4,5}, {6} }
       /* int arr[][] = {{1, 2, 3}, {4, 5}, {6}};
        int sum = 0;
        for (int[] w : arr) {
            sum = sum + w.length;
        }
        int idx = 0;
        int brr[] = new int[sum];
        for (int[] w : arr) {
            for (int u : w) {
                brr[idx] = u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
        System.out.println(brr[brr.length-1]); */

        /*) Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
            arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }  */
           /* int arr1 [][] = { {1,2}, {3,4,5}, {6} };
            int arr2 [][] = { {7,8,9}, {10,11}, {12} };
            int sum = 0;*/


        /*  Find the sum of the elements in the array elements of the given multi dimensional array { {1,2,3}, {4,5}, {6,7} } and return an array.
            For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13} */

        /*  Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
            For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14. Hint: Use split() */
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 sentences please");
        String sen = scan.nextLine().replaceAll("[\\p{Punct}]","");
        System.out.println(sen);
        String arr [] = sen.split(" ");
        System.out.println(Arrays.toString(arr));
        int i = arr.length;
        System.out.println(i); */

        // Write a Java program to remove a specific element from an array.
       /* int arr[] = {1, 2, 3, 4, 5, 6};
        int element = 7;
        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr, element);
        if (idx > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != element) {
                    System.out.print(arr[i] + " ");
                }
            }
        } else {
            System.out.println("There is no specific element inside the array");
}  */
    }
}