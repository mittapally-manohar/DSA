class Solution {
    public int numIslands(char[][] grid) {
       int row = grid.length;
       int column = grid[0].length;
       int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
       int count = 0;
       Queue<int[]> queue = new LinkedList<>();
       for(int i =0; i< row; i++) {
        for(int j= 0; j< column; j++){
            if(grid[i][j]=='1'){
                count++;
                grid[i][j] = '0';
                queue.offer(new int[]{i,j});
                while(!queue.isEmpty()) {
                    int[] cell = queue.poll();
                    for(int[] dir : directions){
                        int x = cell[0]+dir[0];
                        int y = cell[1]+dir[1];
                        if (x >= 0 && y >=0 && x < row && y < column) {
                            if (grid[x][y] =='1'){
                                grid[x][y] = '0';
                                queue.offer(new int[]{x,y});
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