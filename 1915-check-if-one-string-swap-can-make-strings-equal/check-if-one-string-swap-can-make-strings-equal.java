class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char ch: s1.toCharArray()) {
            freq1[ch - 'a']++;
        }
        for(char ch: s2.toCharArray()) {
            freq2[ch - 'a']++;
        }
        int diffCount = 0;
        for(int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) diffCount++;
        }
        int freqMissMatch = 0;
        for(int i = 0; i < freq1.length; i++) {
            if (freq1[i] != freq2[i]) freqMissMatch++;
        }
    
        return (diffCount == 2 || diffCount == 0) && freqMissMatch == 0;
    }
}