package itjavaquestionbank5;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*A number is called an Armstrong number if it equals the sum of the cube of its every digit. For example, 153 is an Armstrong number
        because of 153= 1 + 125 + 27, which equals the cube of every digit. Type a code to check if the given number is the Armstrong number or not.*/
        int num=153;
        int sumOfCubes=0;
        int temp=num;
        int digit=0;

        while (num>0){
            digit=num%10;
            sumOfCubes=sumOfCubes+digit*digit*digit;
            num/=10;
        }

        if (temp==sumOfCubes){
            System.out.println(temp+" is Armstrong number");
        }else {
            System.out.println(temp+" is not Armstrong number");
        }


    }
}
