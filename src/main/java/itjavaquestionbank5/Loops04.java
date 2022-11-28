package itjavaquestionbank5;

public class Loops04 {
    public static void main(String[] args) {
        /*Type code to draw the following image by using a for loop.
            A A A A A A A A
            A X X X X X X A
            A X X X X X X A
            A X X X X X X A  */
        int rows=4, columns=8;
        for (int i=1;i<=rows;i++){
            String s="";
            if (i==1 || i==rows){
                for (int j=1;j<=columns;j++){
                    s=s+"A";
                }
                System.out.println(s);
            }else {
                s=s+"A";
                for (int m=2;m<columns;m++){
                    s=s+"X";
                }
                s=s+"A";
                System.out.println(s);
            }

        }
        //Type code to find the sum of the integers from 3 to 14
        int i=3;
        int sum=0;
        do {
            sum=sum+i;
            i++;
        }while (i<15);
        System.out.println(sum);

        //Type code to find the multiplication of the integers from 3 to 9
        int mul=1;
       for (int a=3;a<10;a++){
           mul=mul*a;
       }
        System.out.println(mul);

       //Type code to print characters from 'C' to 'A' on the console by using do-while loop
       String s="";
       char ch='C';
       do {
           s=s+ch+" ";
           ch--;
       }while (ch>='A');
        System.out.println(s);
    }
}
