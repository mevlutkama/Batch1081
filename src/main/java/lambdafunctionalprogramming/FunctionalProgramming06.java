package lambdafunctionalprogramming;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FunctionalProgramming06 {

    public static void main(String[] args) throws IOException {

        // How to read text from the file
        Files.lines(Paths.get("src\\main\\java\\lambdafunctionalprogramming\\LambdaTextFile.txt")).forEach(System.out::println);
        System.out.println("==================");

        // How yo convert all characters in the file to uppercase
        Files.lines(Paths.get("src\\main\\java\\lambdafunctionalprogramming\\LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        // How to check if a specific word(Lambda) exists in the text
        boolean result = Files.lines(Paths.get("src\\main\\java\\lambdafunctionalprogramming\\LambdaTextFile.txt")).anyMatch(t-> t.contains("Lambda"));
        System.out.println(result);

        // Print distinct words on the console in the file
        Files.
                lines(Paths.get("src\\main\\java\\lambdafunctionalprogramming\\LambdaTextFile.txt")).
                map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                distinct().
                forEach(Utils::printInTheSameLineWithASpace);

        System.out.println("=====================");

        // Get the words which end with "e" and print them on the console
        Files.
                lines(Paths.get("src\\main\\java\\lambdafunctionalprogramming\\LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t-> t.endsWith("e")).
                forEach(Utils::printInTheSameLineWithASpace);

    }
}
