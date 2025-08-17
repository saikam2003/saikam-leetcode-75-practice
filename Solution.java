public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i, j, lastEqualIndex = 0;
        boolean charFound = false;
        int charTraversed = 0;

        outerloop: for (i = 0; i < s.length(); i++) {
            charFound = false;
            charTraversed = 0;

            for (j = lastEqualIndex + 1; j < t.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    lastEqualIndex = j;
                    charFound = true;
                    charTraversed++;

                    if (charTraversed == s.length()) {
                        return true;
                    }
                }
            }

            if (!charFound) {
                break outerloop;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println("Is 'abc' a subsequence of 'ahbgdc'? " + solution.isSubsequence(s1, t1));

        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println("Is 'axc' a subsequence of 'ahbgdc'? " + solution.isSubsequence(s2, t2));

        String s3 = "";
        String t3 = "ahbgdc";
        System.out.println("Is an empty string '' a subsequence of 'ahbgdc'? " + solution.isSubsequence(s3, t3));

        String s4 = "b";
        String t4 = "abc";
        System.out.println("Is 'b' a subsequence of 'abc'? " + solution.isSubsequence(s4, t4));
    }
}
