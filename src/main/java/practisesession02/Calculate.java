package practisesession02;

public class Calculate {
    public static void main(String[] args) {
        Calculate obj1 = new Calculate();
        System.out.println(obj1.volumeOfCube(12));
        System.out.println(obj1.volumeOfSquarePrism(12,1.85));
    }
    //Create a method to calculate volume of cube, square prism and rectangular prism.
    public double volumeOfCube(double a){
        return a*a*a;
    }
    public static double volumeOfSquarePrism(double a,double b){
        return a*a*b;
    }
    public static double volumeOfRectengularPrism(double a, double b,double c){
        return a*b*c;
    }
}
