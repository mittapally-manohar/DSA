class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(n, 1, k, new ArrayList<Integer>(), res);
        return res;
    }

    public void backtrack(int n, int index, int k, List<Integer> current, List<List<Integer>> res) {
        if (k == current.size()) {
            res.add(new ArrayList<>(current));
            return;
        }
        if (index > n) {
            return;
        }
        current.add(index);
        backtrack(n, index+1, k, current, res);

        current.remove(current.size()-1);
        backtrack(n, index+1, k, current, res);
    }
}