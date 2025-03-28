class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int requiredSum = target - nums[i];
            if (map.containsKey(requiredSum)){
                return new int[]{map.get(requiredSum), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}