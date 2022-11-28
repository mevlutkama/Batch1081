package itjavaquestionbank1;

public class StringManipulations01 {
    public static void main(String[] args) {
        /*Create a String variable for city names which have just a single word. Print the city name with the initial
         is in uppercase and all the other characters are in lower cases on the console.
            Example: mIAMI should be printed as Miami
                     miami should be printed as Miami
                     MIAMI should be printed as Miami
                     mIaMi should be printed as Miami etc.*/
        String cityName = "        sivas         ";
        String updatedCityName = cityName.trim().toLowerCase();
        updatedCityName = updatedCityName.substring(0, 1).toUpperCase() + updatedCityName.substring(1);
        System.out.println(updatedCityName);

        /*Create 3 String variables for people's names. Print the sum of the number of characters in
        all the 3 names except space characters.
        Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.*/
        String names = "Ali Can5869, Merve Star, Mark Tom";
        String uploadedNames = names.replaceAll("\\d", "");
        System.out.println(uploadedNames.length());
        /* \\s means all space characters,
           \\S means characters different from space characters,
           \\d means all digit characters,
           \\D means characters different from space characters,
           \\w means all digits, all letters and _,
           \\W means characters different from all digits,all letters and _.
         */
        /*Create a String variable, print the total number of alphabetical and numeric characters in the String on the console.
        Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.*/
        String s = "    Miami 33018!!!   ";
        int numOfChars = s.replaceAll("[^0-9A-Za-z]", "").length();
        System.out.println("Total num of alphabetical and numeric characters chars: " + numOfChars);

        /*Create a String variable, print the number of non-digit characters in the String on the console.
        Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.*/
        String a = "1a3Bcf4!...";
        int b = a.replaceAll("\\d", "").length();
        System.out.println("Total number of non-digit characters: " + b);

        /*Create a String variable and print just the last non-space character on the console for any String.
        Example: For ‘Ali Can’ you should print n. For ‘Miami ’ you should print i et.*/
        String c = "Ali ayseyi seviyor      .";
        String updated = c.replaceAll("\\s", "").replaceAll("\\p{Punct}", "");
        char lastChar = updated.charAt(updated.length() - 1);
        System.out.println("The last char: " + lastChar);
    }
}
