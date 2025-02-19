class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] counter = new int[101];
        Arrays.fill(counter, -1);
        int[] copy = (int[])nums.clone();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(counter[nums[i]] == -1){
            counter[nums[i]] = i;
            }
        }
        for(int i =0; i < copy.length; i++) {
            res[i] = counter[copy[i]];
        }
        return res;
    }
}