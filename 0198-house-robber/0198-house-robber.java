class Solution {
    public int rob(int[] nums) {
        int oldState = 0, newState = 0;
        for (int num : nums) {
            newState = Math.max(num + oldState, oldState = newState);
        }
        return newState;
    }
}