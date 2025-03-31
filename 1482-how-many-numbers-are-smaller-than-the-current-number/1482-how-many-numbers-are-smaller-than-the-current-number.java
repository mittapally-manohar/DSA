class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] count = new int[101];
        Arrays.fill(count, -1);
        int[] temp = nums.clone();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (count[nums[i]] == -1) {
                count[nums[i]] = i;
            }
        }
        for (int i = 0; i < n; i++) {
            res[i] = count[temp[i]];
        }
        return res;
    }
}