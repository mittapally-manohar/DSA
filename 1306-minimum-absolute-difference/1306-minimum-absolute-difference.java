class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
      int minDiff = Integer.MAX_VALUE;
         // Single loop to find min difference and collect pairs
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];

            if (diff < minDiff) {
                minDiff = diff;
                res.clear(); // New minimum found, clear old pairs
            }

            if (diff == minDiff) {
                res.add(List.of(arr[i - 1], arr[i])); // More memory efficient than Arrays.asList()
            }
        }
        return res;
    }
}