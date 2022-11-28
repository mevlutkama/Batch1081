package day08stringmanipulationloops;

public class ForLoop01 {
    public static void main(String[] args) {
        //Example 1: Type code to print "Hi" five thousands times on the console
        //1.Way: Not recommended because there is repetition, difficult to type, difficult to maintain, difficult to update.
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //2.Way: To do repeated actions Java created "Loops"
        //There are 4 loops in Java: i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //  Starting value Condition   Increment/Decrement
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi!");
        }
        //Example 2: Type all integers from 11 to 44 in the same line with a space between consecutive integers
        for (int i = 11; i < 45; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Example 3: Type all integers from 44 to 11 in the same line with a space between consecutive integers
        for (int i = 44; i > 10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Example 4: Type even integers from 11 to 44 in the same line with a space between consecutive integers
        for (int i = 11; i < 45; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Example 5: Type odd integers from 68 to 13 in the same line with a space between consecutive integers
        for (int i = 68; i > 12; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        //Example 6: Type all integers which are divisible by 4 and not divisible by 6 from 120 to 11 in the same line with a space between consecutive integers
        System.out.println();
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

