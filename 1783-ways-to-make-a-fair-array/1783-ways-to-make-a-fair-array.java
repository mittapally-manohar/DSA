class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int[] evenPrefix = new int[n];
        int[] oddPrefix = new int[n];
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
            evenPrefix[i] = evenSum;
            oddPrefix[i] = oddSum;
        }

        int evenNewSum = 0, oddNewSum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenNewSum = evenPrefix[i] - nums[i] + oddSum - oddPrefix[i];
                oddNewSum = oddPrefix[i] + evenSum - evenPrefix[i];
            } else {
                evenNewSum = evenPrefix[i] + oddSum - oddPrefix[i];
                oddNewSum = oddPrefix[i] - nums[i] + evenSum - evenPrefix[i];
            }
            if (evenNewSum == oddNewSum) {
                count   ++;
            }
        }
        return count;
    }
}