package replitquestions;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        /*  Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
            (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
                Input : John White 1234234534561478
                Output: Name : J*** W****
                        CCN  : **** **** **** 1478 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name, surname and credit card number please");
        String name = scan.nextLine();
        String surname = scan.nextLine();
        String card = scan.next();
        name = name.substring(0,1).toUpperCase().concat(name.substring(1).replaceAll("\\w","*"));
        surname = surname.substring(0,1).toUpperCase().concat(surname.substring(1).replaceAll("\\w","*"));
        System.out.println("Name : "+ name + " " + surname);
        if (card.length() != 16){
            System.out.println("Invalid card number");
        }else {
            card = card.substring(0,12).replaceAll("\\d","*").concat(card.substring(12));
            System.out.println("CCN : " + card);
        }




    }
}
