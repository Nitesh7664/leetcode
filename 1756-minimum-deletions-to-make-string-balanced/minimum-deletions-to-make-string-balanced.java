class Solution {
    public int minimumDeletions(String s) {
        int a_count = 0;
        for (char ch: s.toCharArray()) {
            if (ch == 'a') a_count++;
        }
        int b_count = 0;
        int min = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') a_count--;
            min = Math.min(a_count + b_count, min); 
            if (s.charAt(i) == 'b') b_count++;
        }
        return min;
    }
}