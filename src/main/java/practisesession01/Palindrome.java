package practisesession01;

public class Palindrome {
    public static void main(String[] args) {
        String s = "123321";
        String p = "";
        for (int i = s.length() - 1; i > -1; i--) {
            String r = s.substring(i, i + 1);
            p = p + r;
        }
        if (s.equals(p)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        System.out.println();

        String str2 = "ey edip adanada pide ye";
        String reversed2 = "";
        int j = str2.length() - 1;
        while (j > -1) {
            reversed2 = reversed2 + str2.charAt(j);
            j--;
        }
        if (str2.equals(reversed2)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
