class Solution {
    public int largestCombination(int[] candidates) {
        int maxFreq = 0;
        for(int i = 0; i < 32; i++) {
            int freq = 0;
            for (int el: candidates) {
                if ((el & (1 << i)) > 0) {
                    freq++;
                }
            }
            maxFreq = Math.max(maxFreq, freq);
        }
        return maxFreq;
    }
}