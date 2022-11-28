package itjavaquestionbank5;

public class Loops05 {
    public static void main(String[] args) {
        //Type all characters before the first occurrence of 'm' in a String
        String s = "Cristmas";
        String result = "";
        int i = 0;
        do {
            String c = s.substring(i, i + 1);
            if (c.equals("m")) {
                break;
            }
            result = result + c;
            i++;
        }
        while (i < s.length());
        System.out.println(result);

        //Type code to find the sum of the digits in an integer
        int j = -85;
        j = Math.abs(j);
        int sum = 0;
        do {
            sum = sum + j % 10;
            j /= 10;
        } while (j > 0);
        System.out.println(sum);

        // Type code to print unique characters in a String. For example; Hello ==> Heo
        String str = "Hello";
        int a = 0;
        do {
            String b = str.substring(a, a + 1);
            if (str.indexOf(b) == str.lastIndexOf(b)) {
                System.out.print(b);
            }
            a++;

        } while (a < str.length());
    }
}





