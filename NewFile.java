import java.util.Collections;
import java.util.HashMap;

public class NewFile {
    int size = 0;
    String content = "";

    public NewFile(int size, String content) {
        this.size = size;
        this.content = content;
    }

    public int getSize() {
        return this.size;
    }

    public String getContent() {
        return this.content;
    }

    String str = "abcd";
    char[] c = str.toCharArray();
    int asc = str.charAt(size);

    public static void main(String[] args) {
        NewFile myFile = new NewFile(0, null);
        System.out.println(myFile.asc);
        for (char s : myFile.str.toCharArray()) {
            continue;
        }

        myFile.str.split("", -1);

        HashMap<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(null, null);

        // learn comparator

    }

}

public class Tuple {
    public Tuple(int a, int b) {
        this.a
    }
}
