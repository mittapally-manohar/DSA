class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i-count > k) {
                seen.remove(nums[count++]);
            }
            if (!seen.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}