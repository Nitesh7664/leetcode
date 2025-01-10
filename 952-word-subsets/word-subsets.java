class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList();
        int[] freq = new int[26];
        int[] temp;
        for(String word: words2) {
            temp = new int[26];
            for(char ch: word.toCharArray()) {
                temp[ch - 'a']++;
            }
            for(int i = 0; i < temp.length; i++) {
                freq[i] = Math.max(freq[i], temp[i]);
            }
        }
        // for(int num: freq) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();
        for(String word: words1) {
            temp = freq.clone();
            for(char ch: word.toCharArray()) {
                temp[ch - 'a']--;
            }
            int i = 0;
        //     for(int num: temp) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();
            for(i = 0; i < temp.length; i++) {
                if(temp[i] > 0) break;
            }
            if (i == temp.length) res.add(word);
        }
        return res;
    }
}