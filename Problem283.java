public class Problem283 {
    public static void main(String[] args) {
        // Your code here
        int[] nums = new int[] { 0, 1 };
        moveZeroes(nums);
        System.out.println(nums);
    }
    
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        

        while (i < j) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                nums[i] = nums[i + 2];
                nums[i + 2] = 0;
                i++; 
            } else if (nums[i] == 0) {
                nums[i] = nums[i+1];
                nums[i+1] = 0;
                i++;
            } else if (nums[j-1] == 0) {
                nums[j-1] = nums[j];
                nums[j] = 0;
                j--;
            }

        }
        }
}
