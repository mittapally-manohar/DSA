class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff <= min) {
                if (diff < min) {
                    min = diff;
                    res.clear();
                }
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}