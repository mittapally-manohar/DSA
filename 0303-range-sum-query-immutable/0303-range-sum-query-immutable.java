class NumArray {
    int[] sum ;

    public NumArray(int[] nums) {
        int n = nums.length;
        sum = nums.clone();
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i-1]+sum[i];
            System.out.print(sum[i]+" ");
        }
    }
    
    public int sumRange(int left, int right) {
        int totalSum = 0;
        if (left > 0) {
            totalSum -= sum[left-1];
        }
        totalSum += sum[right];
        return totalSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */