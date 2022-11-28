package itjavaquestionbank1;

public class StringManipulations04 {
    public static void main(String[] args) {
        /*String shirtPrice = ‘$12.99’; String bookPrice = ‘$35.99’;
        Type code to find the sum of the shirt and book prices.*/
        String shirtPrice = "$ 12.99";
        String bookPrice = "$ 35.99";
        String sp = shirtPrice.replaceAll("[\\$]", "");
        double wsp = Double.valueOf(sp);
        String bp = bookPrice.replaceAll("[\\$]", "");
        double wbp = Double.valueOf(bp);
        System.out.println(wsp + wbp);

        /*Type code to get initials of the first name and the last name of a given name. Middle name is out of scope.
Example: Tom Hanks ==> TH, Mary Star ==> MS*/
        String s="mevlut kama";
        String initialOfFirstName=s.substring(0,1).toUpperCase();
        String initialOfLastName=s.split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(initialOfFirstName+initialOfLastName);

        //Type a code to find the number of punctuation marks used in a String.
        String w = "Wow! Ali is 13 years old, but he is a university student.";
        int a=w.replaceAll("[\\P{Punct}]","").length();
        System.out.println(a);
    }
}
