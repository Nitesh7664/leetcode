class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length - 1; i++) {
            int m = words[i].length();
            String str1 = words[i];
            for(int j = i + 1; j < words.length; j++) {
                int n = words[j].length();
                String str2 = words[j];
                if(n >= m && str2.substring(0, m).equals(str1) && str2.substring(n - m, n).equals(str1)) {
                    count++;
                }
            }
        }
        return count;
    }
}