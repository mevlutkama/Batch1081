package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str="Java is easy";
        boolean isExist=str.contains("Java");
        System.out.println(isExist);//true

        boolean result=str.startsWith("J");
        System.out.println(result);

        //if you use startsWith() method with 2 parameters, second parameter means skip the first characters
        boolean res=str.startsWith("i",5);
        System.out.println(res);

        /*Example 1: Check if the given password
                    i) has "A" in any position
                    ii) has "xv" at the beginning
                    iii) has "W" as 7th character
                    iv) has 8 characters in total*/
        String pwd="xy1AmSW?";
        //i) has "A" in any position
        boolean firstRule=pwd.contains("A");
        //ii) has "xv" at the beginning
        boolean secondRule=pwd.startsWith("xy");
        //iii) has "W" as 7th character
        boolean thirdRule=pwd.startsWith("W",6);
        //iv) has 8 characters in total
        boolean fourthRule=pwd.length()==8;
        System.out.println("Is the password valid? "+(firstRule && secondRule && thirdRule && fourthRule));

        String s="Do practise to be better";
        boolean rslt=s.endsWith("better");
        System.out.println(rslt);//true

        String t=s.concat("!").concat("...");//concat() method is same with the "+" in Java.
                                                    //If you use multiple methods side by side, it is called "method chain"
        System.out.println(t);
    }
}
