package itjavaquestionbank6;

public class Loops02_30and31 {
    public static void main(String[] args) {
        /*  Each line of input contains one or several words separated with single spaces. Type code to reverse the order of words in each line of input,
         while preserving the words themselves. The lines of your output should not have any trailing or leading spaces.
            Example; Kemal Can Kuzu will be converted to Kuzu Can Kemal */
        String s="Ali Ayseyi Seviyor, cocuklar bile biliyor";
        String arr[]=s.split(" ");
        String brr[]=new String[arr.length];
        String rev="";
        int idx=0;
        for (int i=arr.length-1;i>-1;i--){
            brr[idx]=arr[i];
            idx++;
        }
       for (String w : brr){
           rev=rev+w+" ";
       }
        System.out.println(rev);

       /*   Each line of input contains one or several words separated with single spaces. Type code to reverse the order of words except the first and
        the last words in each line of input, while preserving the words themselves. The lines of your output should not have any trailing or
        leading spaces. Example; Kemal Can Tan Han Kuzu will be converted to Kemal Han Tan Can Kuzu */
        String str="cocuklar bile biliyor ali ayseyi seviyor";
        String crr[]=str.split(" ");
        String drr[]=new String[crr.length];
        String reverse="";
        int idx1=1;
        for (int j=crr.length-2;j>0;j--){
            drr[idx1]=crr[j];
            idx1++;
        }
        drr[0]=crr[0];
        drr[drr.length-1]=crr[crr.length-1];
        for (String w : drr){
            reverse=reverse+w+" ";
        }
        System.out.println(reverse);

    }
}
