class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = (int[])nums.clone();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i],i);
        }
        for(int i = 0; i < copy.length; i++) {
            res[i] = map.get(copy[i]);
        }
        return res;
    }
}