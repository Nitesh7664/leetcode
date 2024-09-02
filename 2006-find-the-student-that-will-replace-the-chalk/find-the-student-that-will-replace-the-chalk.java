class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
            if (sum > k) return i;
        }
        long rem = k % sum;
        // System.out.println(sum + " " + rem);
        for (int i = 0; i < chalk.length; i++) {
            rem = rem - chalk[i];
            if (rem < 0) return i;
        }
        return 0;
    }
}