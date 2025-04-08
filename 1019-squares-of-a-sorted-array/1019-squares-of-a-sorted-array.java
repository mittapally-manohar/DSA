class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0, right = n-1, k= n-1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[k--]=nums[left]*nums[left];
                left++;
            }else {
                res[k--]=nums[right]*nums[right];
                right--;
            }
        }
        return res;
    }
}