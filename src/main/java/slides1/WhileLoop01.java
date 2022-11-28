package slides1;

public class WhileLoop01 {
    public static void main(String[] args) {
        //  Type java code by using while loop, Write a program to print numbers from 1 to 5.
        int i=1;
        while (i<6){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //  Type java code by using while loop. Write a program that types first 30 consecutive odd integers.
        int j=0;
        while (j<61){
            if (j%2!=0){
                System.out.print(j+" ");
            }
            j++;
        }
    }
}
