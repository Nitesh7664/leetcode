class Solution {
    public int scoreOfParentheses(String str) {
        Stack<String> s = new Stack();
        for (char ch: str.toCharArray()) {
            if (ch == '(') s.push("" + ch); // converted into String
            else if (ch == ')') {
                String top = s.pop();
                if (top.equals("(")) {
                    s.push("1");
                } else {
                    if (s.peek().equals("(")) {
                        s.pop();
                        s.push(String.valueOf(2 * Integer.parseInt(top)));
                    } else {
                        int total = Integer.parseInt(top);
                        while(!s.peek().equals("(")) {
                            total += Integer.parseInt(s.pop());
                        }
                        s.pop();
                        s.push(String.valueOf(2 * total));
                    } 
                }
            }
        }

        // 6

        int result = 0;
        while(!s.isEmpty()) {
            result += Integer.parseInt(s.pop());
        }
        return result;
    }
}