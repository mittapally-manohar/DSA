class Solution {
    public int rob(int[] nums) {
        int oldState = 0, newState = 0; 
        for (int num : nums) {
            int curState = Math.max(num + oldState, newState);
            oldState = newState;
            newState = curState;
        }
        return newState;
    }
}