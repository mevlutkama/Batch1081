package grupcalismasi;

public class Uti {
    public static int getSquare(int x){
       return x*x;
    }
    public static int sumOfDigit(int x){
        int sum = 0;
        while (x != 0){
            sum = sum+x%10;
            x/=10;
        }
        return sum;
    }
}
