class Solution {
    public int longestMountain(int[] arr) {
       int i = 1, n = arr.length, max = 0;
       while (i < n) {
        int up = 0, down = 0;
        while(i < n && arr[i] > arr[i-1]){
            up++;
            i++;
        }
        while(i < n && arr[i] < arr[i-1]) {
            down++;
            i++;
        }
        if(up > 0 && down > 0) {
            max = Math.max(max, down+up+1);
        }
        while(i < n && arr[i] == arr[i-1]){
            i++;
        }
       }
       return max;
    }
}