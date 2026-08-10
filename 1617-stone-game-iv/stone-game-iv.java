class Solution {

    Boolean[] memo;

    public boolean winnerSquareGame(int n) {
        memo = new Boolean[n + 1];

        return canWin(n);
    }

    public boolean canWin(int remainingStone) {
        if (remainingStone <= 0) return false;

        if (memo[remainingStone] != null) return memo[remainingStone];

        for (int i = 1; i * i <= remainingStone; i++) {
            if (!canWin(remainingStone - i * i)) {
                return memo[remainingStone] = true;
            }
        }

        return memo[remainingStone] = false; 

    }
}