class Solution {
    public long countGood(int[] nums, int k) {
        long result = 0;
        int left = 0, right = 0;
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap();
        long goodPairs = 0;
        while(left < n) {
            while(right < n && goodPairs < k) {
                freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
                if (freq.get(nums[right]) > 1) {
                    goodPairs += (freq.get(nums[right]) - 1);
                }
                right++;
            }
            if  (goodPairs >= k) {
                result += n - right + 1;
            }

            freq.put(nums[left], freq.get(nums[left]) - 1);
            if (freq.get(nums[left]) > 0) {
                goodPairs -= freq.get(nums[left]);
            }
            left++;
        }
        return result;
    }
}