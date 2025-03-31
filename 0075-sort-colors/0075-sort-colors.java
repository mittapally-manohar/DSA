class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length-1, mid=0;
        while (mid <= right) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                mid++;
                left++;
            } else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                mid++;
            }
        }
    }
}