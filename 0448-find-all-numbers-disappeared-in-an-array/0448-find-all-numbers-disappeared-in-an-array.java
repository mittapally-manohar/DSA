class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        //4,3,2,7,8,1
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}