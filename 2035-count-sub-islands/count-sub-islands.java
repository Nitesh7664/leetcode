class Solution {
    public void makeIslandzero(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0;
        makeIslandzero(grid, i + 1, j);
        makeIslandzero(grid, i - 1, j);
        makeIslandzero(grid, i, j + 1);
        makeIslandzero(grid, i, j - 1);
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[0].length; j++) {
                if (grid2[i][j] == 1 && grid1[i][j] == 0) {
                    makeIslandzero(grid2, i, j);
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[0].length; j++) {
                if (grid2[i][j] == 1 && grid1[i][j] == 1) {
                    counter++;
                    makeIslandzero(grid2, i, j);
                }
            }
        }
        return counter;
    }
}