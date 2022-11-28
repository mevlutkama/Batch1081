package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Review {

    public static void main(String[] args) throws IOException {

        readTheText();
        System.out.println();
        System.out.println();
        readText();

    }

    public static void readTheText() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\day26exceptions\\File01.txt");
        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
    }

    public static void readText(){
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day26exceptions\\File01.txt");
            int k = 0;
            while ((k = fis.read() )!= -1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.err.println("There is a problem here - "+e.getMessage());
        } catch (IOException e) {
            System.err.println("I cannot find text - "+ e.getMessage());
        }
    }

}

