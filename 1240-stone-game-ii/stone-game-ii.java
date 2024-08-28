class Solution {

    private int n;
    private int[] s;
    private Integer[][] dp;

    public int stoneGameII(int[] piles) {
        n = piles.length;
        s = new int[n + 1];
        dp = new Integer[n][n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] + piles[i];
        }
        return dfs(0, 1);
    }

    public int dfs(int i, int m) {
        if (m * 2 >= n - i) {
            return s[n] - s[i];
        }

        if (dp[i][m] != null) {
            return dp[i][m];
        }

        int res = 0;
        for (int x = 1; x <= 2 * m; x++) {
            res = Math.max(res, s[n] - s[i] - dfs(i + x, Math.max(x, m)));
        }
        return dp[i][m] = res;
    }
}