package itjavaquestionbank6;

public class Loops01 {
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
        return;
    }

    public static void main(String[] args) {
        /*From a given array find all pairs whose sum is a given number. If the array is {4, 6, 5, -10, 8, 5, 20} and the number is 10 then output will be
4+6=10, 5+5=10, -10+20=10 */
        int arr[] = {4, 6, 5, -10, 8, 5, 20};
        int num = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.print(arr[i] + "+" + arr[j] + "=" + num + " ");
                }
            }
        }
        System.out.println();
        //Type a program to print the integers from 1 to 100 without using any loop.
        printNumbers(100);
    }
}
