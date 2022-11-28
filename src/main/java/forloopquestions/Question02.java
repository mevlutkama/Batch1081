package forloopquestions;

public class Question02 {
    public static void main(String[] args) {
        //Write a program to add counting numbers from 23 to 57 by using for-loop. Print the sum on the console
        int sumOfNum = 0;
        for (int i = 23; i < 58; i++) {
            System.out.print(i + " ");
            sumOfNum = sumOfNum + i;
        }
        System.out.println("                                                                    ");
        System.out.println("The sum of these numbers: " + sumOfNum);

        //Write a program to multiply counting numbers from 7 to 15 by using for-loop. Print the multiplication on the console
        int mulOfNum=1;
        for (int i=7;i<16;i++){
            System.out.print(i+" ");
            mulOfNum=mulOfNum*i;
        }
        System.out.println("                                                                     ");
        System.out.println("The multiplication of these numbers: "+mulOfNum);

        //Write a program to print counting numbers which are less than 200 and divisible by 5 On the console by using for-loop.
        for (int i=200;i>=0;i--){
            if (i%5==0){
                System.out.print(i+" ");
            }
        }
    }
}
