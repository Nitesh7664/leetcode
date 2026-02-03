class Solution {
    public boolean isTrionic(int[] nums) {
        int p = -1, q = -1;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i - 1]) return false;
            else if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                if (p == -1) {
                    p = i;
                } else return false;
            } else if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                if (p == -1 || q != -1) return false;
                else q = i;
            }
        }
        if (nums[nums.length - 1] <= nums[nums.length - 2] || p == -1 || q == -1) return false;
        return true;
    }
}