package day15multidimensionalarraylists;

public class Review02 {
    public static void main(String[] args) {
        // Example 1: Find the maximum element in a two dimensional array
        //            {{5, 0}, {-2, 4}, {65, -12, 23}}
        int arr[][]={{5, 0}, {-2, 4}, {65, -12, 230}};
        int max=arr[0][0];
        for (int[] w:arr){
            for (int u : w){
               max=Math.max(max,u) ;//if (u>max){
                  //  max=u;
                //}
            }
        }
        System.out.println(max);
    }
}
