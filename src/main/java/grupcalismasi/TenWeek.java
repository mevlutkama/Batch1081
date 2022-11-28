package grupcalismasi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TenWeek {

    public static void main(String[] args) {
        /*
        Kullanıcıdan 10 den küçük bir tamsayı isteyin. 1 den başlayarak girilen sayıya kadar olan sayıları yazdırın,
        Ancak sayı 3 ün katı ise sayı yerine "java" yazdırın, sayı 5 in katı ise sayı yerine "güzeldir" yazdırın,
        sayı hem 3 ün hemde 5 in katı ise sayı yerine "java güzeldir" yazdırın
         */
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer which is smaller then 10");
        byte number = scan.nextByte();
        if (number % 3 == 0 && number % 5 == 0) {
            for (int i = 1; i < number; i++) {
                System.out.print(i + " ");
            }
            System.out.println("java guzeldir");
        } else if (number % 5 == 0 && number % 3 != 0) {
            for (int i = 1; i < number; i++) {
                System.out.print(i + " ");
            }
            System.out.println("guzeldir");
        } else if (number % 3 == 0 && number % 5 != 0) {
            for (int i = 1; i < number; i++) {
                System.out.print(i + " ");
            }
            System.out.print("java");
        }else {
            for (int i=1; i<=number; i++){
                System.out.print(i+" ");
            }
        } */

       /* List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        getCount(primes);
        min(primes);
        max(primes);
        System.out.println(avg(primes)); */

        /*List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        System.out.println(listOfDistictNum(numbers));*/

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        conString(G7);

        getSum(5,12);
        System.out.println(sumEven(5, 12));
        System.out.println(sumOfDigits(23, 32));
    }

    //Get count, min, max, sum, and average for numbers
    public static void getCount(List<Integer> list) {
        int count = list.size();
        System.out.println(count);
    }

    public static void min(List<Integer> list) {
        int min = list.stream().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }

    public static void max(List<Integer> list) {
        int max = list.stream().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);
    }
    public static double avg(List<Integer> list){
        double result =  (list.stream().reduce(0,Math::addExact));
        return result / list.size();
    }
    // Create List of square of all distinct numbers
    public static List<Integer> listOfDistictNum(List<Integer> list){
       return list.stream().distinct().map(Uti::getSquare).toList();
    }
    // Convert String to Uppercase and join them using coma
    public static void conString(List<String> list){
        System.out.println(list.stream().map(t -> t.toUpperCase()).collect(Collectors.toList()));
    }
    //Create a method to calculate multiplication of the integers from 3(inclusive) to 8(inclusive)
    public static int getProduct(int x, int y){
        return IntStream.rangeClosed(x,y).reduce(1,Math::multiplyExact);
    }
    //Create a method to get some of two integer(both are inclusive)
    public static int getSum(int x, int y){
        int sum = IntStream.rangeClosed(x, y).reduce(0,Math::addExact);
        return sum;
    }
    //create a method to calculate the sum of even integers between given two integer
    public static int sumEven(int x, int y){
        int sum = IntStream.rangeClosed(x,y).filter(t->t%2==0).reduce(0,Math::addExact);
        return sum;
    }
    // create a method to calculate the sum of digits of every integers between given to integers
    // 23 and 32 ==> 2+3 2+4 2+5 2+6 2+7 2+8 2+9 3+0 3+1 3+2 ==> for each some parts
    public static int sumOfDigits(int x, int y){
        int sum = IntStream.rangeClosed(x, y).map(Uti::sumOfDigit).sum();
        return sum;
    }
}
