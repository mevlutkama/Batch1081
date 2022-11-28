package itjavaquestionbank6;

public class Arrays03 {
    public static void main(String[] args) {
        //  Count how many words start with 'a' or 'A' in a given String
        String s = "Apex is an object oriented programming language";
        String arr[] = s.split(" ");
        int counter = 0;
        for (String w : arr) {
            if (w.startsWith("a") || w.startsWith("A")) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " words start with a or A");

        //  Find the number of vowels in a String
        String str = "Java is an object oriented programming language";
        String brr[] = str.toLowerCase().split("");
        int count = 0;
        for (String w : brr) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    count++;
            }
        }
        System.out.println("The number of vovels is: " + count);

        //  Type code to find array elements whose first and last characters are same
        String crr[]={"alabama", "pick", "sos", "sets", "pex"};
        String st="";
        for (String w : crr){
            if (w.charAt(0)==w.charAt(w.length()-1)){
               st=st+w+" ";
            }
        }
        System.out.print(st);





















    }
}