class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(set.size() > k) {
                set.remove(nums[count++]);
            }
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}