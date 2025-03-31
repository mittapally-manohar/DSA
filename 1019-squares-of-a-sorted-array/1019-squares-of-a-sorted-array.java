class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i = n-1, left = 0, right = n-1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i--] = nums[left] * nums[left];
                left++;
            } else {
                res[i--] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }
}