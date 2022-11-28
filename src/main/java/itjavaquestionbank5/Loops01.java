package itjavaquestionbank5;

public class Loops01 {
    public static void main(String[] args) {
        //Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between two consecutive integers
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int i = 120;
        while (i > 10) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
        System.out.println();
        //Type code to print repeated characters in a String. For example; accessories ⇒ ces
        String s = "accessories";
        String rc = "";
        for (int j = 0; j < s.length(); j++) {
            String c = s.substring(j, j + 1);
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                if (!rc.contains(c)) {
                    rc = rc + c;
                }
            }
        }
        System.out.println(rc);
        /*Type code to check whether a String is palindrome or not. If a String is the same with its reverse then it is called palindrome.
        For example; “anna”, “123321” are palindromes*/
        //1.Way
        String str = "123321";
        String r = "";
        /*for (int k = str.length() - 1; k > -1; k--) {
            String p = str.substring(k, k + 1);
            r = r + p;
        }
        if (r.equals(str)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }*/
        //2.Way
        int k = str.length() - 1;
        while (k > -1) {
            String a = str.substring(k, k + 1);
            r = r + a;
            k--;
        }
        if (r.equals(str)) {
            System.out.println(str + " is palindrome");

        } else {
            System.out.println(str + " is not palindrome");

        }
    }
}
