class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
       //minimum time is determined by maximum of (differences of x coorinates and differences of y coordinates)
       int minTime = 0;
       for(int i = 1; i < points.length; i++) {
        minTime += Math.max(Math.abs(points[i][0]-points[i-1][0]),Math.abs(points[i][1]-points[i-1][1]));
       } 
       return minTime;
    }
}