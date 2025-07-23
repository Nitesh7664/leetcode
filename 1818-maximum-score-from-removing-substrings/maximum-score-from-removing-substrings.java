class Solution {
    public int maximumGain(String s, int x, int y) {
        char a = 'a', b = 'b';
        if (x < y) {
            b = 'a';
            a = 'b';
            int temp = x;
            x = y;
            y = temp;
        }

        int c1 = 0, c2 = 0, res = 0;
        for(char ch: s.toCharArray()) {
            if (ch == a) {
                c1++;
            } else if (ch == b) {
                if (c1 > 0) {
                    res += x;
                    c1--;
                } else {
                    c2++;
                }
            } else {
                res += Math.min(c1, c2) * y;
                c1 = 0;
                c2 = 0;
            }
        }
        res += Math.min(c1, c2) * y;
        return res;
    }
}