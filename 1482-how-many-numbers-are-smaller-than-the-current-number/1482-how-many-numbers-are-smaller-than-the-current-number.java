class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] counter = new int[101];
        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }
        for (int i = 1; i < 101; i++) {
            counter[i] = counter[i - 1] + counter[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = counter[nums[i] - 1];
            }
        }
        return res;
    }
}