class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i = 0;
        int j = n-1, k = n-1;
        while(i <= j) {
            int x = nums[i] * nums[i];
            int y = nums[j] * nums[j];
            if( x > y) {
                i++;
                res[k--] = x;
            }else {
                j--;
                res[k--] = y;
            }
        }
        return res;
    }
}