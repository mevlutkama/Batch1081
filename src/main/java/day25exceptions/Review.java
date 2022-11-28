package day25exceptions;

public class Review {

    public static void main(String[] args) {

   String s = "Mevlut KAMA";
   char r = getCharFromString(s,11);
        System.out.println(r);


    }
   public static char getCharFromString(String str, int idx){
        char ch = 'x';
        try {
        ch = str.charAt(idx);

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("A problem occured - "+e.getMessage());
        }
        return ch;
   }


    }


