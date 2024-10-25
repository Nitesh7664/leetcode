class Solution {
    private void helper(String s, int pos, int[] maxLength, HashSet<String> subString) {
        if (pos == s.length()) {
            if (maxLength[0] < subString.size()) {
                maxLength[0] = subString.size();
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = pos; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (!subString.contains(sb.toString())) {
                subString.add(sb.toString());
                helper(s, i + 1, maxLength, subString);
                subString.remove(sb.toString());
            }
        }
    }

    public int maxUniqueSplit(String s) {
        HashSet<String> set = new HashSet();
        int[] maxCount = new int[1];
        helper(s, 0, maxCount, set);
        return maxCount[0];
    }
}