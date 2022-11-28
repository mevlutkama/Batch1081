package day10loops;

import java.util.Scanner;

public class Review02 {
    public static void main(String[] args) {
        for (int i=3;i<7;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int i=3;
        while (i<7){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        int k=12;
        while (k<68){
            if(k%2!=0){
                System.out.print(k+" ");
            }
            k++;
        }
        System.out.println();
        int j=12;
        int sum=0;
        while (j<68){
            sum=sum+j;
            j++;
        }
        System.out.println(sum);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number please");
        int num=scan.nextInt();
        int sumOfDigits=0;
        while (num>0){
            sumOfDigits=sumOfDigits+num%10;
            num/=10;
        }
        System.out.println(sumOfDigits);
        System.out.println();
        System.out.println("Enter a number please");
        int n= scan.nextInt();
        int m=1;
        while (m<11){
            System.out.print(n+"x"+m+"="+n*m+" ");
            m++;
        }

    }
}
