class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length-1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low+1, high+1};
            } else if (sum > target) {
                high = high - 1;
            } else {
                low = low + 1;
            }
        }
        return new int[]{0, 0};
    }
}