class Solution {
    public int getLucky(String s, int k) {
        String str = s;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch: str.toCharArray()) {
            sb.append((int) ch - 'a' + 1);
        }
        str = sb.toString();
        while(k > 0) {
            System.out.println(str);
            for(char ch: str.toCharArray()) {
                sum += ch - '0';
            }
            str = String.valueOf(sum);
            if (str.length() == 1) return sum;
            k--;
            sum = 0;
        }
        return Integer.parseInt(str);
    }
}