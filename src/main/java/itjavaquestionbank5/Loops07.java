package itjavaquestionbank5;

import java.util.Scanner;

public class Loops07 {
    public static void main(String[] args) {
        /*  Get a String and a character from user Count the number of characters between the first occurrence and the last occurrence of the
given character in the String Do not count the space charactersIf the character which user selected is displayed just once in the String return -1
If the character which user selected does not exist in the String return -1
            For example; "Java is easy" - 'a' ==> 5
            "Java is easy" - 'w' ==> -1
            "Java is easy" - 'e' ==> -1   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String and character");
        String s = scan.nextLine();
        char ch = scan.next().charAt(0);
        int firstOccIdx = s.indexOf(ch);
        int lastOccIdx = s.lastIndexOf(ch);
        int counter = 0;

        if (firstOccIdx == lastOccIdx) {
            System.out.println(-1);
        } else {
            for (int i = firstOccIdx + 1; i < lastOccIdx; i++) {
                if (s.charAt(i) != ' ') {
                    counter++;
                }
            }
            System.out.println(counter);
        }

    }


}

