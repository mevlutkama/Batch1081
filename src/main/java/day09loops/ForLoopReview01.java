package day09loops;

public class ForLoopReview01 {
    public static void main(String[] args) {
        //Example 1: Type code to reverse a String.
        //          For example:Tom ==> moT
        String name = "Mark";
        String reversedName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            char ch = name.charAt(i);
            reversedName = reversedName + ch;
        }
        System.out.print(reversedName);
        System.out.println();

        //Example 2: Find the sum of the integers from 3 to 6
        int sum=0;
        for (int i=3;i<7;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        //Example 3: Find the multiplication of the integers from 3 to 6
        int multiplication=1;
        for (int i=3;i<7;i++){
            multiplication=multiplication*i;
        }
        System.out.println(multiplication);

        //Example 4: Type code to find sum of the digits of an integer
        int num=-58;
        num=Math.abs(num);
        int sumOfDigits=0;
        for (int i=num;i>0;i/=10){
            sumOfDigits=sumOfDigits+i%10;
        }
        System.out.println(sumOfDigits);
    }
}
