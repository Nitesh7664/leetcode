//Detect Capital

class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 0) return true;
        int totalCaps = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90) totalCaps++;
        }
        if(totalCaps == word.length() || (totalCaps == 1 && word.charAt(0) >= 65 && word.charAt(0) <= 90) || totalCaps == 0) return true;
        else return false;
    }
}