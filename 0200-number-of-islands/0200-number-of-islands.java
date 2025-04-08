class Solution {

    private static final int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
   
    public int numIslands(char[][] grid) {
       int count = 0;
       int row = grid.length;
       int col = grid[0].length;
       for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            if (grid[i][j] == '1'){
                count++;
                bfs(grid,i,j);
            }
        }
       }
       return count;
    }

    public void bfs(char[][] grid, int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        grid[i][j] = '0';
        while (!q.isEmpty()){
            int[] cell = q.poll();
            for (int[] dir : directions) {
                int x = cell[0] + dir[0];
                int y = cell[1] + dir[1];
                if (x >= 0 && x <= grid.length-1 && y >=0 && y <= grid[0].length-1 && grid[x][y]=='1'){
                    q.offer(new int[]{x,y});
                    grid[x][y] = '0';
                }
            }
        }
    }

    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i > grid.length-1 || j > grid[0].length-1 || grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}