package practise;

public class PractiseClass01 {
    public static void main(String[] args) {
    /*Example 11: Write a program to assign a value of 100.235 to a double variable
                  and then convert it to int. Print it on the console.*/
        double d = 100.235;//Explicit narrowing
        int e = (int) d;
        System.out.println(e);

    /*Example 12: Write a program to add an integer variable having value 5
                  and a double variable having value 6.2. Print the sum on the console.*/
        int i = 5;
        double j = 6.2;
        System.out.println("The sum of them is: " + (i + j));

    /*Example 13: Create an integer variable and increase it by 1, by using three different ways,
                  then type every result on the console.*/
        int k = 6;
        k = k + 1;
        System.out.println(k);
        k += 1;
        System.out.println(k);
        k++;
        System.out.println(k);

    /*Example 14: Create an integer variable and decrease it by 1, by using three different ways,
                  then type every result on the console.*/
        int l = 65;
        l = l - 1;
        System.out.println(l);
        l -= 1;
        System.out.println(l);
        l--;
        System.out.println(l);
    }
}