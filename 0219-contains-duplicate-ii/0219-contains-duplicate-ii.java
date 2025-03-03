class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(i-count > k) {
                set.remove(nums[count++]);
            }
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}