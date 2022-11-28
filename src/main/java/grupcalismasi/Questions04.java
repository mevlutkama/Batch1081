package grupcalismasi;

import java.util.*;

public class Questions04 {

    public static void main(String[] args) {
        //Ask user to enter a number and then print the sum of the unique digits
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please");
        String num = scan.next();
        int sum = 0;
        for (int i=0;i<num.length();i++){
            String p = num.substring(i,i+1);
            if (num.indexOf(p) == num.lastIndexOf(p)){
                sum = sum + Integer.valueOf(p);
            }
        }
        System.out.println(sum); */

        /* Find the sum of the least and the greatest price given in a String list
           Example: List myList = new List{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70 */
      /*  List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$8.25");
        myList.add("$23.60");
        myList.add("$54.45");
        List<Double> a = new ArrayList<>();
        int idx = 0;
        for (String w : myList){
            w = w.replace("$","");
            a.add(Double.valueOf(w));
        }
        Collections.sort(a);
        double sum = a.get(0) + a.get(a.size()-1);
        System.out.println("Sum of at least and greater elements is: " + sum); */

        // Create a hashSet with this integer values {25,62, 49, 87} and then
        // print the value of each element to the screen by increasing it by 3. -->{28,65,52,90} (edited)
       /* List<Integer> hs = new ArrayList<>();
        hs.add(25);
        hs.add(87);
        hs.add(49);
        hs.add(62);
        TreeSet<Integer> h = new TreeSet<>();
        ListIterator<Integer> a = hs.listIterator();
        while (a.hasNext()){
            int i = a.next();
            i+=3;
            h.add(i);
        }
        System.out.println(h); */

        // Find max and min element in this array with help HashSet  -->{1, -5, 2, 4, 7, -6}
       /* TreeSet<Integer> a = new TreeSet<>();
        a.add(1);
        a.add(-5);
        a.add(2);
        a.add(4);
        a.add(7);
        a.add(-6);
        System.out.println("Max Element: " + a.pollFirst());
        System.out.println("Min Element: " + a.pollLast()); */

        // Make a LinkedList with the names of these programs. { PHP, SQL, HTML, C++, Java}
        // And print them on the console like that : 1a) PHP 2b) SQL 3c) HTML 4d) C++ 5e) Java
        /*  Ask user to enter 2 integer then find GCD (The Greatest Common Divisor)
            Input :
            30 and 40
            Expected OutPut:
            GCD for 30 and 40 = 10 */
       /* int a = 30;
        int b = 40;
        List<Integer> al = new ArrayList<>();
        List<Integer> bl = new ArrayList<>();
        List<Integer> cl = new ArrayList<>();
        for (int i=1;i<=30;i++){
            if (a%i==0){
                al.add(i);
            }
        }
        for (int j=1;j<=40;j++){
            if (b%j==0){
                bl.add(j);
            }
        }
        for (int w : al){
            for (int u : bl){
                if (u == w){
                    cl.add(u);
                }
            }
        }
        System.out.println(cl.get(cl.size()-1)); */





    }
}