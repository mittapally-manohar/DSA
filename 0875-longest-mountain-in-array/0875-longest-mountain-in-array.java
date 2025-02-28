class Solution {
    public int longestMountain(int[] arr) {
        int max = 0, n = arr.length, i = 1;
       
        while (i < n) {
            int up = 0, down = 0;
            while (i < n && arr[i - 1] < arr[i]) {
                i++;
                up++;
            }
            while (i < n && arr[i - 1] > arr[i]) {
                i++;
                down++;
            }
            if (up > 0 && down > 0){
                max = Math.max(max, up + down + 1);
            }
            while (i < n && arr[i - 1] == arr[i]) {
                i++;
            }
        }
        return max;
    }
}