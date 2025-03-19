class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1'){
                    count++;
                    grid[i][j] = '0';
                    queue.offer(new int[]{i,j});
                    while(!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        for (int[] dir: dirs) {
                            int x = cell[0] + dir[0];
                            int y = cell[1] + dir[1];
                            if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length) {
                                if (grid[x][y] == '1') {
                                    queue.offer(new int[]{x,y});
                                    grid[x][y] = '0';
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}