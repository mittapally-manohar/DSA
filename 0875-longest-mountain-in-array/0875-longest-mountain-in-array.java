class Solution {
    public int longestMountain(int[] arr) {
       int n = arr.length;
       int left = 0, right, longest = 0;
       while (left < n - 2) {
            while (left < n -1 && arr[left] >= arr[left+1]) {
                left++;
            }
            right = left + 1;
            while (right < n - 1 && arr[right] < arr[right+1]) {
                right++;
            }
            while (right < n - 1 && arr[right] > arr[right+1]){
                right++;
                longest = Math.max(longest, right-left+1);
            }
           
            left = right;
       }
       return longest;
    }
}