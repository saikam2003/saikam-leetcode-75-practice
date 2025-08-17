public class Problem443 {
    public static void main(String[] args) {
        // Your code here
        System.out.println(compress(new char[] {'a','a','a','b','b','a','a'}));
    }

    public static int compress(char[] chars) {
        String str = "";
        int i = 0;
        int currentCount = 0;
        while (i < chars.length) {
            if (str.contains(Character.toString(chars[i]))) {
                if (chars[i - 1] != chars[i] && i > 1) {
                    currentCount = 0;
                    str = str.concat(Character.toString(chars[i]));
                    currentCount++;
                } else {
                    currentCount++;
                    if ((i < chars.length - 1) && chars[i + 1] != chars[i] && currentCount != 1) {
                        str = str.concat(Integer.toString(currentCount));
                        currentCount = 0;
                    } else if (i == chars.length - 1) {
                        str = str.concat(Integer.toString(currentCount));
                    }
                }
                
            } else {
                currentCount = 0;
                str = str.concat(Character.toString(chars[i]));
                currentCount++;
            }

            i++;
        }
        
        System.arraycopy(str.toCharArray(), 0, chars, 0, str.length());
        return str.length();    
    }
}
