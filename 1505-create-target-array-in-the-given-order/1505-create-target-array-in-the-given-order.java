class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int i =0;
        for(Integer e : list) {
            nums[i++] = e;
        }
        return nums;
    }
}