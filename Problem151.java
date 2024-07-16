import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem151 {

    public static void main(String[] args) {
        // Your code here
        String result = reverseWords("  hello world  ");
        System.out.println(result);
    }
    
    public static String reverseWords(String s) {
        List<String> str = new ArrayList<>(Arrays.asList(s.split(" ",-1)));
        StringBuilder sb = new StringBuilder(); 
        str.removeAll(Collections.singleton(""));
        
        Collections.reverse(str);

        int i = 0;
        while (i < str.size()) {
            // if (!str.get(i).equals("")) {
                if (i == str.size() - 1) {
                    sb.append(str.get(i));
                } else {
                sb.append(str.get(i));
                sb.append(" ");
            }
            // }
            
        i++;
        }
        
        return sb.toString();
    }
}
