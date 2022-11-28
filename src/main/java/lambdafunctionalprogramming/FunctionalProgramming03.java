package lambdafunctionalprogramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class FunctionalProgramming03 {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        printUppercase1(l);
        System.out.println();
        printUppercase2(l);
        printSortedByLength(l);
        System.out.println();
        printDistinctSortedByLastChar(l);
        System.out.println();
        printSortedByLengthThenFirstChar(l);
        //removeIfLengthGreaterThanFive(l);
        //removeIfStartWithAOrEndingWithN(l);
        lengthSquareDistinctReversed(l);
        System.out.println();
        checkLengthToBeLessThanTwelve(l);
        checkInitials(l);
        checkLastChar(l);
    }

    // 1) Create a method to print all list elements in uppercases
    // 1.Way:
    public static void printUppercase1(List<String> list){
        list.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithASpace);
    }

    // 2.Way:
    public static void printUppercase2(List<String> list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }

    // 2) Create a method to print the elements after ordering according to their lengths
    public static void printSortedByLength(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }

    // 3) Create a method to sort the distinct elements by using their last characters
    public static void printDistinctSortedByLastChar(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(System.out::println);
    }

    // 4) Create a method to sort the elements according to their lengths then according to their first character
    public static void printSortedByLengthThenFirstChar(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t-> t.charAt(0))).forEach(System.out::println);
    }

    // 5) Remove the elements if the length of the elmenet is greater than 5
    public static void removeIfLengthGreaterThanFive(List<String> list){
        list.removeIf(t-> t.length()>5);
        System.out.println("The length of all elements is less than 5: " + list);
    }

    // 6) Remove the elements if the element is starting with 'A' , 'a' or ending with 'N', 'n'
    public static void removeIfStartWithAOrEndingWithN(List<String> list){
        list.removeIf(t-> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
        System.out.println("======>" + list);
    }

    // 7) Create a method which takes the square of the length of every element, prints them distinctly in reverse order
    public static void lengthSquareDistinctReversed(List<String> list){
        list.stream().map(t-> t.length()).map(Utils::getSquare).distinct().sorted(Comparator.reverseOrder()).forEach(Utils::printInTheSameLineWithASpace);
    }

    // 8) Create a method to check is the lengths of all elements are less than 12
    public static void checkLengthToBeLessThanTwelve(List<String> list){
        boolean result = list.stream().allMatch(t-> t.length()<12);
        System.out.println(result);
    }

    // 9) Create a method to check if the initial of any element is not 'X'
    public static void checkInitials(List<String> list){
        boolean result = list.stream().noneMatch(t-> t.startsWith("X"));
        System.out.println(result);
    }

    // 10) Create a method to check if at least one of the elements ending with "R"
    public static void checkLastChar(List<String> list){
        boolean result = list.stream().anyMatch(t-> t.endsWith("R"));
        System.out.println(result);
    }













}
