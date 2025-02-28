class Solution {
    public int missingNumber(int[] nums) {
      int xorFull = 0, xorArr = 0;
      for(int i=0;i<=nums.length;i++){
        xorFull ^= i;
      }
      for(int i =0; i< nums.length; i++) {
        xorArr ^= nums[i];
      }
      return xorFull ^ xorArr;
    }
}