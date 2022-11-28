package itjavaquestionbank3;

public class Ternary02 {
    public static void main(String[] args) {
        /*Type code to calculate the absolute value of a number For positive numbers and zero absolute value is the same with the number
        For negative numbers to find absolute value multiply the number by -1*/
        int i = 5;
        int abs = i >= 0 ? i : (-1 * i);
        System.out.println(abs);

        //Write a program to print the minimum of 2 integers on the console by using ternary.
        int a = 5, b = 5;
        Object min = a == b ? ("They are equal") : (a < b ? a : b);
        System.out.println(min);

        //If the number has 3 digits, the output will be “This number has 3 digits.” Otherwise, the output will be “This number has no 3 digits.”
        int d = -859;
        String res = (d > 99 && d < 1000) || (d > -1000 && d < -99) ? "This number has 3 digits" : "This number has no 3 digits";
        System.out.println(res);

        //Print 'Even' for even integers, print ‘Odd’ for odd integers by using ternary
        int c = 25;
        String r = c % 2 == 0 ? "EVEN" : "ODD";
        System.out.println(r);

        //If the number is positive print ‘Positive’, otherwise print ‘Not positive’ on the console by using ternary
        int e = -958;
        String x = e == 0 ? ("IT IS NEUTRE MAN") : (e > 0 ? "POSITIVE" : "NEGATIVE");
        System.out.println(x);
    }
}
