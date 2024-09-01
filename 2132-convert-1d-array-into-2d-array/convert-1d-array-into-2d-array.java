class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res = new int[m][n];
        int len = original.length;
        if (len != m * n) return new int[0][0];
        for (int i = 0; i < len; i++) {
            res[i / n][i % n] = original[i];
        }
        return res;
    }
}