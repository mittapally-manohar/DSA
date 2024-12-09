class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length, column = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    return getPerimeter(grid, i, j);
                }
            }
        }
        return 0;
    }

    public int getPerimeter(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == -1) {
            return 0;
        }
        grid[i][j] = -1;
        int count = 0;
        count += getPerimeter(grid, i, j - 1);
        count += getPerimeter(grid, i, j + 1);
        count += getPerimeter(grid, i - 1, j);
        count += getPerimeter(grid, i + 1, j);

        return count;
    }
}