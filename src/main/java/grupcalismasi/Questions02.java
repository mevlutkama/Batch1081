package grupcalismasi;



public class Questions02 {
    public static void main(String[] args) {
        /*  8) Type code to find array elements whose first and last characters are same
            String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"}; */
        //String arr [] = {"alabama", "pick", "sos", "sets", "pex"};
        //for (String w : arr){
          //  if (w.charAt(0)==w.charAt(w.length()-1)){
            //    System.out.print(w+" " );
           // }
       // }

        /*
         * Type code to find the common elements between two String Arrays
         * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */
        /*String arr [] =  {"John", "Brad", "Angel", "Sofia", "Emily"};
        String brr [] =  {"sofia", "brad", "grace", "emily", "hazel"};

        for (String w : arr){
            for (String u : brr){
                if (w.equalsIgnoreCase(u)){
                    System.out.print(w+" ");
                }*/
        //5- 16) Type all characters before the first occurrence of 'm' in a String
        String sd = "Christmas";
        for (int i =0;i<sd.length();i++){
            if (sd.charAt(i)=='m'){
                break;
            }
            System.out.print(sd.charAt(i)+"");
        }
        System.out.println();
        String s = "123-Start";
        System.out.println(s.replaceAll("\\w",""));







    }
}