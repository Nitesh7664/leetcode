class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (char ch: str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')  {
                s.push(ch);
            } else {
                if (s.isEmpty()) return false;
                char stackTop = s.pop();
                if (stackTop == '(' && ch != ')' || stackTop == '{' && ch != '}' || stackTop == '[' && ch != ']') return false;

            }
        }
        return s.isEmpty();
    }
}