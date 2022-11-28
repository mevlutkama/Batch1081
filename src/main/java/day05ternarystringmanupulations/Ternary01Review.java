package day05ternarystringmanupulations;

public class Ternary01Review {
    public static void main(String[] args) {
        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        int i=12;
        //1.Way: if-else
        if (i>0){
            System.out.println("The integer is positive");
        }else {
            System.out.println("The integer is not positive");
        }
        //2.Way: ternary
        String result = i>0 ? "The integer is positive" : "The integer is not positive";
        System.out.println(result);

        //Write a program to print the minimum of 2 integers on the console. Use ternary...
        double d=-1.2, e=-3;
        double min=d>e ? e : d;
        System.out.println(min);

        //Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1
        double f=-5;
        double abs=f<0 ? -1*f : f;
        System.out.println(abs);

         /*You have 2 integers;
        If both of the integers are positive do multiplication.
        Otherwise, return "I do not how to multiply"*/
        int a=-12,b=25;
        Object res = a>0 && b>0 ? a*b : "I do not how to multiply";
        System.out.println(res);

    }
}
