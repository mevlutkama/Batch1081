package testquestions;

public class DataTypes8 {
    int a = 12;
    static int age = 12;
    static char initial = 'J';

    public static void main(String[] args) {
        DataTypes8 obj = new  DataTypes8();
        System.out.println(obj.convert(20)+ obj.a);
        System.out.println(obj.myMethod('A','b'));
        System.out.println(age+initial);
        System.out.println(4<3 || 2==3 || 5>=7);
        double result = 10/2.5 +1;
        System.out.println(result);



    }
    public double convert(double mile){
        return mile*1.6;
    }
    public int myMethod(char c1, char c2){
        return c1+c2;
    }


}
