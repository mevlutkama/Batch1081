package itjavaquestionbank5;

public class Loops02 {
    public static void main(String[] args) {
        //Type code to print the unique digits in an integer. Example; 223878 ⇒ 37
        String s = "223878";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
        /*Type code to draw the following image by using a for loop.
            A A A A A
            A A A A A
            A A A A A*/
        int rows = 3;
        int columns = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
        System.out.println();
        /*Type code to draw the following image by using a for loop.
            A
            A A
            A A A
            A A A A*/
        int r = 4;
        int c = 4;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
        System.out.println();
        //Type code to create multiplication table like 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
        int num = 5;
        int k = 1;
        while (k < 11) {
            System.out.print(num + "x" + k + "=" + num * k + " ");
            k++;
        }
        System.out.println();
        //Type code to print odd integers from 20 to 3 in the same line with a space between two consecutive ones.
        int a = 20;
        do {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
            a--;
        } while (a > 2);
        System.out.println();

        //Type code to print all lowercase characters in a String with an asterix. For example; 'Ali Can?' ==> l*i*a*n*
        String e = "Ali Can";
        e = e.replaceAll("[^a-z]", "");
        String f = "";
        int i = 0;
        do {
            String g = e.substring(i, i + 1);
            f = f + g + "*";
            i++;
        } while (i < e.length());
        System.out.print(f);
    }
}
