public class Problem1071 {
    public static void main(String[] args) {
        // Your code here
        String result = gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX");
        System.out.println(result);
    }


    public static String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return gcdOfStrings(str2, str1);
        }

        // StringBuilder sbDividend = new StringBuilder();
        // sbDividend.append(sbDividend);

        
        if (str2.equals(str1)) {
            return str1;
        }

        if (str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }

        return "";
    }
}
