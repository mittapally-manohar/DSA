class Solution {
    //[8,1,2,2,3]
    //[1,2,2,3,8]
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        int n = nums.length;
        int[] res = new int[n];
        int[] count = new int[101];
        Arrays.sort(nums);
        Arrays.fill(count, -1);
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