class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        int[] temp = nums.clone();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i],i);
        }
        for (int i = 0; i < n; i++) {
            res[i] = map.get(temp[i]);
        }
        return res;
    }
}