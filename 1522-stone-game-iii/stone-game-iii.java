class Solution {
    Integer[] memo;
    int[] stones;
    int n;

    public int dfs(int i) {
        if (i >= n) return 0;

        if (memo[i] != null) return memo[i];
        int maxDiff = Integer.MIN_VALUE;
        int sum = 0;
        for (int j = 0; j < 3 && i + j < n; j++) {   
            sum += stones[i + j];
            maxDiff = Math.max(maxDiff, sum - dfs(i + j + 1));
        }
        return memo[i] = maxDiff;
    }

    public String stoneGameIII(int[] stoneValue) {
        stones = stoneValue;
        n = stoneValue.length;
        memo = new Integer[n];

        int ans = dfs(0);

        if (ans == 0) return "Tie";
        else if (ans > 0) return "Alice";
        return "Bob";
    }
}