public class Problem392 {
    public boolean isSubsequence(String s, String t) {
        // int i, j, lastEqualIndex = 0;
        // boolean charFound = false;
        // int charTraversed = 0;

        // outerloop:
        // for (i = 0; i < s.length(); i++) {

        //     charFound = false;

        //     charTraversed = 0;

        //     for (j = lastEqualIndex + 1; j < t.length(); j++) {
        //         if (s.charAt(i) == s.charAt(j)) {
        //             lastEqualIndex = j;
        //             charFound = true;
        //             charTraversed++;

        //             if (charTraversed == s.length()) {
        //                 return true;
        //             }
        //         }
        //     }

        //     if (!charFound) {
        //         break outerloop;
        //     }

        // }
        // return false;

        int i = 0;
        int j = 0;
        int start_index = 0;
        int equal_chars = 0;

        for (i = 0; i < s.length(); i++) {

            while (j >= start_index && j < t.length()) {

                if (s.charAt(i) == t.charAt(j)) {

                    start_index = j + 1;
                    j = start_index;
                    equal_chars++;
                    break;

                } else {

                    j++;

                }

            }
        }

        if (equal_chars == s.length()) {

            return true;

        }

        return false;
    }
    
    // give me the boilerplate for main
    public static void main(String[] args) {
        Problem392 p = new Problem392();
        System.out.println(p.isSubsequence("abc", "ahbgdc"));
        System.out.println(p.isSubsequence("axc", "ahbgdc"));
    }

}
