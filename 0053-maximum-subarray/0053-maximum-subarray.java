class Solution {
    public int maxSubArray(int[] nums) {
       int maxSoFar = Integer.MIN_VALUE;
       int maxEndingHere = 0;
       for (int num : nums) {
            maxEndingHere = num + maxEndingHere;
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
       }
       return maxSoFar;
    }
}