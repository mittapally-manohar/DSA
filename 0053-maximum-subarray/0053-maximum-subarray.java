class Solution {
    public int maxSubArray(int[] nums) {
       int maxSoFar = Integer.MIN_VALUE;
       int maxEndingHere = 0;
       for (int num : nums) {
            maxSoFar = Math.max(maxEndingHere = Math.max(num + maxEndingHere, num), maxSoFar);
       }
       return maxSoFar;
    }
}