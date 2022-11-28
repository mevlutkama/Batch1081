package practisesession01;

public class Q03StringManipulations {
    public static void main(String[] args) {
        /*String shirtPrice ="$ 12.99";
          String bookPrice ="$ 35.99";

        Type a code to find sum of the shirt and book prices
         */
        String shirtPrice ="$ 12.99";
        String bookPrice ="$ 35.99";
        System.out.println(shirtPrice+bookPrice);

        String shirt=shirtPrice.replace("$ ","");
        String book=bookPrice.replace("$ ","");
        System.out.println(shirt+book);

        //How can I convert to "Double"? I should use Double wrapper class and put dot.
        //We can convert Strings to double numeric values because it is not possible to operate math operations with Strings.

        double sd=Double.valueOf(shirt);//
        double bd=Double.valueOf(book);

        System.out.println(sd+bd);

    }
}
