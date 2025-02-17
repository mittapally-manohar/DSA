class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counter = new int[101];
        Arrays.fill(counter, -1);
        int[] result = new int[nums.length];
        int[] input = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(counter[nums[i]] == -1) {
                counter[nums[i]] = i;
            }
        }
        for(int i = 0; i < input.length; i++) {
            result[i] = counter[input[i]];
        }
        return result;
    }
}