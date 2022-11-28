package practise;

import java.util.Scanner;

public class GradeQuestion {
    public static void main(String[] args) {
        /*Type java code by using if-else if() statement. A school has following rules for grading system:
        1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From 80 to 100 - A
        Ask user to enter marks and print the corresponding grade.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score please");
        byte score = input.nextByte();

        if (score < 0) {
            System.out.println("Invalid Score");
        } else if (score < 50) {
            System.out.println("D");
        } else if (score < 60) {
            System.out.println("C");
        } else if (score < 81) {
            System.out.println("B");
        } else if (score < 101) {
            System.out.println("A");
        } else {
            System.out.println("Invalid Score");
        }
    }
}
