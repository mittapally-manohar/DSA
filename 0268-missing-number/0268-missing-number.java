class Solution {
    public int missingNumber(int[] nums) {
       int xorTotal = 0;
       for(int i = 0; i <= nums.length; i++){
         xorTotal ^= i;
       }
       int xorArray = 0;
       for(int num : nums) {
        xorArray ^= num;
       }
       return xorTotal ^ xorArray;
    }
}