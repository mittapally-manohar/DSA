class Solution {
    private static final int[][] DIRECTIONS = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public int numIslands(char[][] grid) {
       if(grid == null || grid.length == 0) {
        return 0;
       }
       int count = 0;
       int row = grid.length;
       int cols = grid[0].length;
      
       for(int i = 0; i < row; i++) {
        for(int j = 0; j < cols; j++) {
            if (grid[i][j] == '1') {
                count++;
                 Queue<int[]> queue = new LinkedList<>();
                bfs(grid,i,j,queue);
            }
        }
       }
        return count;
    }

    public void bfs(char[][] grid, int i, int j, Queue<int[]> queue) {
        int row = grid.length;
        int cols = grid[0].length;
        queue.offer(new int[]{i,j});
        grid[i][j] = '0';
        if(!queue.isEmpty()){
                int[] cell = queue.poll();
                    for(int[] dir : DIRECTIONS){
                        int newX = cell[0] + dir[0];
                        int newY = cell[1] + dir[1];
                        if(newX >= 0 && newY >=0 && newX < row && newY < cols) {
                            if(grid[newX][newY]=='1'){
                                bfs(grid, newX, newY, queue);
                            }
                        }
            }
        }
    }
}