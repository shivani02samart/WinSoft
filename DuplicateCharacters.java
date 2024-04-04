//Q4:Write a Java Program to find the duplicate characters in a string.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters 
{
    public static void main(String[] args)
     {
        String str = "i am a girl";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str)
     {
       
        Map<Character, Integer> charMap = new HashMap<>();
        
       
        char[] chars = str.toCharArray();
        
      
        for (char c : chars) {
            if (charMap.containsKey(c))
             {
              
                charMap.put(c, charMap.get(c) + 1);
            } else 
            {
               
                charMap.put(c, 1);
            }
        }
        
       
        System.out.println("Duplicate characters in the string '" + str + "':");
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) 
        {
            if (entry.getValue() > 1) 
            {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}