
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem334 {

    public static void main(String[] args) {
        // Your code here
        System.out.println(increasingTriplet(new int[] { 2,1,5,0,4,6 }));
    }

    public static boolean increasingTriplet(int[] nums) {
        
        List<Tuple<Integer, Integer>> numsList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            Tuple<Integer, Integer> temp = new Tuple<>(nums[i], i);
            numsList.add(temp);
        }

        
        Collections.sort(numsList, new Comparator<Tuple<Integer, Integer>>() {
            @Override
            public int compare(Tuple<Integer, Integer> t1, Tuple<Integer, Integer> t2) {
                return t1.getFirst().compareTo(t2.getFirst());
            }
        });

        for (int i = 0; i < numsList.size() - 2; i++) {
            if ((numsList.get(i).getFirst() < numsList.get(i+1).getFirst() && numsList.get(i+1).getFirst() < numsList.get(i+2).getFirst()) && (numsList.get(i).getSecond() < numsList.get(i+1).getSecond() && numsList.get(i+1).getSecond() < numsList.get(i+2).getSecond())) {
                return true;
            }
        }

        return false;
    }
}

class Tuple<A, B> {

    private final A first;
    private final B second;

    public Tuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
