class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i];
            int orValue = nums[i];
            int count = 1;
            for(int j = i + 1; j < nums.length; j++) {
                if ((orValue & nums[j]) == 0) {
                    count++;
                    orValue = orValue | nums[j];
                } else break;
            }
                max = Math.max(count, max);
        }
            return max;
    }
}