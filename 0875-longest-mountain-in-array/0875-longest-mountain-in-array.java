class Solution {
    public int longestMountain(int[] arr) {
       if (arr.length < 3) return 0;
       int max = 0;
       int left = 0, right = 0;
       int n = arr.length;
       while (left < n-2){
            while (left < n-1 && arr[left] >= arr[left+1]){
                left++;
            }
            right = left + 1;
            while (right < n-1 && arr[right] < arr[right+1]){
                right++;
            }
            while (right < n-1 && arr[right] > arr[right+1]) {
                right++;
                max = Math.max(max, right-left + 1);
            }
            left = right;
       }
       return max;
    }
}