class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] res = new int[nums.length];
       int[] copy = (int[])nums.clone();
       int[] count = new int[101];
       Arrays.fill(count,-1);
       Arrays.sort(nums);
       for(int i = 0; i < nums.length; i++) {
         if(count[nums[i]]==-1) {
            count[nums[i]] = i;
         }
       }
       for(int i = 0; i < copy.length; i++) {
        res[i] = count[copy[i]];
       }
       return res;
    }
}