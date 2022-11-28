package testquestions;

public class Varargs {
    public static void main(String[] args) {
        m1(10);
        m1(11,12,13,14);
        m2("Java",101,102);

    }
    static void m1(int... a){
        System.out.println("==>"+a.length);
        for (int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void m2(String str, int... a){
        System.out.println(str);
        for (int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
