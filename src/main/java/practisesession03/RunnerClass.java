package practisesession03;

public class RunnerClass {

    public static void main(String[] args) {

        calculateAverage("Mevlut kama",85,56,94);


    }
    public static void calculateAverage(String name, double... grade){
        double sum = 0;
        for (double w : grade){
            sum += w;
        }
        System.out.println(name+"'s Average of Exams: "+ String.format("%.2f", sum/ grade.length));
    }
}
