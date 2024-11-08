class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] prefixXor = new int[n];
        prefixXor[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixXor[i] = prefixXor[i - 1] ^ nums[i];
        }
        int mask = (1 << maximumBit) - 1;
        int[] res = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            res[n - i - 1] = prefixXor[i] ^ mask;
        }
        return res;
    }
}