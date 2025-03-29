class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1, k = n - 1;
        int[] res = new int[n];
        while (left <= right) {
            int rightSquare = nums[right] * nums[right];
            int leftSquare = nums[left] * nums[left];
            if (rightSquare > leftSquare) {
                res[k--] = rightSquare;
                right--;
            } else {
                res[k--] = leftSquare;
                left++;
            }
        }
        return res;
    }
}