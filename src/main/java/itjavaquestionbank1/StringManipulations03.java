package itjavaquestionbank1;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*Type code to check if a String has an uppercase initial and dot at the end.Example: For ‘Ali’ your code should
        print false on the console
        For ‘ali.’ your code should print false on the console
        For ‘ Ali. ’ your code should print false on the console
        For ‘Ali.’ your code should print true on the console
        For ‘ALI.’ your code should print true on the console*/
        String a = "Mevlut kama. ";
        String res = a.charAt(0) >= 'A' && a.charAt(0) <= 'Z' && a.charAt(a.length() - 1) == '.' ? "True" : "False";
        System.out.println(res);

        /*Type code to check if a password is valid or not for the following conditions;
        Password must have at least 8 characters different from space character
        Password must have at least 1 symbol
        Example: For ‘A2b!’ your code should print false on the console
        For ‘A2b3cdef’ your code should print false on the console
        For ‘!1a23b4’ your code should print false on the console
        For ‘!1a23b4?es’ your code should print true on the console
        For ‘! a b 3 k’ your code should print false on the console*/
        String pwd = "km647km   ";
        int numOfSymbol = pwd.replaceAll("\\s", "").replaceAll("[0-9A-Za-z]", "").length();
        String res2 = numOfSymbol > 0 && pwd.length() > 7 ? "True" : "False";
        System.out.println(res2);

        //Type code to check if a String has a specific single character or not in three different ways.
        //1.Way:
        String b = "Mevlut Kama";
        boolean result1 = b.contains("x");
        System.out.println(result1);
        //2.Way:
        boolean result2 = b.replaceAll("[^x]", "").length() > 0;
        System.out.println(result2);
        //3.Way:
        boolean result3 = b.indexOf("x") != -1;
        System.out.println(result3);
    }
}
