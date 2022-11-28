package practisesession02;

public class Practise {
    public static void main(String[] args) {
        //Create a method that adds given integers except the first one and multiplies the sum by the first integer. a*(b+c+d+f)
    myMethod(7,4,6,-7,100);
    myMEthod(20.6,5,7);

    }
    public static void myMethod(int a,int... b){
        int sum =0;
        for (int w:b){
            sum+=w;
        }
        System.out.println(a*sum);
    }

    public static void myMEthod(double a, int... b){
        int sum = 0;
        for (int w:b){
            sum+=w;
        }
        System.out.println(a*sum);
    }

    public static void myMethod(double a, double... b){
        int sum=0;
        for (double w:b){
            sum+=w;
        }
        System.out.println(a*sum);
    }
}
