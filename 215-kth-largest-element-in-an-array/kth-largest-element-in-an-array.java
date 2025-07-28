class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int num: nums) 
            pq.add(num);
        int res = pq.poll();
        while(--k > 0) {
            res = pq.poll();
        }

        return res;
    }
}