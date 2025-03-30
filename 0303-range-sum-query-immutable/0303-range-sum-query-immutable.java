class NumArray {
    int[] arr ;

    public NumArray(int[] nums) {
        arr = nums.clone();
    }
    
    public int sumRange(int left, int right) {
        int sum = arr[left];
        for (int i = left+1; i <=right ;i++) {
            sum += arr[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */