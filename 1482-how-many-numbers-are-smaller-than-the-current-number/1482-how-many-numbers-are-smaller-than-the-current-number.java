class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] temp = nums.clone();
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = map.get(temp[i]);
        }
        return res;
    }
}