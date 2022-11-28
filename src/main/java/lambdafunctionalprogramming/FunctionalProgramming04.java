package lambdafunctionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming04 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        getSumOfAllElements(l);
        getSumOfIntFrom7To100A();
        getSumOfIntFrom7To100B();
        getMulOfIntFrom2To11();
        findFactorial(3);
        getSumOfEvenIntBetweenTwoInt(3,7);
        sumOfDigitsGivenInts(15,20);
    }

    // 1) Create a method to find the sum of all elements in the list
    public static void getSumOfAllElements(List<Integer> list) {
        Integer sum = list.stream().reduce(0, Math::addExact);
        System.out.println(sum);
    }

    // 2) Create a method to find the sum of integers from 7 to 100
    // 1.Way:
    public static void getSumOfIntFrom7To100A() {
        Integer sum = IntStream.range(7, 101).reduce(0, Math::addExact);
        System.out.println(sum);
    }

    // 2.Way:
    public static void getSumOfIntFrom7To100B() {
        Integer sum = IntStream.rangeClosed(7, 100).sum();// sum() ==> Returns the sum of elements in this stream
        System.out.println(sum);
    }

    // 3) Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static void getMulOfIntFrom2To11() {
        Integer result = IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
        System.out.println(result);
    }

    // 4) Create a method to calculate the factorial of a given number. (5 factorial = 1*2*3*4*5 ==> 5! = 1*2*3*4*5)
    public static void findFactorial(int x) {

        if (x < 0) {
            System.out.println("Do not use negative numbers...");
        } else {
            Integer result = IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
            System.out.println(result);
        }
    }

    // 5) Create a method to calculate the sum of even integers between given two integers
    public static void getSumOfEvenIntBetweenTwoInt(int x, int y){
        Integer sum = IntStream.rangeClosed(x,y).filter(Utils::checkToBeEven).sum();
        System.out.println(sum);
    }

    // 6) Create a method to calculate the sum of digits of every integers between two integers
    public static void sumOfDigitsGivenInts(int x, int y){
        IntStream.rangeClosed(x,y).map(Utils::sumOfDigits).forEach(Utils::printInTheSameLineWithASpace);

    }

}