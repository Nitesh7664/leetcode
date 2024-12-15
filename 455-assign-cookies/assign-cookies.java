class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        int count = 0;
        for(int i = 0; i < g.length && j < s.length; i++) {
            while (j < s.length) {
                if (s[j] >= g[i]) {
                    count++;
                    j++;
                    break;
                }
                j++;
            }
        }
        return count;
    }
}