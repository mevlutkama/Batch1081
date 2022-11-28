package slides2;

import java.util.Scanner;

public class DoWhileLoop04 {
    public static void main(String[] args) {
        //Ask user to enter a String Print the characters whose indexes are odd on the console For example; Germany ==> e m n
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word please");
        String s = scan.next();
        int i = 0;
        String p = "";
        do {
            String c = s.substring(i + 1, i + 2);
            p = p + c;
            i += 2;
        } while (i < s.length() - 1);
        System.out.println(p);
    }
}
