class Solution {
    int MOD = 1000000007;
    public long binaryExponentiation(long x, long n) {
        long ans = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                ans = (ans * x) % MOD;
                n -= 1;
            } else {
                x = (x * x) % MOD;
                n /= 2;
            }
        }
        return ans;
    }

    public int countGoodNumbers(long n) {
        long prime = n / 2;
        long even = n - n / 2;
        long mod = 1000000007;
        return (int) ((binaryExponentiation(5, even) * binaryExponentiation(4, prime)) % mod);        
    }
}