class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> elementToIndex = new HashMap<>();
       int n = nums.length;
       for (int i = 0; i < n; i++) {
        int requiredSum = target - nums[i];
        if (elementToIndex.containsKey(requiredSum)) {
            return new int[]{ elementToIndex.get(requiredSum), i};
        }
        elementToIndex.put(nums[i], i);
       }
       return new int[]{-1, -1};
    }
}