package lambdafunctionalprogramming;

import java.util.List;

public class Utils {

    public static void  printInTheSameLineWithASpace(Object o){
        System.out.print(o + " ");
    }

    public static boolean checkToBeEven(int x){
        return x%2 == 0;
    }

    public static boolean checkToBeOdd(int x){
        return  x%2 != 0;
    }

    public static int getSquare(int x){
        return x*x;
    }

    public static int getCube(int x){
        return x*x*x;
    }

    public static double getHalf(int x){
        return x/2.0;
    }

    public static char getLastChar(String s){
     return   s.charAt(s.length()-1);
    }

    public static Integer sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            sum += num %10;
            num /= 10;
        }
        return sum;
    }
}
