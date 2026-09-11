class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet();

        for (int onesIndex = 0; onesIndex < digits.length; onesIndex++) {
            if(digits[onesIndex] % 2 == 1) continue;

            for (int tensIndex = 0; tensIndex < digits.length; tensIndex++) {
                if (tensIndex == onesIndex) continue;

                for (int hundredsIndex = 0; hundredsIndex < digits.length; hundredsIndex++) {
                    if (digits[hundredsIndex] == 0 ||
                        onesIndex == hundredsIndex ||
                        tensIndex == hundredsIndex
                    ) continue;

                    int number = digits[hundredsIndex] * 100 +
                                digits[tensIndex] * 10 +
                                digits[onesIndex];
                    set.add(number);
                }
            }
        }
        return set.size();
    }
}