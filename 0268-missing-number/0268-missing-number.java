class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = nums.length;
        for(int i = 0; i < nums.length; i++) {
            totalSum += (i - nums[i]);
        }
        return totalSum;
    }
}