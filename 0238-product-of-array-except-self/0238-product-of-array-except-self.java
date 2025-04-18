class Solution {
    public int[] productExceptSelf(int[] nums) {
         int[] ans = new int[nums.length];
         ans[0] = 1;
         for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
         }
         
         int[] ans1 = new int[nums.length];
         ans1[nums.length-1] = 1;
         for (int i = nums.length - 2; i >= 0; i--) {
            ans1[i] = ans1[i + 1] * nums[i + 1];
         }

         int[] res = new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
            res[i] = ans[i] * ans1[i];
         }
         return res;
    }
}