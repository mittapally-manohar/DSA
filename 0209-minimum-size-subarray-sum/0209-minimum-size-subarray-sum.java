class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        int min = Integer.MAX_VALUE;
        int total = 0;
        while (right < n) {
            total += nums[right];
            while (total >= target) {
                min = Math.min(min, right - left + 1);
                total -= nums[left];
                left++;
            }
            right++;
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;

    }
}