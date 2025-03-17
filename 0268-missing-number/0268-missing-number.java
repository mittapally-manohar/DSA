class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
       int xorFull = 0, xorArr = 0;
       for (int i = 0 ; i <= n; i++) {
        xorFull ^= i;
       }
       for (int num : nums) {
        xorArr ^= num;
       }
       return xorFull ^ xorArr;
    }
}