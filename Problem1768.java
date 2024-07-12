public class Problem1768 {
    public static void main(String[] args) {
        // Your code here
    }

    public String mergeAlternately(String word1, String word2) {
        
        int n = word1.length();
        int m = word2.length();

        int i = n > m ? n : m;
        // int k = n < m ? m : n;
        StringBuilder result = new StringBuilder();

        for (int j = 0; j < i; j++) {
            
            if (j < word1.length()) {
                result.append(word1.charAt(j));
            }

            if (j < word2.length()) {
                result.append(word2.charAt(j));
            }
            
        }
        return result.toString();

    }
}