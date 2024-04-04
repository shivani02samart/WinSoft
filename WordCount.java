// Q3:Write a Java Program to count the number of words in a string using HashMap.


import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String str = "i am a good java programmer";
        int wordCount = countWords(str);
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) {
        
        str = str.trim();

        
        String[] words = str.split("\\s+");

        
        Map<String, Integer> wordMap = new HashMap<>();

        
        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z]", "");

            
            word = word.toLowerCase();

            
            if (!word.isEmpty()) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        
        return wordMap.size();
    }
}