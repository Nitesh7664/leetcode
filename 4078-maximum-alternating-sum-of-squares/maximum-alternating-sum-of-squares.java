class Solution {
    public long maxAlternatingSum(int[] nums) {
        long result = 0;
        Long[] boxed = Arrays.stream(nums)
        .mapToLong(n -> (long) n * n)
        .boxed()
        .toArray(Long[]::new);
        Arrays.sort(boxed);

        for(long num: boxed) {
            System.out.println(num);
        }
        int i = 0, j = nums.length - 1;
        while (i < j) {
            result += boxed[j] - boxed[i];
            i++;
            j--;
        }

        if (i == j) result += boxed[j];
        return result;
    }
}