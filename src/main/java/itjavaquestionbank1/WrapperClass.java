package itjavaquestionbank1;

public class WrapperClass {
    public static void main(String[] args) {
        //1) Type a code to find the sum of the minimum value of the byte and the maximum value of short data types.
        byte min=Byte.MIN_VALUE;
        short max=Short.MAX_VALUE;
        System.out.println(min+max);

        //2)Type a code to convert “103” String to byte and to convert “2351” String to short then print the difference on the console.
        byte first=Byte.valueOf("103");
        short second=Short.valueOf("2351");
        System.out.println(second-first);
    }
}
