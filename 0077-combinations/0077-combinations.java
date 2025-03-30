class Solution {
     public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(), res);
        return res;
    }

    public void backtrack(int n, int k, int index, List<Integer> current, List<List<Integer>> res) {
        if (current.size() == k) {
            res.add(new ArrayList<>(current));
            return;
        }
        if (index > n) {
            return;
        }

        // Include the current number
        current.add(index);
        backtrack(n, k, index + 1, current, res);
        current.remove(current.size() - 1);

        // Exclude the current number and move to the next
        backtrack(n, k, index + 1, current, res);
    }
}