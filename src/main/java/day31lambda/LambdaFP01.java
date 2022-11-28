package day31lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaFP01 {

    /*
            The Lambda expression is used to provide the implementation of an interface which has functional interface.
     It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing
     the implementation.
            A lambda expression is a short block of code which takes in parameters and returns a value.
     Lambda expressions are similar to methods, but they do not need a name and they can be implemented
     right in the body of a method.
            Functional programming is called lambda . To type codes in functional programming is shorter and it is error free.
     In functional programming, we use the methods that were created by Java.
     The usage of structured programing is a longer way to type codes in Java.
            For example; substring() is created by Java it is error free because it was created by Java which means that it was tested
     thousands of times before it was deployed. Functional programming can be used for arrays, collections and maps
     but we cannot use maps directly in functional programming directly. At the beginning we should convert a map to a
     collection and then we can use maps for functional programming as well ==>How to convert a map into a collection??
     by using entryset() we can convert a map into a set and set is collection then you can use Collections in functional programming.
            1) Lambda is functional programming, IT field started to use Lambda in Java 8.
            2) In Functional Programming we focus on "What to do?" but in Structured Programming Language we focus on "How to do?"
            3) Functional Programming can be used just with Arrays and Collections
            4) By using "entrySet()" method java convert Map to Set then you can use Functional Programming in Maps as well.
     */

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        printElements(l);
        System.out.println();
        printElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctOddElements(l);
        System.out.println();
        sumOfSquaresOfDistinctEvenElements(l);
        productOfCubesOfDistinctEvenElements(l);
        getMaxElement01(l);
        getMaxElement02(l);
        getMinElement01(l);
        getMinElement02(l);
        getMinElement03(l);

    }
    // 1) Create a method to print the elements on the console in the same line with a space
    // between two consecutive elements. (Structured Programming)
    public static void printElements(List <Integer> list){
        for (Integer w : list){
            System.out.print(w+ " ");
        }
    }

    public static void printElementsFunctional(List<Integer> list){
        list.stream().forEach(t -> System.out.print(t*2 + " "));
    }

    // 2) Create a method to print the even elements in the list on the console in the same line with a space
    // between two consecutive elements. (Structured Programming)

    public static void printEvenElementsStructured(List<Integer> list){
        for (Integer w : list){
            if (w%2 == 0){
                System.out.print(w + " ");
            }
        }
    }
    public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter(t-> t%2 == 0).forEach(t -> System.out.print(t+" "));
    }

    // 3) Create a method to print the square of odd list elements on the console in the  same line with a space between
    // two consecutive elements
    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(t-> t%2 != 0).map(t-> t*t).forEach(t-> System.out.print(t + " "));
    }

    // 4) Create a method to print the cube of distinct odd list elements on the console in the same line
    // with a space between two consecutive elements.
    public static void printCubeOfDistinctOddElements(List<Integer> list){
        list.stream().distinct().filter(t-> t%2 != 0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));
    }

    // 5) Create a method to calculate the sum of the squares of distinct even elements.
    public static void sumOfSquaresOfDistinctEvenElements(List<Integer> list){
        Integer sum = list.stream().distinct().filter(t-> t%2 == 0).map(t-> t*t).reduce(0,(t , u)-> t+u);
        System.out.println(sum);
    }

    // 6) Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list){
        Integer product = list.stream().distinct().filter(t-> t%2 == 0).map(t-> t*t*t).reduce(1,(t, u) -> t*u);
        System.out.println(product);

    }

    // 7) Create a method to find the maximum value from the list elements
    // 1.Way:
    public static void getMaxElement01(List<Integer> list){
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t>u ? t : u);
        System.out.println(max);
    }
    public static void getMaxElement02(List<Integer> list){
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u); // sorted() method always puts the elements in ascending order
        System.out.println(max);
    }

    // Homework: 8) Create a method to find the minimum value from the list elements(in 2 ways).
    // 1.Way:
   public static void getMinElement01(List<Integer> list){
        int min = Integer.MAX_VALUE;
        for (int w : list){
            min = Math.min(min,w);
        }
        System.out.println(min);
    }
    // 2.Way:
    public static void getMinElement02(List<Integer> list){
        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u) -> t>u ? u : t);
        System.out.println(min);
    }

    // 3.Way:
    public static void getMinElement03(List<Integer> list){
        Integer min = list.stream().distinct().sorted().findFirst().get();
        System.out.println(min);
    }


}