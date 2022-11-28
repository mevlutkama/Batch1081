package itjavaquestionbank1;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Create a String variable and find the sum of the ASCII values of the first and the last characters of the String.
        String s = " Miami ";
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);
        System.out.println("The sum of ASCII values of first and last character: " + (firstChar + lastChar));

        /*) Create a String variable and print all characters except the first character on the console.
 Example:If the String is ‘Java’ you should print ‘ava’ on the console.*/
        String a = "Java";
        a = a.substring(1);
        System.out.println(a);

        /*Create a String variable and print all characters except the last character on the console in uppercases.
        Example:If the String is ‘Java’ you should print ‘JAV’ on the console*/
        String b = "Java";
        b = b.substring(0, b.length() - 1).toUpperCase();
        System.out.println(b);

        /*Create a String variable and print all characters except the first character and the last character on the console
         in uppercases. Example:If the String is ‘Java’ you should print ‘AV’ on the console.*/
        String m = "Mevlut Kama";
        m = m.substring(1, m.length() - 1).toUpperCase();
        System.out.println(m);

        /*Type code to check if a String has just a single space character any position in the middle Example: For ‘Ali  Can’ your code should print false
        on the console For ‘ Ali Can ’ your code should print false on the console
        For ‘ Ali Can ’ your code should print false on the console
        For ‘Ali Can’ your code should print true on the console*/
        String k = "Mevlut Kama";
        int numOfSpace = k.replaceAll("\\S", "").length();
        if (numOfSpace == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        String res = numOfSpace == 1 ? "True" : "False";
        System.out.println(res);

        /*Type code to check if a String does not have any space character at the beginning and at the end?
        Example: For ‘ Ali ’ your code should print false on the console For ‘Ali’ your code should print true on the console*/
        String c = "Mevlut Kama";
        String result = c.charAt(0) == ' ' && c.charAt(c.length() - 1) == ' ' ? "False" : "True";
        System.out.println(result);
    }
}
