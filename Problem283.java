class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int indexNotZero = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[indexNotZero] = nums[i];
                indexNotZero++;
            }
        }

        for (i = indexNotZero; i < nums.length; i++){
            nums[i] = 0;
        }

    }
}