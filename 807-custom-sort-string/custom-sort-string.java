class Solution {
    public String CharArrToString(Character[] chArr) {
        StringBuilder sb = new StringBuilder();
        for(Character ch: chArr) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public String customSortString(String order, String s) {
        int[] sortOrder = new int[26];
        int count = -1 * order.length();
        for (char ch: order.toCharArray()) {
            sortOrder[ch - 'a'] = count++;
        }
        // for (int i = 0; i < sortOrder.length; i++) {
        //     System.out.print(sortOrder[i] + " ");
        // }

        char[] sArr = s.toCharArray();
        Character[] chArr = new Character[sArr.length];
        for(int i = 0; i < sArr.length; i++) {
            chArr[i] = sArr[i];
        }
        Arrays.sort(chArr, (a, b) -> sortOrder[a - 'a'] - sortOrder[b - 'a']);
        return CharArrToString(chArr);
    }
}