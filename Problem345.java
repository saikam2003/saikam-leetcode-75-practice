import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem345 {
    
    public String reverseVowels(String s) {
        String[] vowels = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };
        List<String> myList = new ArrayList<>(); 
        List<Integer> indices = new ArrayList<>(); 

        for (int i = 0; i < s.length(); i++) {
            if (Arrays.asList(vowels).contains(Character.toString(s.charAt(i)))) {
                myList.add(Character.toString(s.charAt(i)));
                indices.add(i);
            }
        }
        
        Collections.reverse(myList);

        char[] sCharArray = s.toCharArray();
        for (int j = 0; j < indices.size(); j++) {
            
            sCharArray[indices.get(j)] = myList.get(j).charAt(0);
            s = new String(sCharArray);
            
        }
        return s;
    }
}
