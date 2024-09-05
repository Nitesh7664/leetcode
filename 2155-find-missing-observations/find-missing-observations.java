class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int totalSum = mean * (m + n);
        int sum = 0;
        for(int roll: rolls) sum += roll;
        int missingSum = totalSum - sum;
        if (missingSum > 6 * n || missingSum < n) return new int[]{};
        int[] res = new int[n];
        int idx = 0;
        while(n > 0) {
            int dice = Math.min(6, missingSum - n + 1);
            res[idx++] = dice;
            missingSum -= dice;
            n--;
        }
        return res;
    }
}