class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int min = n + 1; // words length can be max 100
        for (int i = startIndex; i < startIndex + n; i++) {
            if (words[i % n].equals(target)) {
                min = Math.min(min, i - startIndex);
            }
        }

        for (int i = startIndex; i > startIndex - n; i--) {
            if (words[(i + n) % n].equals(target)) {
                min = Math.min(min, startIndex - i);
            }
        }
        if (min == n + 1) return -1;
        else return min;
    }
}