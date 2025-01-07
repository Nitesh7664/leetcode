class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet();
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                if (i != j && words[i].length() <= words[j].length() && words[j].contains(words[i])) set.add(words[i]);
            }
        }
        List<String> res = new ArrayList(set);
        return res;
    }
}