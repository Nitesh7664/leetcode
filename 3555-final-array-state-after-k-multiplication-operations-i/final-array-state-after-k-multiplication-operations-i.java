class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-- > 0) {
            int idx = 0;
            for(int i = 0; i < nums.length; i++) {
                if (nums[i] < nums[idx]) {
                    idx = i;
                }
            }
            nums[idx] = nums[idx] * multiplier;
        }
        return nums;
    }
}