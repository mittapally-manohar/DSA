class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int low = 0, high = numbers.length - 1;
       for (int i = 0; i < numbers.length; i++) {
        int sum = numbers[low] + numbers[high];
        if (sum == target) {
            return new int[] {low+1, high+1};
        } else if (sum > target) {
            high--;
        } else {
            low++;
        }
       }
       return new int[]{0,0};
    }
}