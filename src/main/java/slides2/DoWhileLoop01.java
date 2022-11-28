package slides2;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //Write a program to print numbers from 1 to 5 on the console by using do-while loop.
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 6);
        System.out.println();

        //Write a program to print numbers from 10 to 3 on the console by using do-while loop.
        int j = 10;
        do {
            System.out.print(j + " ");
            j--;
        } while (j > 2);
        System.out.println();

        //Write a program to print numbers which are divisible by 5 between 1 and 100 on the console by using do-while loop.
        int k = 1;
        do {
            if (k % 5 == 0) {
                System.out.print(k + " ");
            }
            k++;
        } while (k < 101);
        System.out.println();

        //Write a program to print letters from c to m on the console by using do-while loop.
        char ch = 'c';
        do {
            System.out.print(ch + " ");
            ch++;
        } while (ch < 'n');
        System.out.println();
    }
}
