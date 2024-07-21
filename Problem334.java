public class Problem334 {

    public static void main(String[] args) {
        // Your code here
        System.out.println(increasingTriplet(new int[] { 1,2,2,1 }));
    }

    public static boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] < i) {
                i = nums[k];
            } else if (nums[k] > i && nums[k] < j) {
                j = nums[k];
            } else if (nums[k] > j) {
                return true;
            } 
        }
        return false;
    }
}