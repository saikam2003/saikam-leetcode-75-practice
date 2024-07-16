
import java.util.Arrays;
import java.util.List;

public class Problem334 {

    public static void main(String[] args) {
        // Your code here
        System.out.println(increasingTriplet(new int[] {1,2,3,4,5}));
    }
    
    public static boolean increasingTriplet(int[] nums) {
        List<Integer> numsList = Arrays.stream(nums).boxed().toList();
        return numsList.stream().anyMatch(i -> (nums[i]<nums[i+1] && nums[i+1]<nums[i+2] && i<nums.length-3));
    }
}
