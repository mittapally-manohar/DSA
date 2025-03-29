class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                seen.remove(nums[i-k-1]);
            }
            if (!seen.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}