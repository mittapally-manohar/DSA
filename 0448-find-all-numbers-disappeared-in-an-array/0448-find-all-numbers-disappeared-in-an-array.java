class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        int n = nums.length;
        for (int num : nums) {
            seen.add(num);
        }
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}