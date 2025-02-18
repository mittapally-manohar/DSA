class Solution {
    private static int[][] DIRECTIONS = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid == null) return 0;
        int count = 0, rows = grid.length, cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < rows ; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    queue.offer(new int[]{i, j});
                    grid[i][j] = '0';

                    while(!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        int x =cell[0], y = cell[1];
                        for (int[] dir : DIRECTIONS) {
                            int newX = x + dir[0], newY = y + dir[1];
                            if(newX >= 0 &&
                                newY >= 0 &&
                                newX < rows &&
                                newY < cols &&
                                grid[newX][newY] == '1') {
                                    queue.offer(new int[]{newX,newY});
                                    grid[newX][newY] = '0';
                                }
                        }
                    }
                }
            }
        }
        return count;

    }
}