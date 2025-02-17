class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int requiredNum = target - nums[i];
            if(map.containsKey(requiredNum)) {
                return new int[] {i, map.get(requiredNum)};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}