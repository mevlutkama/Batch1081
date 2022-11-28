package practisesession03;

import java.time.LocalDate;
import java.util.Scanner;

public class Questions {

    String productName;
    double productPrice;
    String expirationDate;

    public Questions(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Questions(String name, double price, int monthLeft) {
        productName = name;
        productPrice = price;
        expirationDate = LocalDate.now().plusMonths(monthLeft).toString();
    }


}
