package day29maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {

    public static void main(String[] args) {

        // Example 1: Type code to print the number of occurence of words in a sentence
        // "I like to move it, move it do you like it?"  =>  I=1, like=2, to=1, move=2, it=3, do=1, you=1
        String sentence = "I like you like like";

        // Remove punctuation marks
        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        // Get the words from the sentence by using split() with space
        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));// [I, like, you, like, like]

        HashMap<String, Integer> occurenceMap = new HashMap<>();

                    // I, like, you, like, like
        for (String w : words){
            Integer numOfOccurence = occurenceMap.get(w);
            if (numOfOccurence==null){
                occurenceMap.put(w,1);
            }else {
                occurenceMap.put(w, numOfOccurence+1);
            }
        }
        System.out.println(occurenceMap);

        // Example 2: Type code to print the number of occurences of letters in a sentence
    }
}
