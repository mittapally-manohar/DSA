class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] temp = nums.clone();
        Arrays.sort(nums);
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            res[i] = map.get(temp[i]);
        }
        return res;
    }
}