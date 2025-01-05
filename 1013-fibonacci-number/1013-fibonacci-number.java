class Solution {
    public int fib(int n) {
        int oldState = 0, newState = 1;
        for (int i = 0 ; i < n; i++) {
            int curState = oldState + newState;
            oldState = newState;
            newState = curState;
        }
        return oldState;
    }
}