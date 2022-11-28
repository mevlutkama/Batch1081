package itjavaquestionbank3;

public class Ternary01 {
    public static void main(String[] args) {
        /*Use ternary to print "Valid Password" if the password has at least 8 characters different from space characters.
        "Invalid Password" if the password has less than 8 characters different from space character*/
        String pwd = "     km647    64    ";
        String res = pwd.replaceAll("\\s", "").length() > 7 ? "Valid Password" : "Invalid Password";
        System.out.println(res);

        /*Use ternary to print  a) "Isosceles Triangle" if two sides of a triangle are equal in length.
                                b) "Equilateral Triangle" if all sides of a triangle are equal in length.
                                c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied */
        double a = 10.2, b = 10.4, c = 10;
        String result1 = a == b && b == c ? "Equilateral Triangle" :
                (a == b && b != c || a == c && b != a || b == c && a != c ? "Isosceles Triangle" : "Neither isosceles, nor equilateral");
        System.out.println(result1);

        /*Use ternary to print  a) "Round up by last digit" and print the rounded value if the last digit of an integer is greater than or equal to 5
                                b) "Round down by last digit" and print the rounded value if the last digit of an integer is less than 5
                                For example; 127 will be rounded up and the value will be 130
                                125 will be rounded up and the value will be 130
                                123 will be rounded down and the value will be 120 */
        int i = 93;
        String result2 = i % 10 >= 5 ? ("Round up: " + (i / 10 + 1) * 10) : ("Round down: " + (i / 10) * 10);
        System.out.println(result2);

        /*Type Java code by using nested ternary.Write a program to check if a year is a leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.*/
        int year = 2004;
        String result3 = year % 100 == 0 ? (year % 400 == 0 ? "Leap year" : "Not leap year") : (year % 4 == 0 ? "Leap year" : "Not leap year");
        System.out.println(result3);

        /*Type code to check the password If it has more than 8 characters, initial should be 'i'
 If it does not have more than 8 characters initial should be 'K' Solve the task by using nested-ternary*/
        String p = "Iamsmkfkh";
        String result4 = p.length() > 8 ? (p.startsWith("i") ? "Valid password" : "Invalid password") :
                (p.startsWith("K") ? "Valid password" : "Invalid password");
        System.out.println(result4);
    }
}




