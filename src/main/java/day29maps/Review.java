package day29maps;

import java.util.HashMap;

public class Review {
    public static void main(String[] args) {

        // Example 1: Type code to print the number of occurence of words in a sentence
        // "I like to move it, move it do you like it?"  =>  I=1, like=2, to=1, move=2, it=3, do=1, you=1
        String sentence = "I like to move it, move it do you like it?";
        sentence = sentence.replaceAll("\\p{Punct}","");
        String [] words = sentence.split(" ");

        HashMap<String, Integer> occurenceMap = new HashMap<>();

        for (String w : words){
            Integer occurence = occurenceMap.get(w);
            if (occurence == null){
                occurenceMap.put(w,1);
            }else {
                occurenceMap.put(w,occurence+1);
            }
        }
        System.out.println(occurenceMap);

        // Example 2: Type code to print the number of occurences of letters in a sentence
        String sen = "I like to move it, move it do you like it?";
        sen = sen.replaceAll("\\p{Punct}","").replaceAll("\\s","");
        String [] letters = sen.split("");

        HashMap<String, Integer> occurenceOfLetters = new HashMap<>();
        for (String w : letters){
            Integer occurMap = occurenceOfLetters.get(w);
            if (occurMap == null){
                occurenceOfLetters.put(w,1);
            }else {
                occurenceOfLetters.put(w,occurMap+1);
            }
        }

        System.out.println(occurenceOfLetters);
    }
}
