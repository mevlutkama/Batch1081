package itjavaquestionbank5;

public class Loops03 {
    public static void main(String[] args) {
        //Type code to print digits just in the decimal part of the given decimal number with an asterix. For example; 75.4238 ==> *4*2*3*8
        double num=75.4238;
        String s=String.valueOf(num);
        int idxOfComma=s.indexOf(".");
        String decimalPart=s.substring(idxOfComma+1);
        String e="";
        int i=0;
        do {
            String f=decimalPart.substring(i,i+1);
            e=e+"*"+f;
            i++;
        }while (i<decimalPart.length());
        System.out.println(e);
        System.out.println();
        // Type code to reverse a String. Example; Mark ==> kraM
        String str="Mark";
        String rev="";
        for (int j=str.length()-1;j>-1;j--){
            String b=str.substring(j,j+1);
            rev=rev+b;
        }
        System.out.print(rev);
    }
}
