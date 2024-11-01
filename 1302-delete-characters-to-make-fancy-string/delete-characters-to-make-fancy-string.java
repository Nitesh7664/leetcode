class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || i == 1) sb.append(s.charAt(i));
            else if (s.charAt(i) != s.charAt(i - 1) || s.charAt(i) != s.charAt(i - 2)) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}