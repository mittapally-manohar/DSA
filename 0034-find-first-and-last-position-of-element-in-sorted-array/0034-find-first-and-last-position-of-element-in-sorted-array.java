class Solution {
    public int[] searchRange(int[] nums, int target) {
       int l = find(nums, target, true);
       int r = find(nums, target, false);
       return new int[]{l, r};
    }

    public int find(int[] nums, int target, boolean isLeft) {
        int low = 0, high = nums.length - 1;
        int pos = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                pos = mid;
                if (isLeft) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return pos;
    }
}