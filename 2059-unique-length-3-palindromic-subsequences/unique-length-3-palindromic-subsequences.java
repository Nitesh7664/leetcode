class Solution {
    // private boolean isPalindrome(String s) {
    //     for(int i = 0; i < s.length() / 2; i++) {
    //         if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
    //     }
    //     return true;
    // }
    // private void helper(String s, int ind, String curr, Set set) {
    //     if (curr.length() == 3 || ind == s.length()) {
    //         if (curr.length() == 3 && isPalindrome(curr)) set.add(curr);
    //         return; 
    //     }
    //     helper(s, ind + 1, curr + s.charAt(ind), set);
    //     helper(s, ind + 1, curr, set);
    // }

    public int countPalindromicSubsequence(String s) {
        int count = 0;
        int[] frq;
        int[] visited = new int[26];
        for(int i = 0; i < s.length() - 2; i++) {
            frq = new int[26];
            if (visited[s.charAt(i) - 'a'] == 0) {
                visited[s.charAt(i) - 'a'] = 1;
                frq[s.charAt(i + 1) - 'a']++;
                boolean isPalindrome = false;
                for(int j = s.length() - 1; j >= i + 2; j--) {
                    if(s.charAt(i) == s.charAt(j)) isPalindrome = true;
                    if (isPalindrome == true) {
                        frq[s.charAt(j) - 'a']++;
                    } 
                }
                frq[s.charAt(i) - 'a']--;
                if (isPalindrome == true) {
                    for (int num: frq) {
                        if (num > 0) count++;
                    }
                }
            }
        }
        return count;
        // Set<String> set = new HashSet();
        // helper(s, 0, "", set);
        // return set.size();
    }
}