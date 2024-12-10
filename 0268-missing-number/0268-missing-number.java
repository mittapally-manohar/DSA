class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = 0;
        int sum = 0;
        totalSum = ((nums.length+1) * (nums.length)) / 2;
        for(int num: nums){
            totalSum -= num;
        }
        return totalSum;
    }
}