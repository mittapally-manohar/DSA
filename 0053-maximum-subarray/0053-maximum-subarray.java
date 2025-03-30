class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int mth = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            mth = Math.max(nums[i], mth+nums[i]);
            max = Math.max(max, mth);
        }
        return max;
    }
}