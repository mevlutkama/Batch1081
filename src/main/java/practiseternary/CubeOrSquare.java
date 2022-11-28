package practiseternary;

import java.util.Scanner;

public class CubeOrSquare {
    public static void main(String[] args) {
        /*Ask user ta enter a number. If the number is less than 10 and greater than or equal to 0, calculate its cube.
        Otherwise, calculate its square.
        Cube of a = a*a*a Square of a = a*a */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number please");
        int num = input.nextInt();

        int result = num >= 0 && num < 10 ? num * num * num : num * num;
        System.out.println(result);
    }
}
