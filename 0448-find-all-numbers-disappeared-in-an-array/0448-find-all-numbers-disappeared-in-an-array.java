class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
       for (int num : nums) {
           if ( num < 0 ){
               num = -1 * num;
           }
           int index = num - 1;
           if (nums[index] > 0) {
               nums[index] = -nums[index];
           }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                disappearedNumbers.add(i+1);
            }
        }
        return disappearedNumbers;
    }
}