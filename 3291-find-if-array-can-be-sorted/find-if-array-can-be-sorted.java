class Solution {
    private int getBitCount(int num) {
        int count = 0;
        int curr = num;
        while(curr > 0) {
            curr = curr & (curr - 1);
            if (curr > 0) count++;
        }
        return count;
    }

    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        int prev_seg_max = Integer.MIN_VALUE;
        int curr_seg_max = nums[0];
        int curr_seg_min = nums[0];
        int set_bit_count = getBitCount(nums[0]);
        System.out.println(set_bit_count);
        int i = 1;

        while(i < n) {
            while (i < n && getBitCount(nums[i]) == set_bit_count) {
                curr_seg_max = Math.max(curr_seg_max, nums[i]);
                curr_seg_min = Math.min(curr_seg_min, nums[i]);
                i++;
            }
            if (prev_seg_max > curr_seg_min) {
                return false;
            } else if (i < n) {
                prev_seg_max = curr_seg_max;
                curr_seg_max = nums[i];
                curr_seg_min = nums[i];
                set_bit_count = getBitCount(nums[i]);
            }
        }
        return true;
    }
}