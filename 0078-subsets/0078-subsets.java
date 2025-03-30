class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<Integer>(), res);
        return res;
    }

    public void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        backtrack(nums, index + 1, current, res);
        current.remove(current.size() - 1);
        backtrack(nums, index + 1, current, res);

    }
}