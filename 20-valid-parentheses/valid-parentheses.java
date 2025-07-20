class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (char ch: str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')  {
                s.push(ch);
                System.out.println(ch + " if");
            } else {
                if (s.isEmpty()) return false;
                char stackTop = s.pop();
                System.out.println(ch + " " + stackTop + " if");
                if (stackTop == '(' && ch != ')' || stackTop == '{' && ch != '}' || stackTop == '[' && ch != ']') return false;

            }
        }
        System.out.println("stack empty check " + s.isEmpty());
        return s.isEmpty();
    }
}