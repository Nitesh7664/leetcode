class Solution {
    public String digitSum(String s, int k) {
        if (s.length() <= k) return s;
        StringBuilder sb = new StringBuilder(s);
        while(sb.length() > k) {
            int counter = 0;
            int sum = 0;
            StringBuilder temp = new StringBuilder();
            for (char ch: sb.toString().toCharArray()) {
                counter++;
                sum += ch-'0';
                if (counter == k) {
                    System.out.println(sum);
                    temp.append("" + sum);
                    counter = 0;
                    sum = 0;
                }
            }
            if (counter > 0) {
                temp.append("" + sum);
            }
            sb = temp;
        }

        return sb.toString();
    }
}