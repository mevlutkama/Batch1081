package lambdafunctionalprogramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming01 {

    /*
            1) Lambda is Functional Programming
            2) Functional Programming was added to Java in Java 8, before Java 8 we were using just Structured Programming but after Java 8
               we are able to use both Functional Programming and Structured Programming
            3) Structured Programming focuses on "How to do" most of the times, Functional Programming focuses on "What to do"
            4) Functional Programming is used with Collections and Arrays
     */

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(131);
        l.add(14);
        l.add(9);
        l.add(10);
        l.add(4);
        l.add(12);
        l.add(15);
        printElStructured(l);
        System.out.println();
        printElFunctional(l);
        System.out.println();
        printEvenEleStructured(l);
        System.out.println();
        printEvenEleFunctional(l);
        System.out.println();
        printSquareOfOdd(l);
        System.out.println();
        printCubeOfDisOddEle(l);
        System.out.println();
        sumOfSquaresOfDisEvenEle(l);
        productOfCubeDisEvens(l);
        getMaxElement1(l);
        getMaxElement2(l);
        getMinElement1(l);
        getMinElement2(l);
        getMinEleGreaterThanSeven1(l);
        getMinEleGreaterThanSeven2(l);
        getHalfOfDistinctEleReversed(l);
    }

    // 1) Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    public static void printElStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    public static void printElFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }

    // 2) Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)
    public static void printEvenEleStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    public static void printEvenEleFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));// t-> t%2==0 ==> "Lambda Expression"
    }

    // 3) Create a method to print the square of odd list elements on the console in the same line with a space betwen two consecutive elements
    public static void printSquareOfOdd(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));// map() is used to change the value of elements
    }

    // 4) Create a method to print the cube of distinct odd elements on the console in the same line with a space between two consecutive elements.
    public static void printCubeOfDisOddEle(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));// distinct() removes repeated ones
    }

    // 5) Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquaresOfDisEvenEle(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println("The sum of the squares of even elements is: " + sum);
    }

    // 6) Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubeDisEvens(List<Integer> list) {
        Integer product = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println("The product cubes of distinct evens: " + product);
    }

    // 7) Create a method to find the maximum value from the list elements
    // 1.Way:
    public static void getMaxElement1(List<Integer> list) {
        Integer maxEl = list.stream().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println("The max element is: " + maxEl);
    }

    // 2.Way:
    public static void getMaxElement2(List<Integer> list) {
        // sorted() ==> Returns a stream consisting of the elements of this stream, sorted according to natural order.
        Integer maxEl = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println("The max element is: " + maxEl);
    }

    // 8) Create a method to find the minimum value from the list elements
    // 1.Way:
    public static void getMinElement1(List<Integer> list) {
        Integer minEl = list.stream().reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println("The min element is: " + minEl);
    }

    // 2.Way:
    public static void getMinElement2(List<Integer> list) {
        Integer minEl = list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println("The min element is: " + minEl);
    }

    // 9) Create a method to find the minimum value which is greater than 7 and even from the list
    // 1.Way:
    public static void getMinEleGreaterThanSeven1(List<Integer> list) {
        Integer minEl = list.stream().distinct().filter(t -> t > 7 && t % 2 == 0).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("The min element is: " + minEl);
    }

    // 2.Way:
    public static void getMinEleGreaterThanSeven2(List<Integer> list) {
        // Use findFirst() together with get() to get Integer return type
        Integer minEl = list.stream().distinct().filter(t -> t > 7 && t % 2 == 0).sorted().findFirst().get();
        System.out.println("The min element is: " + minEl);
    }

    // 10) Create a method to find the half of the elements which are distinct and greater than 5 in reverse order from the list.
    public static void getHalfOfDistinctEleReversed(List<Integer> list) {
        List<Double> result = list.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Half of the elements list: " + result);
    }
}