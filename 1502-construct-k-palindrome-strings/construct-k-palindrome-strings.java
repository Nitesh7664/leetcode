class Solution {
    public boolean canConstruct(String s, int k) {
        if (k > s.length()) return false;
        if (k == s.length()) return true;
        // Map<Char, Integer> map = new HashMap();
        int[] arr = new int[26];
        for (char ch: s.toCharArray()) {
            arr[ch - 'a']++;
        }
        int evenCount = 0, oddCount = 0;
        for(int num: arr) {
            if (num % 2 == 1) oddCount++;
            if (num > 1) evenCount++;
        }

        if (k - oddCount < 0) return false;
        return true;


        
    }
}