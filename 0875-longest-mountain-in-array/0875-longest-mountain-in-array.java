class Solution {
    public int longestMountain(int[] arr) {
         int left = 0, right, max=0, n = arr.length;
         if(n < 3) return 0;
         while(left < n-2) {
            while(left < n-1 && arr[left+1] <= arr[left]) left++;
            right = left + 1;
            while(right < n-1 && arr[right] < arr[right+1]) right++;
            while(right < n-1 && arr[right] > arr[right+1]){
                right++;
                max =Math.max(max, right-left+1);
            }
            left=right;
         }
         return max;
    }
}