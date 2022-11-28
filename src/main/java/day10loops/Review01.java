package day10loops;

import java.util.Scanner;

public class Review01 {
    public static void main(String[] args) {
        for (int i=1;i<5;i++){
            System.out.println("Week: "+i);
            for (int j=1;j<8;j++){
                System.out.println("  Day: "+j);
            }
        }
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of the rows");
        int row= input.nextInt();
        System.out.println("Enter the number of columns");
        int column=input.nextInt();

        for (int i=1;i<=row;i++){
            for (int k=1;k<=column;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Enter the number of the rows");
        int numOfRows= input.nextInt();
        for (int i=1;i<=numOfRows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
