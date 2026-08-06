class Solution {
    public int product(int num) {
        int res = 1;
        while (num != 0) {
            res *= num % 10;
            num = num / 10;
        }
        return res;
    }

    public int smallestNumber(int n, int t) {
        for (int i = n; i <= n + 10; i++) {
            if (product(i) % t == 0) return i;
        }
        return n;
    }
}