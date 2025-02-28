class Solution {
    public int longestMountain(int[] arr) {
        int max = 0, n = arr.length, i = 1;
        while (i < n) {
           //climb up
           int up = 0;
           while(i < n && arr[i-1] < arr[i]){
            i++;
            up++;
           }
           //climb down
           int down = 0;
           while(i < n && arr[i-1] > arr[i]){
            i++;
            down++;
           }
           //climb flat
           while(i < n && arr[i-1] == arr[i]){
            i++;
           }
           //calculate max if applicable
           if(up > 0 && down > 0) {
            max = Math.max(max, up+down+1);
           }
        }
        return max;
    }
}