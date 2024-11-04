class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        char prev = ' ';
        int acc = 0;
        for (char ch: word.toCharArray()) {
            if (ch == prev) {
                acc++;
                if (acc == 9) {
                    sb.append(acc + "" + ch);
                    acc = 0;
                }
            } else if(acc > 0) {
                sb.append(acc + "" + prev);
                acc = 1;                
            } else {
                acc = 1;
            }
            prev = ch;
        }
        if (acc > 0)
            sb.append(acc + "" + prev);
        return sb.toString();
    }
}