package slides2;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
        /*Ask user to enter a name. If the name contains the letter ‘a’ then print "Won!" on the console
        otherwise ask user to enter another name. Use do-while loop.*/
        Scanner input=new Scanner(System.in);
        int counter=0;
        do {
            System.out.println("Enter a name please");
            String name= input.next();
            if (counter==2){
                System.out.println("YOU LOST");
                break;
            }
            if (name.contains("a")){
                System.out.println("YOU WON");
                break;
            }
            counter++;

        }while (counter<3);
    }
}
