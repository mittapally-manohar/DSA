class Solution {
    public int numIslands(char[][] grid) {
        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        int row = grid.length - 1;
        int col = grid[0].length - 1;
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    queue.offer(new int[] { i, j });
                    grid[i][j] = '0';
                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        for (int[] dir : directions) {
                            int x = cell[0] + dir[0];
                            int y = cell[1] + dir[1];
                            if (x >= 0 && x <= row && y >= 0 && y <= col && grid[x][y] == '1') {
                                queue.offer(new int[] { x, y });
                                grid[x][y] = '0';
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}