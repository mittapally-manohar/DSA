class Solution {
    private static final int[][] DIRECTIONS = {{-1,0},{0,-1}, {1,0},{0,1}};
    public int numIslands(char[][] grid) {
        int row = grid.length, col = grid[0].length;
        int numOfIsland = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    numOfIsland++;
                    bfs(grid, i, j, row, col);
                }
            }
        }
        return numOfIsland;
    }
    public void bfs(char[][] grid, int i, int j, int row, int col){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        grid[i][j] = '0';
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] dir : DIRECTIONS) {
                int x = cell[0] + dir[0];
                int y = cell[1] + dir[1];
                if (x >= 0 && y >= 0 && x < row && y < col && grid[x][y] =='1' ){
                    queue.offer(new int[]{x,y});
                    grid[x][y] = '0';
                }
            }
        }
    }
    public void dfs(char[][] grid, int i, int j, int row, int col){
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i-1, j,row,col);
        dfs(grid, i+1, j,row, col);
        dfs(grid, i, j+1, row, col);
        dfs(grid, i, j-1, row, col);
    }
}