class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for(int i = 1; i < words.length; i++) {
            String previousWord = words[i - 1];
            String currentWord = words[i];
            if (previousWord.charAt(previousWord.length() - 1) != currentWord.charAt(0)) return false;
        }
        return words[0].charAt(0) == words[words.length -1].charAt(words[words.length -1].length() - 1);
    }
}