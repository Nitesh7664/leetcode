class Solution {
    private int binarySearch(int[][] items, int price) {
        int max = 0;
        int l = 0, r = items.length - 1;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if (items[mid][0] <= price) {
                max = Math.max(max, items[mid][1]);
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return max;
    }

    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < items.length; i++) {
            items[i][1] = Math.max(items[i - 1][1], items[i][1]);
        }
        int[] res = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            res[i] = binarySearch(items, queries[i]);
        }
        return res;
    }
}