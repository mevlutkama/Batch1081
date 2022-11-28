package itjavaquestionbank5;

public class Loops06 {
    public static void main(String[] args) {
        //Find the total number of characters different from space and punctuation marks in a String.
        String s="Java is a strongly typed, object-oriented programming language.";
        int numberOfCharacters=s.replaceAll("\\p{Punct}","").replaceAll("\\s","").length();
        System.out.println(numberOfCharacters);

        /*Type code to draw the following image by using a for loop.
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *                  */
        int term=6;
        for (int i=1;i<=term;i++){
            for (int k=term;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //Type code to find the sum of the unique digits of an integer Example: 12133455 ==> 2+4=6
        String num="12345";
        int sum=0;
        for (int a=0;a<num.length();a++){
            String b=num.substring(a,a+1);
            if (num.indexOf(b)==num.lastIndexOf(b)){
                sum=sum+Integer.valueOf(b);
            }
        }
        System.out.println(sum);

        //Type code to print integers from 3 to 9 except 5
        for (int a=3;a<10;a++){
            if (a==5){
                continue;
            }
            System.out.print(a+" ");
        }

    }
}
