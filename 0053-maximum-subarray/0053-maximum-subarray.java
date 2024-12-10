class Solution {
    public int maxSubArray(int[] nums) {
       int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
       for (int num : nums) {
        maxSoFar = Math.max(maxSoFar, maxEndingHere = Math.max(num + maxEndingHere, num));
       }
       return maxSoFar;
    }
}