package practisesession01;

import java.util.Scanner;

public class Q02IfElseStatement {
    public static void main(String[] args) {
       /*Ask user to enter his weight and height. Calculate body index of the user.
      To calculate body mass index use "bodyMassIdx = weight / squareOfHeigth" formula. **
      1) body mass inx less than 18.5 ==> "You are weak". **
      2) bodyMaxInx between 18.5 -25 ==> Your weight is ideal **
      3) bodyMassIndex between 25-30 ==> You are fat **
      4) bodyMassIndex greater than 30 ==> Obese*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your weight and height");
        double w= input.nextDouble();
        double h= input.nextDouble();
        double bodyMassIdx=w/(h*h);
        if (bodyMassIdx<18.5){
            System.out.println("You are weak "+bodyMassIdx);
        } else if (bodyMassIdx<25) {
            System.out.println("Your weight is ideal "+bodyMassIdx);
        } else if (bodyMassIdx<30) {
            System.out.println("You are fat "+bodyMassIdx);
        }else {
            System.out.println("Obese "+bodyMassIdx);
        }

    }
}
