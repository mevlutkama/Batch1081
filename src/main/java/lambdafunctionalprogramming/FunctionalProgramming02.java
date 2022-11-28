package lambdafunctionalprogramming;

/*
        1) Method References  : Class Name :: Method Name without method parenthesis
        Example ==>             String :: length
                                ArrayList :: size
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming02 {

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
        printElFunctional(l);
        System.out.println();
        printEvenEleFunctional(l);
        System.out.println();
        printSquareOfOdd(l);
        System.out.println();
        sumOfSquaresOfDisEvenEle(l);
        productOfCubeDisEvens(l);
        getMaxElement1(l);
        getMinElement1(l);
        getMinEleGreaterThanSeven1(l);
        getHalfOfDistinctEleReversed(l);
    }

    // 1) Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Method Reference)
    // If Java has any method we prefer to use it, if Java does not have it we create the method inside Utils Class and use it.
    public static void printElFunctional(List<Integer> list) {
        list.stream().forEach(Utils::printInTheSameLineWithASpace);
    }

    // 2) Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Method Reference)
    public static void printEvenEleFunctional(List<Integer> list) {
        list.
                stream().
                filter(Utils::checkToBeEven).
                forEach(Utils::printInTheSameLineWithASpace);// t-> t%2==0 ==> "Lambda Expression"
    }

    // 3) Create a method to print the square of odd list elements on the console in the same line with a space betwen two consecutive elements
    public static void printSquareOfOdd(List<Integer> list) {
        list.
                stream().
                filter(Utils::checkToBeOdd).
                map(Utils::getSquare).
                forEach(Utils::printInTheSameLineWithASpace);
    }

    // 4) Create a method to print the cube of distinct odd elements on the console in the same line with a space between two consecutive elements.
    public static void printCubeOfDisOddEle(List<Integer> list) {
        list.
                stream().
                distinct().
                filter(Utils::checkToBeOdd).
                map(Utils::getCube).
                forEach(Utils::printInTheSameLineWithASpace);
    }

    // 5) Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquaresOfDisEvenEle(List<Integer> list) {
        Integer sum = list.
                            stream().
                            distinct().
                            filter(Utils::checkToBeEven).
                            map(Utils::getSquare).
                            reduce(0, Math::addExact);
        System.out.println("The sum of the squares of even elements is: " + sum);
    }

    // 6) Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubeDisEvens(List<Integer> list) {
        Integer product = list.
                                stream().
                                distinct().
                                filter(Utils::checkToBeEven).
                                map(Utils::getCube).
                                reduce(1, Math::multiplyExact);
        System.out.println("The product cubes of distinct evens: " + product);
    }

    // 7) Create a method to find the maximum value from the list elements
    public static void getMaxElement1(List<Integer> list) {
        Integer maxEl = list.stream().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("The max element is: " + maxEl);
    }

    // 8) Create a method to find the minimum value from the list elements
    public static void getMinElement1(List<Integer> list) {
        Integer minEl = list.
                            stream().
                            reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("The min element is: " + minEl);
    }

    // 9) Create a method to find the minimum value which is greater than 7 and even from the list
    public static void getMinEleGreaterThanSeven1(List<Integer> list) {
        Integer minEl = list.
                            stream().
                            distinct().
                            filter(t -> t > 7 ).
                            filter(Utils::checkToBeEven).
                            reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("The min element is: " + minEl);
    }

    // 10) Create a method to find the half of the elements which are distinct and greater than 5 in reverse order from the list.
    public static void getHalfOfDistinctEleReversed(List<Integer> list) {
        List<Double> result = list.
                                    stream().
                                    distinct().
                                    filter(t -> t > 5).
                                    map(Utils::getHalf).
                                    sorted(Comparator.reverseOrder()).
                                    collect(Collectors.toList());
        System.out.println("Half of the elements list: " + result);
    }
}
