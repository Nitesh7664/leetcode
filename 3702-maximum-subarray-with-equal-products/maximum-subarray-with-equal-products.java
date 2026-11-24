class Solution {

    public int getGcd(int limit, int start, int end, int[] arr) {
        int ans = 1;
        for (int i = 2; i <= limit; i++) {
            int j;
            for (j = start; j <= end; j++) {
                if (arr[j] % i != 0) break;
            }
            if (j == end + 1) ans = Math.max(ans, i);
        }
        return ans;
    }

    public int getLcm(int prod, int start, int end, int[] arr, int max) {
        int ans = max;
        for (int i = max; i <= prod; i++) {
            int j;
            for (j = start; j <= end; j++) {
                if (i % arr[j] != 0) break;
            }
            if (j == end + 1) return i;
        }
        return ans;
    }

    public int maxLength(int[] nums) {
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                int maxEl = nums[j];
                int prod = 1;
                for (int k = j; k <= j + i; k++) {
                    maxEl = Math.max(maxEl, nums[k]);
                    prod *= nums[k];
                }
                int gcd = getGcd(maxEl, j, j + i, nums);
                int lcm = getLcm(prod, j, j + i, nums, maxEl);
                System.out.println("prod = " + prod + " | maxEl = " + maxEl + " | start = " + j + " end = " + (j + i) + " | gcd = " + gcd + " lcm = " + lcm + " | range = " + i);

                if (prod == (gcd * lcm)) {
                    result = Math.max(result, i + 1);
                }
            }
        }

        return result;
    }
}