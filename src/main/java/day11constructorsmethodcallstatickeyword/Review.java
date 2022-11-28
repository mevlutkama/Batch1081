package day11constructorsmethodcallstatickeyword;

public class Review {
    public static void main(String[] args) {
        //Type code to print digits just in the decimal part of the given decimal number with an asterix. For example; 75.4238 ⇒ *4*2*3*8
        double d=75.4238;
        String str=String.valueOf(d);
        String decPart=str.split("\\.")[1];
        String s="";
        int i=0;
        do {
            String c=decPart.substring(i,i+1);
            s=s+"*"+c;
            i++;

        }while (i<decPart.length());
        System.out.println(s);
    }
}
