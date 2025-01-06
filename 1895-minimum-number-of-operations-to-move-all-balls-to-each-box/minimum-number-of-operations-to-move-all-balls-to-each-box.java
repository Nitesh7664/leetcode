class Solution {
    public int[] minOperations(String boxes) {
        Map<Integer, Integer> map = new HashMap();
        int[] res = new int[boxes.length()];
        List<Integer> indexes = new ArrayList();
        for(int i = 0; i < boxes.length(); i++) {
            char ch = boxes.charAt(i);
            if (ch == '1') {
                indexes.add(i);
            }
        }

        for(int i = 0; i < res.length; i++) {
            for(int index: indexes) {
                res[i] += Math.abs(i - index);
            }
        }
        return res;
    }
}