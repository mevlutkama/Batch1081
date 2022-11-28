package day13arrays;

import java.util.Arrays;

public class Review01 {
    public static void main(String[] args) {

        String names[]=new String[5];
        System.out.println(Arrays.toString(names));
        names[1]="Tom";
        names[4]="Mark";
        names[0]="Jim";
        names[3]="Mary";
        names[2]="Susan";
        System.out.println(Arrays.toString(names));

        int ages[]=new int[7];
        System.out.println(Arrays.toString(ages));

        ages[0]=12;
        ages[1]=23;
        ages[2]=25;
        ages[3]=14;
        ages[4]=17;
        ages[5]=12;
        ages[6]=14;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);

        double prices[]=new double[4];
        prices[0]=1.2;
        prices[1]=2.3;
        prices[2]=5.0;
        prices[3]=4.51;
        System.out.println(Arrays.toString(prices));
        double sum=0;
        for (int i=0;i<prices.length;i++){
            sum=sum+prices[i];
        }
        System.out.println(sum);

        double summy=0;
        for (double w:prices){
            summy=summy+w;
        }

        System.out.println(summy);











    }
}
