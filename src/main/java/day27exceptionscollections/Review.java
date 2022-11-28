package day27exceptionscollections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Review {
    public static void main(String[] args) {

       readText();

    }
    public static void  readText(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\day26exceptions\\File01.txt"));
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
