class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        for(int i = 0; i < n; i++) {
            for (int j = 0 ;j < m ;j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i,j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        if(freshCount == 0) return 0;

        int minutes = 0;
        int[][] directions = {{-1,0}, {0,-1}, {1,0}, {0,1}};

        while(!queue.isEmpty()){
            int size = queue.size();
            boolean rotted = false;
            for(int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                for(int[] dir : directions) {
                    int newX = cell[0]+dir[0];
                    int newY = cell[1]+dir[1];
                    if(newX >= 0 && newX < n && newY >=0 && newY <m && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2;
                        queue.offer(new int[]{newX, newY});
                        freshCount--;
                        rotted = true;
                    }
                }
            }
            if(rotted) minutes+=1;

        }
        return freshCount==0 ? minutes : -1;
    }
}