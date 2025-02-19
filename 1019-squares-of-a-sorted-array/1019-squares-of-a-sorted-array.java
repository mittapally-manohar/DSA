class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] res = new int[nums.length];
       for(int left = 0, right = nums.length-1, count = nums.length-1; left <= right;) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare > rightSquare) {
                res[count--] = leftSquare; left++;
            }else{
                res[count--] = rightSquare; right--;
            }
       }
       return res;
    }
}