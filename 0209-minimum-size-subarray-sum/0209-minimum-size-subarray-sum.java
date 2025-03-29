class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int total = 0;
        for (int right = 0, left = 0; right < n; right++) {
            total += nums[right];
            while (total >= target) {
                min = Math.min(min, right - left + 1);
                total -= nums[left];
                left++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}