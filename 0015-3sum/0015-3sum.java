class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate `i`

            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    res.add(List.of(nums[i], nums[j], nums[k])); // More efficient than Arrays.asList()
                    while (++j < k && nums[j] == nums[j - 1]); // Skip duplicate `j`
                    while (--k > j && nums[k] == nums[k + 1]); // Skip duplicate `k`
                }
            }
        }
        return res;
    }
}