class Solution {
    public int[] sortedSquares(int[] nums) {
       List<Integer> squaredList = generateSortedSquares(nums);
        return squaredList.stream().mapToInt(i -> i).toArray();
    }
    public List<Integer> generateSortedSquares(int[] nums) {
        int left = 0, right = nums.length;
        
        // Binary search to find the first non-negative number
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                right = mid;
            } else {
                left = mid;
            }
        }

        List<Integer> result = new ArrayList<>();
        
        // Merge squares from left (negative side) and right (positive side)
        while (left >= 0 || right < nums.length) {
            if (left < 0) {
                result.add(nums[right] * nums[right]);
                right++;
            } else if (right >= nums.length) {
                result.add(nums[left] * nums[left]);
                left--;
            } else {
                int leftSquare = nums[left] * nums[left];
                int rightSquare = nums[right] * nums[right];
                if (leftSquare < rightSquare) {
                    result.add(leftSquare);
                    left--;
                } else {
                    result.add(rightSquare);
                    right++;
                }
            }
        }

        return result;
    }
}