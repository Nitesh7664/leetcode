//Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack();
        s = s.toLowerCase();
        for(char c: s.toCharArray()){
            if((c >= 97 && c <= 122) || (c >= '0' && c <= '9')) stack.push(c);
        }

        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) < 'a' || s.charAt(i) > 'z') && (s.charAt(i) < '0' || s.charAt(i) > '9')) continue;
            if(stack.isEmpty()) return false;
            if(stack.peek() == s.charAt(i)) stack.pop(); 
        }
        return stack.isEmpty();
    }
}