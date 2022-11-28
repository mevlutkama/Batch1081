package practisesession01;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        String str[]={"Ellie", "Susan", "Michael", "George", "Tom"};
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        int idx=Arrays.binarySearch(str,"George");
        System.out.println(idx);
        int idxM=Arrays.binarySearch(str,"Mevlut");
        System.out.println(idxM);

    }

}
