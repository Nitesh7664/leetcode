class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr_total = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(curr_total, max);
            if (curr_total <= 0) {
                curr_total = nums[i];
            } else {
                curr_total += nums[i];
            }
        }

        max = Math.max(curr_total, max);
        return max;
    }
}
