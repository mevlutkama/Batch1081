package itjavaquestionbank2;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
        /* Type code to print the messages about the Body Mass Index(BMI) for the given BMI values
        Invalid BMI value < 0
        Underweight = <18.5
        Normal weight = 18.5–24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight and height please");
        double w = scan.nextDouble();
        double h = scan.nextDouble();
        double bmi = w / (h * h);
        if (bmi < 0) {
            System.out.println(bmi+" Invalid BMI value");
        } else if (bmi < 18.5) {
            System.out.println(bmi+" Underweight");
        } else if (bmi < 25) {
            System.out.println(bmi+" Normal weight");
        } else if (bmi < 30) {
            System.out.println(bmi+" Overweight");
        } else {
            System.out.println(bmi+" Obesity");
        }
    }
}
