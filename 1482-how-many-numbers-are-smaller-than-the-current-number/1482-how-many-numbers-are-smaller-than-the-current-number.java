class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int n = nums.length;
        int[] res = new int[n];
        int[] temp = nums.clone();
        Arrays.sort(temp);
        Arrays.fill(count,-1);
        for (int i = 0; i < n; i++) {
            if(count[temp[i]]==-1) {
                count[temp[i]]=i;
            }
        }
        for (int i = 0; i < n; i++) {
            res[i] = count[nums[i]];
        }

        return res;

    }
}