class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxCount = 1;
        int incrCount = 1;
        int decrCount = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                incrCount++;
                decrCount = 1;
            } else if(nums[i] < nums[i - 1]) {
                incrCount = 1;
                decrCount++;
            } else {
                incrCount = 1;
                decrCount = 1;
            }
            maxCount = Math.max(maxCount, Math.max(incrCount, decrCount));
        }
        return maxCount;
    }
}