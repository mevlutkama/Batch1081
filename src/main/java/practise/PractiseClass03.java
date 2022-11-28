package practise;

public class PractiseClass03 {
    public static void main(String[] args) {
        /*Example 18: int numA = 2;
          int numB = 3;
          String str1 = “Study”
          String str2 = “Hard”
          Type a program to see the following outputs on the console by using “concatenation” operation.*/
        int numA=2;
        int numB=3;
        String str1="Study";
        String str2="Hard";
        System.out.println(str1+" "+str2);//Study Hard
        System.out.println(numA+numB+" "+str1);//5 Study
        System.out.println(str2+numA+numB);//Hard23
        System.out.println(str2+(numB-numA));//Hard1

        /*Example 19: int numA = 2;
                      int numB = 3;
                      String str1 = “Study”
                      String str2 = “Hard”
                      Type a program to see “61Study-1” as output on the console by using “concatenation” operation.*/
        System.out.println((numA*numB)+""+(numB-numA)+str1+"-"+(numB-numA));
    }
}
